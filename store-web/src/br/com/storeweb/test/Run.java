package br.com.storeweb.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import br.com.storeweb.dto.UsuarioDTO;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Run {

	public static void main(String[] args) throws IOException, ParseException{
		
		byte[] jsonData = Files.readAllBytes(Paths.get("jsontxt.txt"));
		ObjectMapper mapper = new ObjectMapper();
		
		UsuarioDTO dto = mapper.readValue(jsonData, UsuarioDTO.class);
		
		System.out.println(dto.toString());
//		String d = "23/11/1989";
////		d = d.replaceAll("/", "");
//		System.out.println(d);
//		Date date = null;
//		date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
//		
//		System.out.println(date);
	}

}
