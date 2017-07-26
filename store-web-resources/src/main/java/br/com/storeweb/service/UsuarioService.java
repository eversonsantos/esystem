package br.com.storeweb.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.storeweb.dao.UsuarioDAO;
import br.com.storeweb.dominio.DominioSituacao;
import br.com.storeweb.model.Pessoa;
import br.com.storeweb.model.Usuario;

public class UsuarioService{
	
	private static UsuarioDAO dao = new UsuarioDAO();
	private Logger logger = Logger.getLogger(UsuarioService.class);
	
	
	public List<Usuario> listaUsuarios(){
		logger.info("Criando dez usuários");
		createUsuarios();
		logger.info("Vai buscar todos os usuários");
		return dao.getListaUsuarios();
	}
	
	public Usuario getUsuario(Long codigo){
		return dao.findEntityByPk(codigo);
	}
	
	public Usuario getUsuarioByLoginSenha(String login, String senha){
		
		return null;
	}
	
	public void criaUsuario(Usuario usuario){
		dao.saveEntity(usuario);
	}
	
	
	
	
	public static void createUsuarios(){
		
		for (int i = 0; i < 10; i++) {
			Usuario u = new Usuario();
			u.setDtCadastro(new Date());
			u.setDhAtualizacao(new Date());
			u.setDsLogin("admin"+i);
			u.setCdSenha("admin"+i);
			u.setCdMatricula(dao.geraMatriculaUsuario());
			u.setIdSit(DominioSituacao.ATIVO.getValue());
			u.setCdUsuarioAtulizador("admin"+i);
			
			Pessoa p = new Pessoa();
			p.setNome("Everson"+i);
			p.setNrCic("01407590260"+i);
			p.setIdSit(DominioSituacao.ATIVO.getValue());
			p.setDhAtualizacao(new Date());
			
			u.setPessoa(p);
			dao.saveEntity(u);
//			usuarios.add(u);
		}
	}
}
