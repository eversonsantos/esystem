package br.com.casadocodigo.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.model.Book;

@Repository
public class LivroDAO {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Book book){
		manager.persist(book);
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> getLista(){
		Query q = manager.createQuery("select b from book b");
		return q.getResultList();
	}
	
	public Book findBook(Long id){
		return manager.find(Book.class, id);
	}
	
}
