package br.com.storeweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tbl_usuario")
public class Usuario extends EntityDefault implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_usua")
	private long cd_usua;
	
	@Column(name = "cd_mat_usu", length = 10)
	private String cd_mat_usu;
	
	@Column(name="cd_log_usu", length = 50)
	private String cd_log_usu;
	
	@Column(name="cd_snh_usu", length = 20)
	private String cd_snh_usu;
	
	@OneToOne
	@JoinColumn(name="cd_pes")
	private Pessoa cd_pes;
	
	@Column(name = "dt_inc")
	private Date dt_inc;
	
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
	public Pessoa getCd_pes() {
		return cd_pes;
	}
	public void setCd_pes(Pessoa cd_pes) {
		this.cd_pes = cd_pes;
	}
	public Date getDt_inc() {
		return dt_inc;
	}
	public void setDt_inc(Date dt_inc) {
		this.dt_inc = dt_inc;
	}
	public String getCd_mat_usu() {
		return cd_mat_usu;
	}
	public void setCd_mat_usu(String cd_mat_usu) {
		this.cd_mat_usu = cd_mat_usu;
	}

}
