package br.com.storeweb.ws;

import br.com.storeweb.service.MenuService;

import com.google.gson.Gson;

//@Path("menu")
public class MenuWs {

//	@Path("home")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
	public String getMenusSistema(){
		return new Gson().toJson(new MenuService().findAllEntitys());
	}
}
