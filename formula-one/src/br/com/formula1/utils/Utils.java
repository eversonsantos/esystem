package br.com.formula1.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Utils {

	public  String parseFileToString(InputStream is){
		StringBuilder sb = new StringBuilder();
	    try {
	    	
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));

	        String linha = "";
	        while ((linha = bufferedReader.readLine()) != null) {
	        	sb.append(linha).append("\n");
	        }
	        bufferedReader.close();
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
		return sb.toString();
	}
	
	public  String removeCaracteres(String content){
		if(content == null){
			throw new IllegalArgumentException("Erro no método removeCaracteres, Parâmetro passado nullo");
		}
		content = content.replaceAll("[^a-zZ-Z0-9 ]", "");
		return content;
	}
	
	public  Double formataVelocidadeMedia(String velocidade){
		if(velocidade == null){
			throw new IllegalArgumentException("Erro no método formataVelocidadeMedia, Parâmetro passado nullo");
		}
		return Double.valueOf(velocidade.replaceAll(",", "."));
	}
	
	public  Double calculaVelocidadeMedia(Double vl, Integer nrVoltas){
		BigDecimal b = new BigDecimal(vl);
		if(nrVoltas > 0){
			return b.divide(new BigDecimal(nrVoltas), 3 , RoundingMode.DOWN).setScale(3, RoundingMode.DOWN).doubleValue();
		}
		return b.doubleValue();
	}
	
	public  String formataTempo(Calendar c){
		SimpleDateFormat sd = new SimpleDateFormat("m:ss:SSS");
		return sd.format(c.getTime());
	}
	
	public  long converteTempoEmMilisegundos(String sDate){
		int h = sDate.length() == 12 ? Integer.valueOf(sDate.substring(0, 1)) : 0;
		int m = sDate.length() == 12 ? Integer.valueOf(sDate.substring(3, 5)) : Integer.valueOf(sDate.substring(0, 1));
		int s = sDate.length() == 12 ? Integer.valueOf(sDate.substring(6, 8)) : Integer.valueOf(sDate.substring(2, 4));
		int ml =sDate.length() == 12 ? Integer.valueOf(sDate.substring(9, 12)) : Integer.valueOf(sDate.substring(5, 8));
		ml = ml + ((h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000));
		return  ml;
	}
	
	
	
	public Calendar converteMilisegundoDate(long lnMilisegundo){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lnMilisegundo);
		return c;
	}
	
}

