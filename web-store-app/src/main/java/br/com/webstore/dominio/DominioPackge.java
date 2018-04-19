package br.com.webstore.dominio;

public enum DominioPackge {
	
	MODEL("br.com.webstore.model"),
	CONTROLLER("br.com.webstore.controller"),
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
