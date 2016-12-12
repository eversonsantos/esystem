package br.com.formula1.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import br.com.formula1.utils.Utils;

public class UtilsTest extends Utils{
	

	@SuppressWarnings("unused")
	@Test
	public void testRemoveCaracteres() {
		String sHrVolta = "1:02.852";
		if(sHrVolta == null){
			throw new NullPointerException("Erro no método removeCaracteres, Parâmetro passado nullo");
		}
		sHrVolta = sHrVolta.replaceAll("[^a-zZ-Z0-9 ]", "");
		assertEquals("102852", sHrVolta);
	}

	@SuppressWarnings("unused")
	@Test
	public void testFormataVelocidadeMedia() {
		String velocidade = "43,493";
		if(velocidade == null){
			throw new NullPointerException("Erro no método formataVelocidadeMedia, Parâmetro passado nullo");
		}
		assertEquals(43.493, Double.valueOf(velocidade.replaceAll(",", ".")));
	}

	@Test
	public void testCalculaVelocidadeMedia() {
		Double vl = 124.16;
		Double vlMedia = 0.0;
		int nrVoltas = 3;
		BigDecimal b = new BigDecimal(vl);
		if(nrVoltas > 0){
			vlMedia = b.divide(new BigDecimal(nrVoltas), 3 , RoundingMode.DOWN).setScale(3, RoundingMode.DOWN).doubleValue();
			assertEquals(41.386, vlMedia);
		}else{
			assertEquals(124.16, vl);
		}
	}
	@Test
	public  void testconverteTempoEmMilisegundos(){
		String sDate = "4:55:815";
		int h = sDate.length() == 12 ? Integer.valueOf(sDate.substring(0, 1)) : 0;
		int m = sDate.length() == 12 ? Integer.valueOf(sDate.substring(3, 5)) : Integer.valueOf(sDate.substring(0, 1));
		int s = sDate.length() == 12 ? Integer.valueOf(sDate.substring(6, 8)) : Integer.valueOf(sDate.substring(2, 4));
		int ml =sDate.length() == 12 ? Integer.valueOf(sDate.substring(9, 12)) : Integer.valueOf(sDate.substring(5, 8));
		ml = ml + ((h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000));
	}
}
