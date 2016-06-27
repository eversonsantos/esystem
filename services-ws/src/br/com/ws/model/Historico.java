package br.com.ws.model;

import java.math.BigDecimal;

public class Historico {
	
	private BigDecimal preco;

	
	
	public Historico(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
}
