package br.com.webstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.webstore.dominio.DominioCargo;

@Table(name = "tbl_pessoa")
@Entity
public class Pessoa extends EntityDefault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pes")
	private Long cdPes;

	@Column(name = "nm_pes")
	private String nmPes;
	
	@Column(name = "cd_crg")
	@Enumerated(EnumType.ORDINAL)
	private DominioCargo cargo;

	@Column(name = "ds_crg")
	private String dsEml;
	
	@Column(name = "ds_snh")
	private String dsSnh;

	public Long getCdPes() {
		return cdPes;
	}

	public void setCdPes(Long cdPes) {
		this.cdPes = cdPes;
	}

	public String getNmPes() {
		return nmPes;
	}

	public void setNmPes(String nmPes) {
		this.nmPes = nmPes;
	}

	public DominioCargo getCargo() {
		return cargo;
	}

	public void setCargo(DominioCargo cargo) {
		this.cargo = cargo;
	}

	public String getDsEml() {
		return dsEml;
	}

	public void setDsEml(String dsEml) {
		this.dsEml = dsEml;
	}

	public String getDsSnh() {
		return dsSnh;
	}

	public void setDsSnh(String dsSnh) {
		this.dsSnh = dsSnh;
	}
}
