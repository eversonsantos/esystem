package br.com.storeweb.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.storeweb.dto.UsuarioDTO;
import br.com.storeweb.model.Usuario;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


@Path("usuario")
public class UsuarioWs {

	private List<Usuario> usuarios = new ArrayList<>();
	
	@GET
	@Path("login/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String findUsuario(@PathParam("id") String login){
		for (Usuario usuario : usuarios) {
			if(usuario.getCd_log_usu().trim().equals(login)){
				return new Gson().toJson(usuario);
			}
		}
		return "";
	}
	
	@GET
	@Path("lista")
	@Produces
	public String listaUsuarios(){
		return new Gson().toJson(usuarios);
	}
	
	@POST
	@Path("createUser")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createUser( String json) throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		UsuarioDTO dto = mapper.readValue(json, UsuarioDTO.class);
		this.usuarios.add(this.createUsuario(dto));
	}
	
	public Usuario createUsuario(UsuarioDTO dto){
		Usuario usuario = dto.getUsuario();
		dto.getPessoa().setCd_pfi(dto.getPessoaFisica());
		dto.getPessoa().setCd_end(dto.getEndereco());
		dto.getPessoa().getCd_con().getTelefones().addAll(dto.getTelefones());
		usuario.setCd_pes(dto.getPessoa());
		return usuario;
	}
	
	
	
}
