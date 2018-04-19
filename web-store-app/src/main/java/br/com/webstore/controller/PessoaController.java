package br.com.webstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.webstore.model.Pessoa;
import br.com.webstore.services.PessoaService;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Pessoa> findAll(){
		return pessoaService.findAllOderByNome();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	@ResponseBody
	public Pessoa createPessoa(@RequestBody Pessoa pessoa){
		pessoaService.save(pessoa);
		return pessoa;
	}
	
}
