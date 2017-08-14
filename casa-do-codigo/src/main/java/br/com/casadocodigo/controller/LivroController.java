package br.com.casadocodigo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.daos.LivroDAO;
import br.com.casadocodigo.model.Book;
import br.com.casadocodigo.type.TypeBook;

@Controller
@Transactional
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	LivroDAO livroDao;
	
	
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView goToFormLivro(){
		ModelAndView view = new ModelAndView("books/form");
		view.addObject("types", TypeBook.values());
		return view;
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelAndView getBooks(){
		ModelAndView view = new ModelAndView("books/list");
		view.addObject("livros", livroDao.getLista());
		return view;
	}
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Book getBook(@PathVariable("id") Long id){
		return livroDao.findBook(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
	public String createBook(Book book, RedirectAttributes attributes){
		attributes.addFlashAttribute("sucesso", "Livro incluído com sucesso");
		livroDao.save(book);
		return "redirect:lista";
	}
}
