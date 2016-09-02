package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long cd_end;
	
	@Column(name = "cd_cep")
	private String cd_cep;
	
	@Column(name = "nm_cid", length = 50)
	private String nm_cid;
	
	@Column(name = "nm_bai", length = 50)
	private String nm_bai;
	
	@Column(name = "nm_log", length = 100)
	private String nm_log;
	
	@Column(name = "cd_uf")
	private String cd_uf;
	
	@Column(name = "ds_com", length = 255)
	private String ds_com;
	
	@Column(name = "nr_en", length = 50)
	private String nr_en;

	public Long getCd_end() {
		return cd_end;
	}

	public void setCd_end(Long cd_end) {
		this.cd_end = cd_end;
	}

	public String getCd_cep() {
		return cd_cep;
	}

	public void setCd_cep(String cd_cep) {
		this.cd_cep = cd_cep;
	}

	public String getNm_cid() {
		return nm_cid;
	}

	public void setNm_cid(String nm_cid) {
		this.nm_cid = nm_cid;
	}

	public String getNm_bai() {
		return nm_bai;
	}

	public void setNm_bai(String nm_bai) {
		this.nm_bai = nm_bai;
	}

	public String getNm_log() {
		return nm_log;
	}

	public void setNm_log(String nm_log) {
		this.nm_log = nm_log;
	}

	public String getCd_uf() {
		return cd_uf;
	}

	public void setCd_uf(String cd_uf) {
		this.cd_uf = cd_uf;
	}

	public String getDs_com() {
		return ds_com;
	}

	public void setDs_com(String ds_com) {
		this.ds_com = ds_com;
	}

	public String getNr_en() {
		return nr_en;
	}

	public void setNr_en(String nr_en) {
		this.nr_en = nr_en;
	}
	
}
