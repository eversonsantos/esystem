package br.com.storeweb.ws;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.resteasy.spi.HttpResponse;

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
	
	@GET
	@Path("home")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllUsuarios(){
		this.init();
		return new Gson().toJson(this.usuarios);
	}
	
	@GET
	@Path("login/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String findUsuario(@PathParam("id") String login){
		this.init();
		for (Usuario usuario : usuarios) {
			if(usuario.getCd_log_usu().trim().equals(login)){
				return new Gson().toJson(usuario);
			}
		}
		return "";
	}
	@POST
	@Path("createUser")
	@Produces(MediaType.APPLICATION_JSON)
	public void createUser( String json){
		Usuario usuario = new ParseJsonToEntity<Usuario>().fromJsonToEntity(json, Usuario.class);
		System.out.println(usuario.toString());
	}
	
}
