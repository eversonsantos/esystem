package br.com.storeweb.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Restrictions;

import br.com.storeweb.dao.UsuarioDAO;
import br.com.storeweb.dominio.DominioSituacao;
import br.com.storeweb.model.Pessoa;
import br.com.storeweb.model.Usuario;

public class UsuarioService{
	
	private static UsuarioDAO dao = new UsuarioDAO();
	private Logger logger = Logger.getLogger(UsuarioService.class);
	
	
	public List<Usuario> listaUsuarios(){
		logger.info("Vai buscar todos os usuários");
		createUsuarios();
		return dao.findAllEntitys();
	}
	
	public Usuario getUsuario(Long codigo){
		return dao.findEntityByPk(codigo);
	}
	
	public Usuario getUsuarioByLoginSenha(String login, String senha){
		
		return (Usuario) dao.getSession().createCriteria(Usuario.class)
													.add(Restrictions.eq("", login))
													.add(Restrictions.eq("senha", senha))
													.uniqueResult();
	}
	
	public void criaUsuario(Usuario usuario){
		dao.saveEntity(usuario);
	}
	
	
	public static void createUsuarios(){
		
		for (int i = 0; i < 10; i++) {
			Usuario u = new Usuario();
//			u.setCodigo(Long.parseLong(""+i));
			u.setDtCadastro(new Date());
			u.setDhAtualizacao(new Date());
			u.setDsLogin("admin"+i);
			u.setCdSenha("admin"+i);
			u.setCdMatricula("USA-000"+i);
			u.setIdSit(DominioSituacao.ATIVO);
			u.setCdUsuarioAtulizador("admin"+i);
			
			Pessoa p = new Pessoa();
			p.setNome("Everson"+i);
			p.setNrCic("01407590260"+i);
			p.setIdSit(DominioSituacao.ATIVO);
			p.setDhAtualizacao(new Date());
			
			u.setPessoa(p);
			dao.saveEntity(u);
//			usuarios.add(u);
		}
	}
}
