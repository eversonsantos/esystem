package br.com.storeweb.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.com.storeweb.dao.PaisDAO;
import br.com.storeweb.model.Pais;
import br.com.storeweb.model.Pessoa;
import br.com.storeweb.model.PessoaFisica;
import br.com.storeweb.model.Usuario;

public class PaisService implements PaisDAO{

	@Override
	public Pais findEntityByPk(Long cd_pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEntity(Pais entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pais> filter(Pais entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pais> findAllEntitys() {
		List<Pais> paises = new ArrayList<Pais>();
		paises.add(new Pais(1L, "Brasil", "Brasileiro(a)"));
		paises.add(new Pais(2L, "Mexico", "Mexicano(a)"));
		paises.add(new Pais(3L, "Argentina", "Argentino(a)"));
		paises.add(new Pais(4L, "Chile", "Chileno(a)"));
		return paises;
	}

	
	
}
