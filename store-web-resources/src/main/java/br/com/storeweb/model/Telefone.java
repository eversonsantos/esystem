package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_telefone", schema = "dbo")
public class Telefone extends EntityDefault{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_tel;
	
	@Column(name = "nr_tel")
	private Integer nr_tel;
	
	@Column(name = "nr_ddd_tel")
	private Integer nr_ddd_tel;
	
	@Column(name = "sg_tel_wap")
	private boolean sg_tel_wap;
	
	@ManyToOne
	@JoinColumn(name = "cd_con")
	private Contato cd_con;
	
	public Telefone() {
		
	}
	
	public Long getCd_tel() {
		return cd_tel;
	}

	public void setCd_tel(Long cd_tel) {
		this.cd_tel = cd_tel;
	}

	public Integer getNr_tel() {
		return nr_tel;
	}

	public void setNr_tel(Integer nr_tel) {
		this.nr_tel = nr_tel;
	}

	public Integer getNr_ddd_tel() {
		return nr_ddd_tel;
	}

	public void setNr_ddd_tel(Integer nr_ddd_tel) {
		this.nr_ddd_tel = nr_ddd_tel;
	}

	public boolean isSg_tel_wap() {
		return sg_tel_wap;
	}

	public void setSg_tel_wap(boolean sg_tel_wap) {
		this.sg_tel_wap = sg_tel_wap;
	}
	

}
