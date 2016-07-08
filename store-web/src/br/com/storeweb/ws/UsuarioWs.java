package br.com.storeweb.ws;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.storeweb.model.Usuario;
import br.com.storeweb.service.UsuarioService;
import br.com.storeweb.util.ParseJsonToEntity;

import com.google.gson.Gson;


@Path("usuario")
public class UsuarioWs {

	private List<Usuario> usuarios;
	
	public void init(){
		this.usuarios = new ArrayList<Usuario>(new UsuarioService().findAllEntitys());
	}
	
	@Path("home")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllUsuarios(){
		this.init();
		return new Gson().toJson(this.usuarios);
	}
	
	@Path("login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void findUsuario(String json){
		Usuario u = new ParseJsonToEntity<Usuario>().fromJsonToEntity(json, Usuario.class);
				System.out.println(u.getCd_log_usu() + " - "+ u.getCd_snh_usu());
	}
	
}
