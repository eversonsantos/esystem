package br.com.webstore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.webstore.dominio.DominioCargo;
import br.com.webstore.dominio.DominioEscolaridade;
import br.com.webstore.dominio.DominioEstCivil;
import br.com.webstore.dominio.DominioGenero;
import br.com.webstore.dominio.DominioTipoPessoa;
import br.com.webstore.model.Pessoa;
import br.com.webstore.services.PessoaService;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPessoa(Pessoa pessoa){
		pessoaService.save(pessoa);
		return "redirect:/pessoa/cadastros";
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
