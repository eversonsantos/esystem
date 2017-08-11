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
		Query q = manager.createQuery("select distinct(b) from Book b join fetch b.prices");
		return q.getResultList();
	}
	
	public Book findBook(Long id){
		return manager.find(Book.class, id);
	}
	
}
