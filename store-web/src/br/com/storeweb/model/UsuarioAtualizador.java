package br.com.storeweb.model;

import java.util.Date;

abstract class  UsuarioAtualizador {

	private String usuario;
	private Date date = new Date();
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getDate() {
		return date;
	}	
}
