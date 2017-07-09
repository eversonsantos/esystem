package br.com.storeweb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.storeweb.service.ComboService;
import br.com.storeweb.service.EstadoService;
import br.com.storeweb.service.PaisService;

import com.google.gson.Gson;

@Path("combo")
public class CombosWs {
	
	@GET
	@Path("escolaridade")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListEscolaridade(){
		return new Gson().toJson(new ComboService().comboEscolaridade());
	}
	
	@GET
	@Path("estadocivil")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListEstadoCivil(){
		return new Gson().toJson(new ComboService().comboEstadoCivil());
	}
	
	@GET
	@Path("nacionalidade")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListNacionalidade(){
		return new Gson().toJson(new PaisService().findAllEntitys());
	}
	
	@GET
	@Path("uf")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListEstados(){
		return new Gson().toJson(new EstadoService().findAllEntitys());
	}

}
