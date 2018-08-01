package br.com.sw.resources;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import br.com.sw.model.Personagem;
import br.com.sw.repository.MembroRepository;

@CrossOrigin
@RestController
@RequestMapping("/membros")
public class MembroResources {

	@Autowired
	private MembroRepository membrosRepository;
	
	@GetMapping
	public ResponseEntity<?> listAll(){
		return new ResponseEntity<>(membrosRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> find(@PathVariable("id") Long id){
		Optional<Membro> optional = membrosRepository.findById(id);
		if(!optional.isPresent())
			throw new ResourceNotFoundException("Não possivel encontrar -"+id);
		return new ResponseEntity<>(optional.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Membro membro) {
		
		membro.setAtualizacao(new Date());
		for(Personagem personagem : membro.getPersonagens())
			personagem.setMembro(membro);
		membrosRepository.save(membro);
		Membro savedMembro = this.membrosRepository.findById(membro.getCodigo()).get();
		return new ResponseEntity<>(savedMembro, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Membro membro) {
		return new ResponseEntity<>(membrosRepository.saveAndFlush(membro), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deleteById/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		membrosRepository.deleteById(id);
		return new ResponseEntity<>("Operação realizada com sucesso", HttpStatus.OK);
	}
	
}
