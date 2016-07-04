package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "tbl_usuario")
public class Usuario extends EntityDefault{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_usua")
	private long cd_usua;
	
	@Column(name="cd_log_usu")
	private String cd_log_usu;
	
	@Column(name="cd_snh_usu")
	private String cd_snh_usu;
	
//	@OneToOne
//	@Column(name="cd_pes")
//	private Pessoa cd_pes;
	
	public Usuario() {
		
	}
	
	public long getCd_usua() {
		return cd_usua;
	}
	public void setCd_usua(long cd_usua) {
		this.cd_usua = cd_usua;
	}
	public String getCd_log_usu() {
		return cd_log_usu;
	}
	public void setCd_log_usu(String cd_log_usu) {
		this.cd_log_usu = cd_log_usu;
	}
	public String getCd_snh_usu() {
		return cd_snh_usu;
	}
	public void setCd_snh_usu(String cd_snh_usu) {
		this.cd_snh_usu = cd_snh_usu;
	}
//	public Pessoa getCd_pes() {
//		return cd_pes;
//	}
//	public void setCd_pes(Pessoa cd_pes) {
//		this.cd_pes = cd_pes;
//	}
	
	
	
}
