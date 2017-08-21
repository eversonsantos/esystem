package br.com.casadocodigo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.casadocodigo.dao.GenericDao;
import br.com.casadocodigo.dao.LivroDao;
import br.com.casadocodigo.dominio.LivroDominio;
import br.com.casadocodigo.model.Livro;
import br.com.casadocodigo.model.Preco;


@Controller
@RequestMapping(value = "livro")
public class LivroController {

//	@Autowired
//	private LivroDao daoLivro;
	
	@RequestMapping("/form")
	public String goForm(){
		return "livro/form";
	}
	
	@ResponseBody
	@RequestMapping(value = "/lista", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public ResponseEntity<?> carregaLivros(){
		List<Livro> livros = new ArrayList<Livro>();
		
		for (int i = 0; i < 10; i++) {
			Livro l = new Livro();
			l.setTitulo("Curso Spring");
			l.setDescricao("Curso de Spring MVC dá casa do código/alura");
			l.setId(Long.parseLong(""+i));
			l.setNumeroPaginas(i+5);
			Preco p = new Preco();
			p.setLivroTipo(LivroDominio.COMBO);
			p.setPreco(new BigDecimal((35.32+i)));
			l.getPrecos().add(p);
			livros.add(l);
		}
		
		if(livros == null || livros.isEmpty()) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(livros);
	}
}
