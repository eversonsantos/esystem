package br.com.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.model.Book;

@Repository
public class LivroDAO {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Book book){
		manager.persist(book);
	}
	
}
