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
 * Implementar o Spring-Data para gerenciar conexão e as transações.
 * 
 * 
 * */
public class PersistenceService<T> implements GenericDAO<T, Long> {
	
	private static EntityManager manager;
	private Class<T> persistentClass;

	public PersistenceService(Class<T> persistClass) {
		this.persistentClass = persistClass;
	}
	
	public static EntityManager getInstance(){
		if(manager == null){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("storeweb");
			manager = factory.createEntityManager();
		}
		return manager;
	}
	


	@Override
	public T findEntityByPk(Long cd_pk) {
		return manager.find(persistentClass, cd_pk);
	}


	
	@Override
	public void saveEntity(T entity) {
			manager.getTransaction().begin();
		try {

			manager.persist(entity);
			manager.getTransaction().commit();
			manager.flush();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			throw new RuntimeException(e);
		}finally{
			
			if(manager.getTransaction().isActive()){
				manager.getTransaction().rollback();
			}
		}
		
	}


	@Override
	public List<T> filter(T entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAllEntitys() {
		Session session = (Session) manager.getDelegate();
		return session.createCriteria(persistentClass).list();
	}

	
	
}
