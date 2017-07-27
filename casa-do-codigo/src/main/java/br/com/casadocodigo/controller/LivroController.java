package br.com.casadocodigo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.casadocodigo.daos.LivroDAO;
import br.com.casadocodigo.model.Book;

@Controller
@Transactional
public class LivroController {

	@Autowired
	LivroDAO livroDao;
	
	@RequestMapping(value = "/livro", method = RequestMethod.POST)
	public String createBook(@RequestBody Book book){
		livroDao.save(book);
		return "ok";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String goToFormLivro(){
		return "books/form";
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> getBooks(){
		List<Book> books = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			books.add(new Book(1L, "l"+i, "l"+i, "l"+i, i, new BigDecimal(i)));
		}
		return books;
	}
}
