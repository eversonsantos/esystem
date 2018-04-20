package br.com.webstore.dominio;

public enum DominioCargo {
	
	RL("Raid Leader"),
	Oficial("Oficial"),
	Novato("Novato");
	
	private String description;
	
	private DominioCargo(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DominioCargo parser (String description) {
		for (DominioCargo cargo : DominioCargo.values()) {
			if(description.equals(cargo.getDescription()))
					return cargo;
		}
		return null;
	}

}
