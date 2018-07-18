package br.com.sw.resources;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sw.exception.ResourceNotFoundException;
import br.com.sw.model.Membro;
import br.com.sw.repository.MembroRepository;

@RestController
@RequestMapping("/membros")
public class MembroResources {

	@Autowired
	private MembroRepository pessoaRepository;
	
	@GetMapping
	public ResponseEntity<?> listAll(){
		return new ResponseEntity<>(pessoaRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "{id}")
	public ResponseEntity<?> find(@PathVariable("id") Long id){
		Optional<Membro> optional = pessoaRepository.findById(id);
		if(!optional.isPresent())
			throw new ResourceNotFoundException("Não possivel encontrar o membro com id-"+id);
		return new ResponseEntity<>(optional.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Membro membro) {
		membro.setAtualizacao(new Date());
		return new ResponseEntity<>(pessoaRepository.save(membro), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Membro membro) {
		return new ResponseEntity<>(pessoaRepository.saveAndFlush(membro), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		pessoaRepository.deleteById(id);
		return new ResponseEntity<>("Pessoa removida com sucesso", HttpStatus.OK);
	}
}
