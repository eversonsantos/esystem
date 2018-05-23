package br.com.webstore.dominio;

public enum DominioTipoTelefone {
	
	RESIDENCIAL("Residencial"),
	CELULAR("Celular");
	
	private String description;
	
	private DominioTipoTelefone(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static DominioTipoTelefone parser (String description) {
		for (DominioTipoTelefone tipo : DominioTipoTelefone.values()) {
			if(description.equals(tipo.getDescription()))
					return tipo;
		}
		return null;
	}

}
