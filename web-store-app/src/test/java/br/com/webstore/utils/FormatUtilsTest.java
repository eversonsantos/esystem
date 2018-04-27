package br.com.webstore.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatUtilsTest {
	
	@Test
	public void formartString() {
		
		String value ="01407590260";
		String mask = "###.###.###-##";
		
		for(int i=0; i < value.length(); i++) {
			char charValue = value.charAt(i);
			mask = mask.replaceFirst("#", String.valueOf(charValue));
		}
		assertEquals("014.075.902-60", mask);
	}
	
	@Test
	public void formartDateStringTest() {
		
		String value ="23111989";
		String mask = "##/##/####";
		
		for(int i=0; i < value.length(); i++) {
			char charValue = value.charAt(i);
			mask = mask.replaceFirst("#", String.valueOf(charValue));
		}
		assertEquals("23/11/1989", mask);
	}
	
	@Test
	public void formartCNPJStringTest() {
		
		String value ="12375604000100";
		String mask = "##.###.###/####-##";
		
		for(int i=0; i < value.length(); i++) {
			char charValue = value.charAt(i);
			mask = mask.replaceFirst("#", String.valueOf(charValue));
		}
		assertEquals("12.375.604/0001-00", mask);
	}
	

}
