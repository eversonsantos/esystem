package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_men;
	
	@Column(name = "nm_men")
	private String nm_men;
	
	@Column(name = "ds_url_men")
	private String ds_url_men;
	
	@Column(name = "ds_url_ico")
	private String ds_url_ico;
	
	
//	private Sistema sistema;
	
	public Menu() {
		
	}
	
	public Menu(Long cd_men, String nm_men, String ds_url_men) {
		this.cd_men = cd_men;
		this.nm_men = nm_men;
		this.ds_url_men = ds_url_men;
	}



	public Long getCd_men() {
		return cd_men;
	}

	public void setCd_men(Long cd_men) {
		this.cd_men = cd_men;
	}

	public String getNm_men() {
		return nm_men;
	}

	public void setNm_men(String nm_men) {
		this.nm_men = nm_men;
	}

	public String getDs_url_men() {
		return ds_url_men;
	}

	public void setDs_url_men(String ds_url_men) {
		this.ds_url_men = ds_url_men;
	}
	
	
}
