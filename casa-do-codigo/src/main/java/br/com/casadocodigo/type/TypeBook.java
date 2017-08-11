package br.com.casadocodigo.type;

public enum TypeBook {
	PDF(1, "PDF"),
	IMPRESSO(2, "Impresso");
	
	private int value;
	private String description;
	
	private TypeBook(int value, String description) {
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
