package br.com.storeweb.service;

import java.util.List;
import java.util.Map;

import br.com.storeweb.dao.UsuarioDAO;
import br.com.storeweb.model.Usuario;

public class UsuarioService implements UsuarioDAO{

	@Override
	public Usuario findEntityByPk(Long cd_pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEntity(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> filter(Usuario entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllEntitys() {
		return null;
	}

	
	
}
