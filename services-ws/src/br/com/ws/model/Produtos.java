/**
 * 
 */
package br.com.ws.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

/**
 * @author totvs_esantos
 *
 */
public class Produtos {

	List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public String toXML(){
		return new XStream().toXML(this);
	}
	
	public String toJson(){
		return new Gson().toJson(this);
	}
	
}
