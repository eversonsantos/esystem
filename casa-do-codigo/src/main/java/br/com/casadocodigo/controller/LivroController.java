package br.com.casadocodigo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.casadocodigo.daos.LivroDAO;
import br.com.casadocodigo.model.Book;

@Controller
@Transactional
public class LivroController {

	@Autowired
	LivroDAO livroDao;
	
	
	@RequestMapping(value = "/livro", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Book createBook(Book book){
		livroDao.save(book);
		return book;
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String goToFormLivro(){
		return "books/form";
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Book> getBooks(){
		return livroDao.getLista();
	}
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Book getBook(@PathVariable("id") Long id){
		return livroDao.findBook(id);
	}
}
