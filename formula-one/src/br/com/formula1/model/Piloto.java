package br.com.formula1.model;

import java.util.ArrayList;
import java.util.List;

public class Piloto {
	
	private Long cdPil;
	private String nmPil;
	private List<Volta> voltas = new ArrayList<Volta>();
	private Integer nrPosicao;
	private String tmMelhorVolta;
	private Integer nrMelhorVolta;
	private Double vlMediaDuranteCorrida;
	private String tmTotalProva;
	private String tmProvaAposGanhador;
	
	public Piloto() {
		
	}
	
	public Piloto(Long cdPil, String nmPil, List<Volta> voltas, Integer nrPosicao) {
		this.cdPil = cdPil;
		this.nmPil = nmPil;
		this.voltas = voltas;
		this.nrPosicao = nrPosicao;
	}
	
	public Long getCdPil() {
		return cdPil;
	}
	public void setCdPil(Long cdPil) {
		this.cdPil = cdPil;
	}
	public String getNmPil() {
		return nmPil;
	}
	public void setNmPil(String nmPil) {
		this.nmPil = nmPil;
	}

	public List<Volta> getVoltas() {
		return voltas;
	}

	public void setVoltas(List<Volta> voltas) {
		this.voltas = voltas;
	}

	public Integer getNrPosicao() {
		return nrPosicao;
	}

	public void setNrPosicao(Integer nrPosicao) {
		this.nrPosicao = nrPosicao;
	}
	
	public String getNrPosicaoFormatado() {
		return nrPosicao+"º Colocado";
	}
	
	public String getTmMelhorVolta() {
		return tmMelhorVolta;
	}

	public void setTmMelhorVolta(String tmMelhorVolta) {
		this.tmMelhorVolta = tmMelhorVolta;
	}

	public Integer getNrMelhorVolta() {
		return nrMelhorVolta;
	}

	public void setNrMelhorVolta(Integer nrMelhorVolta) {
		this.nrMelhorVolta = nrMelhorVolta;
	}
	
	public Double getVlMediaDuranteCorrida() {
		return vlMediaDuranteCorrida;
	}

	public void setVlMediaDuranteCorrida(Double vlMediaDuranteCorrida) {
		this.vlMediaDuranteCorrida = vlMediaDuranteCorrida;
	}

	public Integer getNrVoltasCompletadas() {
		return getVoltas().size();
	}
	

	public String getTmTotalProva() {
		return tmTotalProva;
	}

	public void setTmTotalProva(String tmTotalProva) {
		this.tmTotalProva = tmTotalProva;
	}
	
	public String getTmProvaAposGanhador() {
		return tmProvaAposGanhador;
	}

	public void setTmProvaAposGanhador(String tmProvaAposGanhador) {
		this.tmProvaAposGanhador = tmProvaAposGanhador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdPil == null) ? 0 : cdPil.hashCode());
		result = prime * result + ((nmPil == null) ? 0 : nmPil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		if (cdPil == null) {
			if (other.cdPil != null)
				return false;
		} else if (!cdPil.equals(other.cdPil))
			return false;
		if (nmPil == null) {
			if (other.nmPil != null)
				return false;
		} else if (!nmPil.equals(other.nmPil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Piloto [cdPil=" + cdPil + ", nmPil=" + nmPil + ", voltas="
				+ voltas + "]";
	}
	
}
