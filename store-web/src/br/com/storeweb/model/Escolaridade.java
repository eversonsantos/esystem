package br.com.storeweb.model;

public enum Escolaridade {

	FUNDAMENTAL_C, FUNDAMENTAL_I, 
	MEDIO_C, MEDIO_I, 
	SUPERIOR_C, SUPERIOR_I;
	
	public String getEscolaridade(){
		switch (this) {
		case FUNDAMENTAL_I:
			return "Fundamental Incompleto";
		case FUNDAMENTAL_C:
			return "Fundamental Completo";
		case MEDIO_I:
			return "Médio Incompleto";
		case MEDIO_C:
			return "Médio Completo";
		case SUPERIOR_I:
			return "Superior Incompleto";
		case SUPERIOR_C:
			return "Superior Completo";
		default:
			return "";
		}
	}
}
