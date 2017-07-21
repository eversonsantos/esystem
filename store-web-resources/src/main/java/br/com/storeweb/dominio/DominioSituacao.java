package br.com.storeweb.dominio;

public enum DominioSituacao {
	
	ATIVO("AT","Ativo"),
	INATIOV("IA","Inativo"),
	SUSPENSO("SU", "Suspenso"),
	EXCLUIDO("EX", "Excluído"),
	CANCELADO("CA", "Cancelado"),
	ENCAMINHADO("EN", "Encaminhado"),
	ESGOTADO("ES", "Esgotado"),
	DEFERIDO("DE", "Deferido"),
	INDEFERIDO("IN", "Indeferido");
	
	
	private String value;
	private String description;
	
	private DominioSituacao(String value,String description) {
		this.value = value;
		this.description = description;
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
