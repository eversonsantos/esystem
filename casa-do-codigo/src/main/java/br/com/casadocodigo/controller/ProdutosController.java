package br.com.casadocodigo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

	@RequestMapping(value = "create")
	public void createProduct(){
		System.out.println("criou produto");
	}
}
