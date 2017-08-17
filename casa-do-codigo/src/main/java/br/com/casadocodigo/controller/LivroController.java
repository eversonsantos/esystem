package br.com.casadocodigo.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.daos.LivroDAO;
import br.com.casadocodigo.model.Book;
import br.com.casadocodigo.type.TypeBook;
import br.com.casadocodigo.validator.BookValidator;

@Controller
@Transactional
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	LivroDAO livroDao;
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.setValidator(new BookValidator());
	}
	
	
	@RequestMapping(value = "/form")
	public ModelAndView init(){
		ModelAndView view = new ModelAndView("books/form");
		view.addObject("types", TypeBook.values());
		return view;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView getBooks(){
		ModelAndView view = new ModelAndView("books/list");
		view.addObject("livros", livroDao.getLista());
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
	public ModelAndView createBook(@Valid Book book, BindingResult bindingResult, RedirectAttributes attributes){
		ModelAndView view;

		if(bindingResult.hasErrors()){
			return init();
		}
		
		attributes.addFlashAttribute("sucesso", "Livro incluído com sucesso");
		livroDao.save(book);
		view = new ModelAndView("redirect:livros");
		return view;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Book getBook(@PathVariable("id") Long id){
		return livroDao.findBook(id);
	}
	
}
