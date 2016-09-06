package br.com.storeweb.dao;

import java.io.Serializable;

public interface Dao<T> {
	
	T search(Serializable id);
	void persist(T entity);
	void remove(T entity);
}
