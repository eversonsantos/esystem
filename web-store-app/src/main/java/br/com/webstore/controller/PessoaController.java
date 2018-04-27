package br.com.webstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.webstore.dominio.DominioCargo;
import br.com.webstore.dominio.DominioEscolaridade;
import br.com.webstore.dominio.DominioEstCivil;
import br.com.webstore.dominio.DominioGenero;
import br.com.webstore.dominio.DominioTipoPessoa;
import br.com.webstore.model.Endereco;
import br.com.webstore.model.Pessoa;
import br.com.webstore.services.PessoaService;
import br.com.webstore.validator.EnderecoValidator;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private EnderecoValidator endValidator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(endValidator);
	}
	
	
	@ModelAttribute("endereco")
	public Endereco criaModelPessoa() {
		return new Endereco();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPessoa(Pessoa pessoa){
		pessoaService.save(pessoa);
		return "redirect:/pessoa/cadastros";
	}
	
	@RequestMapping(value = "/endereco")
	public String submitEndereco(@ModelAttribute("endereceo") @Validated Endereco endereco, BindingResult result, RedirectAttributes model){
		if(result.hasErrors()) {
			model.addFlashAttribute("errors", result.getAllErrors());
			return "";
		}
		return "";
	}
	
	
	
	@RequestMapping("/cadastros")
	public String cadastros(ModelMap model) {
		model.addAttribute("cargos", DominioCargo.values());
		model.addAttribute("pessoas", pessoaService.findAllOderByCodigo());
		return "/pessoa/list";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro(ModelMap model) {
		model.addAttribute("tiposPessoa", DominioTipoPessoa.values());
		model.addAttribute("generos", DominioGenero.values());
		model.addAttribute("estCivis", DominioEstCivil.values());
		model.addAttribute("escolaridades", DominioEscolaridade.values());
		return "form";
	}
	
}
