package br.com.form;

public class Volta {

	private Integer nrVolta;
	private String tmVolta;
	private Integer nrPosicao;
	private Double vlMedia;
	private String hrVolta;
	
	public Volta() {
	}
	
	public Volta(Integer nrVolta, String tmVolta, Integer nrPosicao, Double vlMedia, String hrVolta) {
		this.nrVolta = nrVolta;
		this.tmVolta = tmVolta;
		this.nrPosicao = nrPosicao;
		this.vlMedia = vlMedia;
		this.hrVolta = hrVolta;
	}
	public Integer getNrVolta() {
		return nrVolta;
	}
	public void setNrVolta(Integer nrVolta) {
		this.nrVolta = nrVolta;
	}
	public String getTmVolta() {
		return tmVolta;
	}
	public void setTmVolta(String tmVolta) {
		this.tmVolta = tmVolta;
	}
	public Integer getNrPosicao() {
		return nrPosicao;
	}
	public void setNrPosicao(Integer nrPosicao) {
		this.nrPosicao = nrPosicao;
	}
	public Double getVlMedia() {
		return vlMedia;
	}
	public void setVlMedia(Double vlMedia) {
		this.vlMedia = vlMedia;
	}

	public String getHrVolta() {
		return hrVolta;
	}

	public void setHrVolta(String hrVolta) {
		this.hrVolta = hrVolta;
	}
}
