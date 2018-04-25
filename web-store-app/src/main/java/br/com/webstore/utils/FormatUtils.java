package br.com.webstore.utils;

public class FormatUtils {
	
	public static String formartString(String value, String mask) {

		if(value == null || mask == null)
			return "";
		
		if("".equals(value.trim()) || "".equals(mask.trim()))
			return "";
		
		for(int i=0; i < value.length(); i++) {
			char charValue = value.charAt(i);
			mask = mask.replaceFirst("#", String.valueOf(charValue));
		}
		return mask;
	}
}
