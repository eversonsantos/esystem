package br.com.storeweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.storeweb.dao.EstadoDAO;
import br.com.storeweb.model.Estado;

public class EstadoService implements EstadoDAO{

	public Estado findEntityByPk(Long cd_pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveEntity(Estado entity) {
		// TODO Auto-generated method stub
		
	}

	public List<Estado> filter(Estado entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Estado> findAllEntitys() {
		List<Estado> estados = new ArrayList<Estado>();
		estados.add(new Estado(1L, "Par�", "PA"));
		estados.add(new Estado(2L, "Bahia", "BA"));
		estados.add(new Estado(3L, "Santa Catarina", "SC"));
		estados.add(new Estado(4L, "S�o Paulo", "SP"));
		estados.add(new Estado(5L, "Rio de Janeiro", "RJ"));
		return estados;
	}

	
	
}
