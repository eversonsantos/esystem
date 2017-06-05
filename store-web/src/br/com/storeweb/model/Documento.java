package br.com.storeweb.model;

import java.util.Date;

public class Documento extends EntityDefault{

	private String numero;
	private String oEmissor;
	private Date dEmissao;
	private Estado eEmissao;
	private boolean ativo;
	
	public Documento() {
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getoEmissor() {
		return oEmissor;
	}
	public void setoEmissor(String oEmissor) {
		this.oEmissor = oEmissor;
	}
	public Date getdEmissao() {
		return dEmissao;
	}
	public void setdEmissao(Date dEmissao) {
		this.dEmissao = dEmissao;
	}
	public Estado geteEmissao() {
		return eEmissao;
	}
	public void seteEmissao(Estado eEmissao) {
		this.eEmissao = eEmissao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
