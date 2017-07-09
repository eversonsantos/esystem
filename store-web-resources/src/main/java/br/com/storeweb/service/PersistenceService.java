/**
 * 
 */
package br.com.storeweb.service;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import br.com.storeweb.dao.GenericDAO;

/**
 * @author totvs_esantos
 *
 */
/*
 * Implementar o Spring-Data para gerenciar conex�o e as transa��es.
 */
public class PersistenceService<T> implements GenericDAO<T, Long> {

	private static EntityManager manager;
	private Class<T> persistentClass;

	public PersistenceService(Class<T> persistClass) {
		this.persistentClass = persistClass;
	}

	public static EntityManager getInstance() {
		if (manager == null) {
			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("storeweb");
			manager = factory.createEntityManager();
		}
		return manager;
	}

	public void saveEntity(T entity) {
		manager.getTransaction().begin();
		try {

			manager.persist(entity);
			manager.getTransaction().commit();
			manager.flush();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {

			if (manager.getTransaction().isActive()) {
				manager.getTransaction().rollback();
			}
		}

	}


	@SuppressWarnings("unchecked")
	public List<T> findAllEntitys() {
		Session session = (Session) manager.getDelegate();
		return session.createCriteria(persistentClass).list();
	}

	public T findEntityByPk(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> filter(T entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
