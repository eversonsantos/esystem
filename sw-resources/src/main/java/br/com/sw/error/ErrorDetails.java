package br.com.sw.error;

import java.util.Date;

public class ErrorDetails {

	private long dataHora;
	private String titulo;
	private String detalhes;
	private int status;
	
	public ErrorDetails(long dataHora, String titulo, String detalhes, int status) {
		super();
		this.dataHora = dataHora;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.status = status;
	}

	public long getDataHora() {
		return dataHora;
	}

	public void setDataHora(long dataHora) {
		this.dataHora = dataHora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
