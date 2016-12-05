package br.com.formula1.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.com.formula1.model.Piloto;
import br.com.formula1.model.Volta;


public class Utils {

	public static String parseFileToString(String path){
		File file = new File(path);
		StringBuilder sb = new StringBuilder();
	    try {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

	        String linha = "";
	        while ((linha = bufferedReader.readLine()) != null) {
	        	sb.append(linha).append("\n");
	        }
	        bufferedReader.close();
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
//	    System.out.println(sb.toString().substring(0, 18).trim()); //Tempo total prova
//	    System.out.println(sb.toString().substring(19, 22).trim());//Código Piloto
//	    System.out.println(sb.toString().substring(24, 44).trim());//Piloto
//	    System.out.println(sb.toString().substring(45, 51).trim());//Nº volta
//	    System.out.println(sb.toString().substring(50, 57).trim());//Tempo Volta
//	    System.out.println(sb.toString().substring(70, 77).trim());//Velocidade Média
		return sb.toString();
	}
	
	public static List<Volta> parseStringToVoltas(String content){
		List<Volta> voltas = new ArrayList<Volta>();
		
		return voltas;
	}
	
	
}