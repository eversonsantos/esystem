package br.com.casadocodigo.dominio;

public enum DominioPackge {
	
	MODEL("br.com.casadocodigo.model"),
	CONTROLLER("br.com.casadocodigo.controller"),
	CONF("");
	
	private String packge;

	private DominioPackge(String packge) {
		this.packge = packge;
	}

	public String getPackge() {
		return packge;
	}

	public void setPackge(String packge) {
		this.packge = packge;
	}

}
