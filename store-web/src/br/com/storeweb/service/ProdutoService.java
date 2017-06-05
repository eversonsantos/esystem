package br.com.storeweb.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.storeweb.dao.ProdutoDAO;
import br.com.storeweb.model.Produto;

public class ProdutoService implements ProdutoDAO{

	
	@Override
	public Produto findEntityByPk(Long cd_pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEntity(Produto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> filter(Produto entity, Map<String, String> parm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findAllEntitys() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1L, "Farinha", new BigDecimal(4.5)));
		produtos.add(new Produto(2L, "Cafe", new BigDecimal(3.25)));
		produtos.add(new Produto(3L, "Açuca", new BigDecimal(1.5)));
		produtos.add(new Produto(4L, "Manteiga", new BigDecimal(5)));
		return produtos;
	}
	
	
	
}
