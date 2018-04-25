package br.com.webstore.dominio;

public enum DominioEstCivil {

	SOLTEIRO("SO","Solteiro(a)"),
	CASADO("CA","Casado(a)"),
	DIVORCIADO("DV","Divorciado(a)"),
	VIUVO("VV","Viúvo(a)"),
	SEPARADO("SP", "Separado(a)");
	
	private String sigla;
	private String description;
	
	private DominioEstCivil(String sigla, String description) {
		this.sigla = sigla;
		this.description = description;
	}
	
	public static DominioEstCivil parser (String sigla) {
		for (DominioEstCivil tipo : DominioEstCivil.values()) {
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
