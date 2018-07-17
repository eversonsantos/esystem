package br.com.sw.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DominioFuncao {
	
	DPS("DPS"),
	HEAL("HEAL"),
	TANK("TANK");

	private String descprtion;

	private DominioFuncao(String descprtion) {
		this.descprtion = descprtion;
	}
	
	public static DominioFuncao parse(String value) {
		for(DominioFuncao funcao : DominioFuncao.values()) {
			if(funcao.getDescprtion().equalsIgnoreCase(value))
				return funcao;
		}
		return null;
	}

	public String getDescprtion() {
		return descprtion;
	}

	public void setDescprtion(String descprtion) {
		this.descprtion = descprtion;
	}
	
	
	
}
