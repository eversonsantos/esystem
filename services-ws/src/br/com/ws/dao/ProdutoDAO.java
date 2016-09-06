/**
 * 
 */
package br.com.ws.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ws.model.Historico;
import br.com.ws.model.Produto;

/**
 * @author totvs_esantos
 *
 */
public class ProdutoDAO {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ProdutoDAO() {
	}
	

	public ProdutoDAO(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public List<Produto> listaProduto(){
		List<Historico> precos = new ArrayList<>();
		precos.add(new Historico(new BigDecimal(0.25)));
		precos.add(new Historico(new BigDecimal(0.50)));
		precos.add(new Historico(new BigDecimal(0.75)));
		produtos.add(new Produto(1L, "Farinha", precos));
		produtos.add(new Produto(2L, "A�ucar", precos));
		produtos.add(new Produto(3L, "Caf�" , precos));
		produtos.add(new Produto(4L, "Leite" , precos));
		return produtos;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
