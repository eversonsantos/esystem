package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_endereço")
public class Endereco {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long cd_end;
	
	@Column(name = "cd_cep")
	private String cd_cep;
	
}
