package br.com.formula1.model;

public class Volta {

	private Integer nrVolta;
	private Long tmVolta;
	private Integer nrPosicao;
	private Double vlMedia;
	
	public Volta(Integer nrVolta, Long tmVolta, Integer nrPosicao,
			Double vlMedia) {
		this.nrVolta = nrVolta;
		this.tmVolta = tmVolta;
		this.nrPosicao = nrPosicao;
		this.vlMedia = vlMedia;
	}
	public Integer getNrVolta() {
		return nrVolta;
	}
	public void setNrVolta(Integer nrVolta) {
		this.nrVolta = nrVolta;
	}
	public Long getTmVolta() {
		return tmVolta;
	}
	public void setTmVolta(Long tmVolta) {
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
	
}
