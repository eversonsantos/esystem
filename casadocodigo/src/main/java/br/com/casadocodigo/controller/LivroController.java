package br.com.casadocodigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.dao.LivroDao;
import br.com.casadocodigo.dominio.DominioLivro;
import br.com.casadocodigo.model.Livro;
import br.com.casadocodigo.validation.LivroValidator;


@RestController
@RequestMapping(value = "livro")
public class LivroController {

	@Autowired
	private LivroDao daoLivro;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.addValidators(new LivroValidator());
	}
	
	@RequestMapping("/form")
	public ModelAndView goForm(){
		ModelAndView view = new ModelAndView("livro/form");
		view.addObject("types", DominioLivro.values());
		return view;
	}
	
	@ResponseBody
	@RequestMapping(produces = "application/json", method = RequestMethod.GET)
	public ModelAndView carregaLivros(Model model){
		ModelAndView view = new ModelAndView("livro/lista");
		view.addObject("livros", daoLivro.list());
		return view;
	}
	
	@RequestMapping(value = "lista", method = RequestMethod.GET)
	public ResponseEntity<?> lista(){
		System.out.println("Passou aqui");
		return new ResponseEntity<List<Livro>>(daoLivro.list(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView createLivro(@Valid Livro livro,
									 BindingResult bindingResult,
									 RedirectAttributes attributes){
		if(bindingResult.hasErrors())
				return goForm();
		daoLivro.save(livro);
		attributes.addFlashAttribute("sucesso", "Livro incluído com sucesso!");
		return new ModelAndView("redirect:livro");
	}
}
