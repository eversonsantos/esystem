package br.com.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.webstore.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	@Query("select p from Pessoa p order by p.nmPes")
	public List<Pessoa> findAllOderByNome();
}
		
