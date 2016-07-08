package br.com.storeweb.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.com.storeweb.dao.UsuarioDAO;
import br.com.storeweb.model.Pessoa;
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
		List<Usuario> us = new ArrayList<>();
		Pessoa p = new Pessoa(1L, "Everson", "01407590260"); 
		Usuario u = new Usuario(1L, "admin", "123", p, new Date(), "USUA-0001");
		u.setCd_usu_atu("admin");
		us.add(u);
		return us;
	}

	
	
}
