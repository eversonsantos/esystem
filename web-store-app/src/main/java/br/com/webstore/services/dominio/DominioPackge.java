package br.com.webstore.services.dominio;

public enum DominioPackge {
	
	MODEL("br.com.webstore.services.model"),
	CONTROLLER("br.com.webstore.services.controller"),
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
