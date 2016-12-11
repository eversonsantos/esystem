package br.com.form;

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
			throw new IllegalArgumentException("Parâmetro passado nullo");
		}
		content = content.replaceAll("[^a-zZ-Z0-9 ]", "");
		return content;
	}
	
	public  Double formataVelocidadeMedia(String velocidade){
		return Double.valueOf(velocidade.replaceAll(",", "."));
	}
	
	public  Double calculaVelocidadeMedia(Double vl, Integer nrVoltas){
		BigDecimal b = new BigDecimal(vl);
		return b.divide(new BigDecimal(nrVoltas), 3 , RoundingMode.DOWN).setScale(3, RoundingMode.DOWN).doubleValue();
	}
	
	public  long calculaTempoToltaldeProvaEmMilisegundgo(Calendar cFistLap, Calendar cLastLap, Calendar cTmUltimaVolta){
		return (converteTempoEmMilisegundos(cLastLap, Formato.HH_MM_SS_SSS) + converteTempoEmMilisegundos(cTmUltimaVolta, Formato.MM_SS_SSS)) - converteTempoEmMilisegundos(cFistLap, Formato.HH_MM_SS_SSS);
	}
	
	public  String calculaDiferencaDeTempo(Calendar tmBegin, Calendar tmEnd){
		long millisecond = 0L;
		millisecond = (converteTempoEmMilisegundos(tmEnd, Formato.HH_MM_SS_SSS) - converteTempoEmMilisegundos(tmBegin, Formato.HH_MM_SS_SSS));
		Calendar c = tmBegin;
		c.setTimeInMillis(millisecond);
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss:SSS");
		return sd.format(c.getTime());
	}
	
	
	public  String formataTempo(Calendar c){
		SimpleDateFormat sd = new SimpleDateFormat("mm:ss:SSS");
		return sd.format(c.getTime());
	}
	
	public  long converteTempoEmMilisegundos(Calendar c, Formato formato){
		long milisecond = 0L;
		if(Formato.HH_MM_SS_SSS.equals(formato)){
			milisecond = c.get(Calendar.MILLISECOND) + ((c.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000) + (c.get(Calendar.MINUTE) * 60 * 1000) + (c.get(Calendar.SECOND) * 1000));
			return  milisecond;
		}
		milisecond = c.get(Calendar.MILLISECOND) + ((c.get(Calendar.MINUTE) * 60 * 1000) + (c.get(Calendar.SECOND) * 1000));
		return  milisecond;
	}
	
	public Calendar converteMilisegundoDate(long lnMilisegundo){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lnMilisegundo);
		return c;
	}
	
	public  Calendar parseStringToTempo(String sDate){
		Calendar calendar = Calendar.getInstance();
//		System.out.println(sDate);
		if(sDate.length() == 12){
			calendar.set(Calendar.HOUR_OF_DAY,Integer.valueOf(sDate.substring(0, 2)));
			calendar.set(Calendar.MINUTE,Integer.valueOf(sDate.substring(3, 5)));
			calendar.set(Calendar.SECOND,Integer.valueOf(sDate.substring(6, 8)));
			calendar.set(Calendar.MILLISECOND,Integer.valueOf(sDate.substring(9, 12)));
		}
		if(sDate.length() == 8){
			calendar.set(Calendar.MINUTE,Integer.valueOf(sDate.substring(0, 1)));
			calendar.set(Calendar.SECOND,Integer.valueOf(sDate.substring(2, 4)));
			calendar.set(Calendar.MILLISECOND,Integer.valueOf(sDate.substring(5, 8)));
		}
		return calendar;
	}
		
}

