package br.com.storeweb.test;

import java.io.IOException;
import java.text.ParseException;

import br.com.storeweb.service.UsuarioService;

public class Run {

	public static void main(String[] args) throws IOException, ParseException{
		
		UsuarioService service = new UsuarioService();
		service.createUsuarios();
		
	}

}
