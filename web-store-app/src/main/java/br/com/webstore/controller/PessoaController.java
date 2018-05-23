package br.com.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.webstore.dominio.DominioEscolaridade;
import br.com.webstore.dominio.DominioEstCivil;
import br.com.webstore.dominio.DominioEstados;
import br.com.webstore.dominio.DominioGenero;
import br.com.webstore.dominio.DominioTipoPessoa;
import br.com.webstore.dominio.DominioTipoTelefone;
import br.com.webstore.model.Pessoa;
import br.com.webstore.services.PessoaService;
import br.com.webstore.validator.PessoaValidator;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private PessoaValidator pessoaValidator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(pessoaValidator);
	}
	
	
	@ModelAttribute("pessoa")
	public Pessoa initModelPessoa() {
		return new Pessoa();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPessoa( @ModelAttribute("pessoa") @Validated Pessoa pessoa, BindingResult result, RedirectAttributes model){
		if(result.hasErrors()) {
			model.addFlashAttribute("errors", result.getAllErrors());
			model.addFlashAttribute("pessoa", pessoa);
			return "redirect:/pessoa/cadastro";
		}
		pessoaService.save(pessoa);
		return "redirect:/pessoa/cadastros";
	}
	
	
	@RequestMapping("/cadastros")
	public String cadastros(ModelMap model) {
		model.addAttribute("pessoas", pessoaService.findAllOderByCodigo());
		return "/pessoa/list";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro(ModelMap model) {
		
		model.addAttribute("tiposPessoa", DominioTipoPessoa.values());
		model.addAttribute("generos", DominioGenero.values());
		model.addAttribute("estCivis", DominioEstCivil.values());
		model.addAttribute("escolaridades", DominioEscolaridade.values());
		model.addAttribute("tiposTelefone", DominioTipoTelefone.values());
		model.addAttribute("estados", DominioEstados.values());
		
		return "form";
	}
	
}
