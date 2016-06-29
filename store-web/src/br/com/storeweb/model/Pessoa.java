package br.com.storeweb.model;



//@Entity(name="tbl_pessoa")
public class Pessoa extends UsuarioAtualizador{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "cd_pes")
	private Long cd_pes;
//	@Column(name= "nm_pes")
	private String nm_pes;
//	@Column(name= "cd_con")
	private Contato cd_con;
//	@Column(name= "nr_cic_pes")
	private String nr_cic_pes;
//	@Column(name= "cd_pfi")
	private PessoaFisica cd_pfi;
//	private PessoaJuridica pJuridica;
//	@Column(name= "cod_end_pes")
//	private Endereco endereco;

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

	
}
