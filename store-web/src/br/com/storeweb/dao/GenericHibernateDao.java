package br.com.storeweb.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.hibernate.Session;

public class GenericHibernateDao<T> implements Dao<T> {

	private EntityManager session;
	private Class<T> persistentClass;
	
	public GenericHibernateDao(EntityManager session, Class persistentClass) {
		this.session = session;
		this.persistentClass = persistentClass;
	}	

	@Override
	public T search(Serializable id) {
		return session.find(persistentClass, id);
	}	

	@Override
	public void persist(T entity) {
		session.persist(entity);
	}

	@Override
	public void remove(T entity) {
		session.remove(entity);
	}
	
	
	
}
