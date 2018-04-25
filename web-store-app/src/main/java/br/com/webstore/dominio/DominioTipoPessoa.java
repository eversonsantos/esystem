package br.com.webstore.dominio;

public enum DominioTipoPessoa {

	FISICA("F","Fisica"),
	JURIDICA("J", "Juridica");
	
	private String sigla;
	private String description;
	
	private DominioTipoPessoa(String sigla, String description) {
		this.sigla = sigla;
		this.description = description;
	}
	
	public static DominioTipoPessoa parser (String sigla) {
		for (DominioTipoPessoa tipo : DominioTipoPessoa.values()) {
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
