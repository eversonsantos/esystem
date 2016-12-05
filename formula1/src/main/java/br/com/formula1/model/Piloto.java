package br.com.formula1.model;

public class Piloto {
	
	private Long cdPil;
	private String nmPil;
	
	public Piloto(Long cdPil, String nmPil) {
		this.cdPil = cdPil;
		this.nmPil = nmPil;
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
	
	
	
}
