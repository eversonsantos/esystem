package br.com.storeweb.ws;

import br.com.storeweb.service.ProdutoService;

import com.google.gson.Gson;

//@Path("produto")
public class ProdutoWs {

	
//	@GET
//	@Path("principal")
//	@Produces(MediaType.APPLICATION_JSON)
	public String getListaProduto(){
		return new Gson().toJson(new ProdutoService().findAllEntitys());
	}
	
	public String toFormProduto(){
		return null;
	}
}
