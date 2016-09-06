package br.com.storeweb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity(name="tbl_pessoa")
public class Pessoa extends EntityDefault{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pes")
	private Long cd_pes;
	
	@Column(name= "nm_pes")
	private String nm_pes;
	
	@OneToOne
	@JoinColumn(name = "cd_con")
	private Contato cd_con = new Contato();
	
	@Column(name= "nr_cic_pes")
	private String nr_cic_pes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "cd_pfi")
	private PessoaFisica cd_pfi = new PessoaFisica();
	
//	private PessoaJuridica pJuridica;
	
	@OneToOne
	@JoinColumn(name = "cd_end")
	private Endereco cd_end = new Endereco();

	public Pessoa() {
		
	}

	public Long getCd_pes() {
		return cd_pes;
	}

	public void setCd_pes(Long cd_pes) {
		this.cd_pes = cd_pes;
	}

	public String getNm_pes() {
		return nm_pes;
	}

	public void setNm_pes(String nm_pes) {
		this.nm_pes = nm_pes;
	}

	public Contato getCd_con() {
		return cd_con;
	}

	public void setCd_con(Contato cd_con) {
		this.cd_con = cd_con;
	}

	public String getNr_cic_pes() {
		return nr_cic_pes;
	}

	public void setNr_cic_pes(String nr_cic_pes) {
		this.nr_cic_pes = nr_cic_pes;
	}

	public PessoaFisica getCd_pfi() {
		return cd_pfi;
	}

	public void setCd_pfi(PessoaFisica cd_pfi) {
		this.cd_pfi = cd_pfi;
	}

	public Endereco getCd_end() {
		return cd_end;
	}

	public void setCd_end(Endereco cd_end) {
		this.cd_end = cd_end;
	}
	
	

	
}
