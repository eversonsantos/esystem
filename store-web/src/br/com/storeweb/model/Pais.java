package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_pais")
public class Pais {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pais")
	private Long cd_pais;
	
	@Column(name = "nm_pais")
	private String nm_pais;
	
	@Column(name = "ds_nac_pais")
	private String ds_nac_pais;

	public Pais() {
	}
	
	public Pais(Long cd_pais, String nm_pais, String ds_nac_pais) {
		this.cd_pais = cd_pais;
		this.nm_pais = nm_pais;
		this.ds_nac_pais = ds_nac_pais;
	}

	public Long getCd_pais() {
		return cd_pais;
	}

	public void setCd_pais(Long cd_pais) {
		this.cd_pais = cd_pais;
	}

	public String getNm_pais() {
		return nm_pais;
	}

	public void setNm_pais(String nm_pais) {
		this.nm_pais = nm_pais;
	}

	public String getDs_nac_pais() {
		return ds_nac_pais;
	}

	public void setDs_nac_pais(String ds_nac_pais) {
		this.ds_nac_pais = ds_nac_pais;
	}
	
	
}
