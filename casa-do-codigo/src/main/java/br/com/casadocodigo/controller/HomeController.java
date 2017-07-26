package br.com.casadocodigo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	
	
	@RequestMapping("/index")//(value = "/livro", produces = "application/json")
//	@ResponseBody
	public String index(){
//		Livro l = new Livro(1L, "Spring");
		return "home";
	}
	
	
}
