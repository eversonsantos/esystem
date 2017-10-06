package br.com.storeweb.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.apache.log4j.Logger;

public class EncryptUtils {

	private Logger logger = Logger.getLogger(EncryptUtils.class);
	
	public String getEncrypt(String string) {
		String stringEncrypt = null;
		
		try {
			logger.info("Cripitografando parâmetro");
			stringEncrypt = new String(Base64.getEncoder().encodeToString(string.getBytes("UTF-8")));
			return stringEncrypt;
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return stringEncrypt;
		}finally{
			logger.info("Parâmetro Descripitografado "+stringEncrypt);
		}

	}

	public String getDecrypt(String string) {

		try {
			return new String(Base64.getDecoder().decode(string),"UTF-8");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}

	}
	public static void main(String[] args) {
		new EncryptUtils().getEncrypt("123456");
	}
}
