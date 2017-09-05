package br.com.casadocodigo.dominio;

public enum LivroDominio {

	PDF(1, "PDF"),
	IMPRESSO(2, "Impresso"),
	COMBO(3, "Combo");
	
	private int value;
	private String description;
	
	private LivroDominio(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
