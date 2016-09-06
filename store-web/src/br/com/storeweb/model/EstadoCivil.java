package br.com.storeweb.model;

public enum EstadoCivil {

	SOLTEIRO, CASADO, SEPARADO, UNIAO_ESTAVEL;
	
	public String getECivil(){
		switch (this) {
		case SOLTEIRO:
			return "Solteiro";
		case CASADO:
			return "Casado";
		case SEPARADO:
			return "Seperado";
		case UNIAO_ESTAVEL:
			return "União Estável";
			
		default:
			return "";
		}
	}
	
	
	
}
