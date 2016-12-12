package br.com.formula1.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.MillisDurationField;

public class Teste {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String sb = "";
				
//		sb = Utils.parseFileToString(new FileInputStream(new File("C:\\Users\\Everson\\Desktop\\log_corrida.txt")));
//
//		List<Piloto> p = new PilotoService().parseStringToPilotos(sb);
//		List<Piloto> p = new ArrayList<Piloto>();
//		p.addAll(new PilotoService().parseStringToPilotos(sb));
//		for (Piloto piloto : p) {
//			System.out.println(p.toString());
//		}
//		Calendar c = Calendar.getInstance();
//		String tempo = "";
//		System.out.println();
		
//		Double d = 8.69075;
//		BigDecimal b = new BigDecimal(d);
//		System.out.println(b.setScale(3, RoundingMode.DOWN));
//		for (int i = 0; i < p.size(); i++) {
//			for (int j = 1; j < p.size(); j++) {
//				if(p.get(i).getVoltas().size() < p.get(j).getVoltas().size()){
//				  p.get(i).setNrPosicao((i+1));
//				}else if(p.get(i).getVlMediaDuranteCorrida() > p.get(j).getVlMediaDuranteCorrida()){
//				  p.get(i).setNrPosicao((p.get(i).getNrPosicao() + 1));
//				}
//			}
//		}
//		for (Piloto piloto : p) {
//			System.out.println(piloto.getNmPil() + " - " +piloto.getNrPosicao());
//		}
//		int hour = 0;
//		int minute = 3;
//		int second = 30;
//		long millisecond = 500L;
//		
//		Calendar c = Calendar.getInstance();
//		Calendar c2 = Calendar.getInstance();
//		
//		c2.set(Calendar.HOUR_OF_DAY, 10);
//		c2.set(Calendar.MINUTE, 23);
//		c2.set(Calendar.SECOND, 23);
//		c2.set(Calendar.MILLISECOND, 23);
//		
//		c.setTimeInMillis(Utils.converteTempoEmMilisegundos(c2));
//		System.out.println(c.getTime());
		
		String fistLap = "23:49:08.277";
		String finalLap = "23:52:17.003";
		String tmUltimaVolta = "1:02.787";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:sss");
		Calendar cFistLap = Calendar.getInstance();
		cFistLap.set(Calendar.HOUR_OF_DAY,Integer.valueOf(fistLap.substring(0, 2)));
		cFistLap.set(Calendar.MINUTE,Integer.valueOf(fistLap.substring(3, 5)));
		cFistLap.set(Calendar.SECOND,Integer.valueOf(fistLap.substring(6, 8)));
		cFistLap.set(Calendar.MILLISECOND,Integer.valueOf(fistLap.substring(9, 12)));
		
		Calendar cLastLap = Calendar.getInstance();
		cLastLap.set(Calendar.HOUR_OF_DAY,Integer.valueOf(finalLap.substring(0, 2)));
		cLastLap.set(Calendar.MINUTE,Integer.valueOf(finalLap.substring(3, 5)));
		cLastLap.set(Calendar.SECOND,Integer.valueOf(finalLap.substring(6, 8)));
		cLastLap.set(Calendar.MILLISECOND,Integer.valueOf(finalLap.substring(9, 12)));
		
		Calendar cTmUltimaVolta = Calendar.getInstance();
		cTmUltimaVolta.set(Calendar.MINUTE,Integer.valueOf(tmUltimaVolta.substring(0, 1)));
		cTmUltimaVolta.set(Calendar.SECOND,Integer.valueOf(tmUltimaVolta.substring(2, 4)));
		cTmUltimaVolta.set(Calendar.MILLISECOND,Integer.valueOf(tmUltimaVolta.substring(5, 8)));
		
//		System.out.println(sdf.format(cFistLap.getTime()));
//		System.out.println(sdf.format(cLastLap.getTime()));
//		System.out.println(sdf.format(cTmUltimaVolta.getTime()));
//		Date d1 = new Date();
//		d1.setTime(cFistLap.getTimeInMillis());
//		Date d2 = new Date();
//		d2.setTime(cLastLap.getTimeInMillis());
//		
//		Date d3 = new Date();
//		d3.setTime((d1.getTime() - d2.getTime()));
//		
//		System.out.println(d3);
//		cLastLap.setTime(d3);
//		System.out.println(cLastLap.get(Calendar.SECOND));
//		int hour = 0;
//		int minute = 0;
//		int second = 0;
//		long millisecond = 0L;
//
//		hour = ((cFistLap.get(Calendar.HOUR) - cLastLap.get(Calendar.HOUR)) * (-1));
//		minute = ((cFistLap.get(Calendar.MINUTE) - cLastLap.get(Calendar.MINUTE)) * (-1));
//		second = ((cFistLap.get(Calendar.SECOND) - cLastLap.get(Calendar.SECOND)) * (-1));
//		millisecond = ((cFistLap.get(Calendar.MILLISECOND) - cLastLap.get(Calendar.MILLISECOND)) * (-1));
//		
//		Calendar c = Calendar.getInstance();
//		
//		c.set(Calendar.HOUR_OF_DAY, hour < -1 ? (hour *(-1)) : hour);
//		c.set(Calendar.MINUTE, minute < -1 ? (minute *(-1)) : minute);
//		c.set(Calendar.SECOND, second < -1 ? (second *(-1)) : second);
//		c.set(Calendar.MILLISECOND, Integer.valueOf(String.valueOf(millisecond < -1 ? (millisecond *(-1)) : millisecond)));
//		
//		SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss:SSS");
//		System.out.println(sd.format(c.getTime()));
//		
	}

}
