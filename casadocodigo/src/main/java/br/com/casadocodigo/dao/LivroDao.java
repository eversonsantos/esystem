package br.com.casadocodigo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.model.Livro;


@Repository
@Transactional
public class LivroDao{

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Livro livro){
		manager.persist(livro);
	}
	
	public List<Livro> list(){
		return manager.createQuery("select distinct (l) from Livro l left join fetch l.precos order by l.id", Livro.class).getResultList();
	}
}
