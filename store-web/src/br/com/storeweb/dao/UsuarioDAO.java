package br.com.storeweb.dao;

import org.hibernate.Session;

import br.com.storeweb.model.Usuario;
import br.com.storeweb.service.PersistenceService;

public class  UsuarioDAO extends PersistenceService<Usuario> {

	public UsuarioDAO() {
		super(Usuario.class);
		PersistenceService.getInstance();
	}
	
	public Session getSession(){
		return (Session) PersistenceService.getInstance().getDelegate();
	}
}
