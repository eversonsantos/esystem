package br.com.storeweb.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tbl_pessoa_fisica")
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_pfis;
	
	@Column(name = "nr_rg", length = 20)
	private String nr_rg;
	
	
	@Column(name = "id_sex", length = 1)
	private String id_sex;
	
	@Column(name ="dt_nas")
	private Date dt_nasc;
	
	@Column(name = "id_est_cv", length = 50)
	private String id_est_cv;//Estado Civil
	
	@Column(name = "id_nv_esc", length = 50)
	private String id_nv_esc;//Escolaridade
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_uf_nat")
	private Estado cd_uf_nat;
	
	@OneToOne
	@JoinColumn(name = "cd_nac")
	private Pais cd_nac;
	
	@Column(name ="nm_pai", length = 100)
	private String nm_pai;
	
	@Column(name ="nm_mae", length = 100)
	private String nm_mae;
	
	public PessoaFisica() {
		
	}
	
	public Long getCd_pfis() {
		return cd_pfis;
	}

	public void setCd_pfis(Long cd_pfis) {
		this.cd_pfis = cd_pfis;
	}

	public String getNr_rg() {
		return nr_rg;
	}

	public void setNr_rg(String nr_rg) {
		this.nr_rg = nr_rg;
	}

	public String getId_sex() {
		return id_sex;
	}

	public void setId_sex(String id_sex) {
		this.id_sex = id_sex;
	}

	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(String dt_nasc) {
		try {
			this.dt_nasc = new SimpleDateFormat("dd/MM/yyyy").parse(dt_nasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getId_est_cv() {
		return id_est_cv;
	}

	public void setId_est_cv(String id_est_cv) {
		this.id_est_cv = id_est_cv;
	}

	public String getId_nv_esc() {
		return id_nv_esc;
	}

	public void setId_nv_esc(String id_nv_esc) {
		this.id_nv_esc = id_nv_esc;
	}

	public Estado getCd_uf_nat() {
		return cd_uf_nat;
	}

	public void setCd_uf_nat(Estado cd_uf_nat) {
		this.cd_uf_nat = cd_uf_nat;
	}

	public Pais getCd_nac() {
		return cd_nac;
	}

	public void setCd_nac(Pais cd_nac) {
		this.cd_nac = cd_nac;
	}

	public String getNm_pai() {
		return nm_pai;
	}

	public void setNm_pai(String nm_pai) {
		this.nm_pai = nm_pai;
	}

	public String getNm_mae() {
		return nm_mae;
	}

	public void setNm_mae(String nm_mae) {
		this.nm_mae = nm_mae;
	}
	
}
