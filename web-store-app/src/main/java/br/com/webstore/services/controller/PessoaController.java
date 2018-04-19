package br.com.webstore.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.webstore.services.model.Pessoa;
import br.com.webstore.services.repository.PessoaRepository;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired
	private PessoaRepository pRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Pessoa> findAll(){
		return pRepository.findAllOderByNome();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	@ResponseBody
	public Pessoa createPessoa(@RequestBody Pessoa pessoa){
		pRepository.save(pessoa);
		return pessoa;
	}
	
}
