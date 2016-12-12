package br.com.formula1.type;

public enum Formato {
	
	HH_MM_SS_SSS, MM_SS_SSS;

	
	
	public String getFormato(){
		switch (this) {
		case HH_MM_SS_SSS:
			return "HH:mm:ss:sss";
		
		case MM_SS_SSS:
			return "mm:ss:sss";

		}
		return null;
	}
	
}
