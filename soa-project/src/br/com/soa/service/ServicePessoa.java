package br.com.soa.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.soa.model.Pessoa;
@WebService
public class ServicePessoa {
	
	public List<Pessoa> getListPessoas(char idSexo){
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Everson", 18, 'M'));
		pessoas.add(new Pessoa("Laercio", 21, 'M'));
		pessoas.add(new Pessoa("Tadeu", 23, 'M'));
		return pessoas;
	}

}
