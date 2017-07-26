package br.com.casadocodigo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	
	
	@RequestMapping("/home")
	public void index(){
		System.out.println("Olá Spring");
	}
}
