/**
 * 
 */
package br.com.ws.resources;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ws.dao.ProdutoDAO;
import br.com.ws.model.Historico;
import br.com.ws.model.Produto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
	
	@POST
	@Path("createProduto")
	@Produces(MediaType.APPLICATION_JSON)
	public void createProduto(String json) throws IOException{
		//System.out.println(json);
//		 Type listType = new TypeToken<List<Produto>>() {}.getType();
		 List<Produto> produtos = new ParseJsonToEntity<Produto>().toObjectList(json, Produto.class);
		 
//		 Produto produto = new ParseJsonToEntity<Produto>().toObject(json, Produto.class);//new Gson().fromJson(json, Produto.class);
		 
		 for (Produto produto : produtos) {
			for (Historico h : produto.getPrecos()) {
				System.out.println(produto.getNome()+" "+ produto.getId()+ " "+ produto.getPrecos().size());
			}
		}
		//this.parseArrayJSonProduto(new Gson().fromJson(json, JsonArray.class));
//		ps = new Gson().fromJson(json, List.class);
//		xml = new Gson().toJson(ps);
	}
	
}
