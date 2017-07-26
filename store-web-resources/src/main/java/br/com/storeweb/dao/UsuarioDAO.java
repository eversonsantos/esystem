package br.com.storeweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;

import br.com.storeweb.model.Usuario;
import br.com.storeweb.service.PersistenceService;

public class  UsuarioDAO extends PersistenceService<Usuario> {

	private Logger logger = Logger.getLogger(getClass());
	
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
	
	private int getLastSequence(){
		EntityManager manager = PersistenceService.getInstance();
		StringBuilder query = new StringBuilder();
		query.append("SELECT CAST(last_value AS INT) FROM dbo.tbl_usuario_cd_usua_seq");
		return (int)manager.createNativeQuery(query.toString()).getSingleResult();
	}
	
	public String geraMatriculaUsuario(){
		int ultimoSequence = this.getLastSequence();
		logger.info("Gerando matricula para o sequence "+ ultimoSequence);
		if(ultimoSequence > 1 && ultimoSequence <= 9)
			return "USU-0000"+ultimoSequence;
		if(ultimoSequence >=10 && ultimoSequence <= 99)
			return "USU-000"+ultimoSequence;
		if(ultimoSequence >=100 && ultimoSequence <= 999)
			return "USU-00"+ultimoSequence;
		if(ultimoSequence >=1000 && ultimoSequence <= 9999)
			return "USU-0"+ultimoSequence;
		if(ultimoSequence >=10000)
			return "USU-"+ultimoSequence;
		
		return "USU-0000"+ultimoSequence;
	}
	
}
