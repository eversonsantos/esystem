package br.com.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.webstore.services.PessoaService;

@Controller
public class HomeController {
	
	@Autowired
	private PessoaService pessoaService;

	@RequestMapping("/")
	public String init() {
		return "login";
	}
	
	@RequestMapping("/user/login")
	public String login(ModelMap model) {
		return this.home(model);
	}
	
	@RequestMapping("/home")
	public String home(ModelMap model) {
		return "home";
	}
}
