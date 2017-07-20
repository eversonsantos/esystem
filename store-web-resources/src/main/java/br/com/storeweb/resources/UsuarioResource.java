package br.com.storeweb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.storeweb.model.Usuario;
import br.com.storeweb.service.UsuarioService;

import com.google.gson.Gson;

/*
 * Implementar o Spring-Rest
 * 
 * */
@Path("usuario")
public class UsuarioResource {

	private UsuarioService usuarioService = new UsuarioService(); 
	
	@GET
	@Path("login/{login}/{senha}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario autenticaUsuario (@PathParam("login") String login, 
								@PathParam("senha") String senha){
		Usuario usuario = usuarioService.getUsuarioByLoginSenha(login, senha);
		
		if(usuario == null){
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return usuario;
	}
	
	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listaUsuarios(){
		return Response.ok(new Gson().toJson(usuarioService.listaUsuarios())).build();
	} 
	
	@GET
	@Path("user/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuario(@PathParam("codigo") long codigo){
		Usuario usuario = usuarioService.getUsuario(codigo);
		if(usuario == null){
			return Response.status(Status.NOT_FOUND).entity("Usuário com o código informado, não encontrado").build();
		}
		return Response.ok(new Gson().toJson(usuario), MediaType.APPLICATION_JSON).build();
	}
	
	@POST
	@Path("create")
	@Produces(MediaType.APPLICATION_XML)
	public Response criaUsuario(String json){
		Usuario usuario = null;
		try {
			usuario = new Gson().fromJson(json, Usuario.class);
			usuarioService.criaUsuario(usuario);
			return Response.status(Status.CREATED).entity("Usuário criado com sucesso!").build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao criar usuario ").build();
		}
		
	}
	
}
