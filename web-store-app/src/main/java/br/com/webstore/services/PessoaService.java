package br.com.webstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.webstore.model.Pessoa;
import br.com.webstore.repository.PessoaRepository;

@Service
@Transactional
public class PessoaService {

	@Autowired
	private PessoaRepository pRepository;

	public void save(Pessoa p){
		pRepository.save(p);
	}
	
	public List<Pessoa> findAll(){
		return this.pRepository.findAll();
	}

	public List<Pessoa> findAllOderByNome() {
		return this.pRepository.findAllOderByNome();
	}
	
}
