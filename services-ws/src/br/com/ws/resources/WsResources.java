/**
 * 
 */
package br.com.ws.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.ws.dao.ProdutoDAO;
import br.com.ws.model.Produto;
import br.com.ws.model.Produtos;

/**
 * @author totvs_esantos
 *
 */
@Path("ws-resources")
public class WsResources {

	List<Produto> ps = new ArrayList<Produto>();
	ProdutoDAO pDao = new ProdutoDAO(ps);
	Produto p = new Produto();
	String xml = new Gson().toJson(pDao.listaProduto());
	@GET
	@Path("sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(){
		System.out.println("JSON :"+xml);
		return xml;
	}
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("produtos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> lista(){
		ps = new Gson().fromJson(xml, List.class);
		return ps;
	}


	@SuppressWarnings("unchecked")
	@POST
	@Path("createProduto")
	@Produces(MediaType.APPLICATION_JSON)
	public void createProduto(String json) throws IOException{
		System.out.println(json);
		this.parseArrayJSonProduto(new Gson().fromJson(json, JsonArray.class));
//		ps = new Gson().fromJson(json, List.class);
//		xml = new Gson().toJson(ps);
	}
	
	private List<Produto> parseArrayJSonProduto(JsonArray jsonArray) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		Gson gson = new Gson();
		Produto produto = null;
		
		for(JsonElement element : jsonArray){
			System.out.println("element " + element);
			produto = gson.fromJson(element, Produto.class);
			produtos.add(produto);
		}
		return produtos;
	}
	
}
