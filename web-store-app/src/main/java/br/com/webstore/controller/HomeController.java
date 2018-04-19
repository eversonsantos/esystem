package br.com.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String init() {
		return "login";
	}
	
	@RequestMapping("/user/login")
	public String login() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
