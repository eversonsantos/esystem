package br.com.webstore.dominio;

public enum DominioGenero {

	FEMININO("F","Feminino"),
	MASCULINO("M", "Masculino");
	
	private String sigla;
	private String description;
	
	private DominioGenero(String sigla, String description) {
		this.sigla = sigla;
		this.description = description;
	}
	
	public static DominioGenero parser (String sigla) {
		for (DominioGenero tipo : DominioGenero.values()) {
			if(sigla.equalsIgnoreCase(tipo.getSigla()))
				return tipo;
		}
		return null;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
