package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_estado")
public class Estado extends EntityDefault{

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column( name = "cd_uf")
	private Long cd_uf;
	
	@Column( name = "nm_uf")
	private String nm_uf;
	
	@Column(name = "sg_uf")
	private String sg_uf;
	
	public Estado() {
		
	}
	

	public Estado(Long cd_uf, String nm_uf, String sg_uf) {
		this.cd_uf = cd_uf;
		this.nm_uf = nm_uf;
		this.sg_uf = sg_uf;
	}



	public Long getCd_uf() {
		return cd_uf;
	}

	public void setCd_uf(Long cd_uf) {
		this.cd_uf = cd_uf;
	}

	public String getNm_uf() {
		return nm_uf;
	}

	public void setNm_uf(String nm_uf) {
		this.nm_uf = nm_uf;
	}

	public String getSg_uf() {
		return sg_uf;
	}

	public void setSg_uf(String sg_uf) {
		this.sg_uf = sg_uf;
	}
	
}
