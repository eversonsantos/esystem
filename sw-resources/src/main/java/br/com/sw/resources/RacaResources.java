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
import br.com.sw.model.Raca;
import br.com.sw.repository.RacaRepository;

@CrossOrigin
@RestController
@RequestMapping("/racas")
public class RacaResources {

	@Autowired
	private RacaRepository racaRepository;
	
	@GetMapping
	public ResponseEntity<?> listAll(){
		return new ResponseEntity<>(racaRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> find(@PathVariable("id") Long id){
		Optional<Raca> optional = racaRepository.findById(id);
		if(!optional.isPresent())
			throw new ResourceNotFoundException("Não possivel encontrar "+id);
		return new ResponseEntity<>(optional.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Raca membro) {
		membro.setAtualizacao(new Date());
		return new ResponseEntity<>(racaRepository.save(membro), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Raca membro) {
		return new ResponseEntity<>(racaRepository.saveAndFlush(membro), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deleteById/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		racaRepository.deleteById(id);
		return new ResponseEntity<>("Operação realizada com sucesso", HttpStatus.OK);
	}
	
}
