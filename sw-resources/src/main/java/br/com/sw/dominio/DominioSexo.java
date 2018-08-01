package br.com.sw.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DominioSexo {
	
	M("M", "Masculino"),
	F("F", "Feminino");

	private String value;
	
	private String descprtion;

	private DominioSexo(String value, String descprtion) {
		this.value = value;
		this.descprtion = descprtion;
	}
	
	public static DominioSexo parse(String value) {
		for(DominioSexo funcao : DominioSexo.values()) {
			if(funcao.getDescprtion().equalsIgnoreCase(value))
				return funcao;
		}
		return null;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescprtion() {
		return descprtion;
	}
	public void setDescprtion(String descprtion) {
		this.descprtion = descprtion;
	}
}
