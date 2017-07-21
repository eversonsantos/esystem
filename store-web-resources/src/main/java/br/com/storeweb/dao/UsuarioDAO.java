package br.com.storeweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.storeweb.model.Usuario;
import br.com.storeweb.service.PersistenceService;

public class  UsuarioDAO extends PersistenceService<Usuario> {

	public UsuarioDAO() {
		super(Usuario.class);
		PersistenceService.getInstance();
	}
	
	

	@SuppressWarnings("unchecked")
	public List<Usuario> getListaUsuarios(){
		EntityManager manager = PersistenceService.getInstance();
		StringBuilder query = new StringBuilder();
		query.append("select u from Usuario u where u.idSit = 'AT'");
		return manager.createQuery(query.toString()).getResultList();
	}
	
	public int getSequence(){
		EntityManager manager = PersistenceService.getInstance();
		StringBuilder query = new StringBuilder();
		query.append("SELECT CAST(last_value AS INT) FROM dbo.tbl_usuario_cd_usua_seq");
		return (int)manager.createNativeQuery(query.toString()).getSingleResult();
	}
	
}
