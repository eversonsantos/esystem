package br.com.webstore.dominio;

public enum DominioEstados {
	
	AC("AC","Acre"),
	AL("AL","Alagoas"),
	AP("AP","Amapá"),
	AM("AM","Amazonas"),
	BA("BA","Bahia"),
	CE("CE","Ceará"),
	DF("DF","Distrito Federal"),
	ES("ES","Espírito Santo"),
	GO("GO","Goiás"),
	MA("MA","Maranhão"),
	MT("MT","Mato Grosso"),
	MS("MS","Mato Grosso do Sul "),
	MG("MG","Minas Gerais"),
	PA("PA","Pará"),
	PB("PB","Paraíba"),
	PR("PR","Paraná"),
	PE("PE","Pernambuco"),
	PI("PI","Piauí"),
	RJ("RJ","Rio de Janeiro"),
	RN("RN","Rio Grande do Norte"),
	RS("RS","Rio Grande do Sul"),
	RO("RO","Rondônia"),
	RR("RR","Roraima"),
	SC("SC","Santa Catarina"),
	SP("SP","São Paulo"),
	SE("SE","Sergipe"),
	TO("TO","Tocantins");
	
	private String value;
	private String description;
	
	private DominioEstados(String value, String description) {
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
	
	public static DominioEstados parser (String description) {
		for (DominioEstados tipo : DominioEstados.values()) {
			if(description.equals(tipo.getDescription()))
					return tipo;
		}
		return null;
	}

}
