package br.com.webstore.dominio;

public enum DominioEscolaridade {

	FUNDAMENTAL_IN("Fundamental - Incompleto"),
	FUNDAMENTAL("Fundamental - Completo"),
	MEDIO_IN("Médio - Incompleto"),
	MEDIO("Médio - Completo"),
	SUPERIOR_IN("Superior - Incompleto"),
	SUPERIOR("Superior - Completo");
	
	private String description;
	
	private DominioEscolaridade(String description) {
		this.description = description;
	}
	
	public static DominioEscolaridade parser (String description) {
		for (DominioEscolaridade tipo : DominioEscolaridade.values()) {
			if(description.equalsIgnoreCase(tipo.getDescription()))
				return tipo;
		}
		return null;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
