package br.com.storeweb.model;



//@Entity(name="tbl_pessoa")
public class Pessoa extends UsuarioAtualizador{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "cod_pes")
	private Long id;
//	@Column(name= "nom_pes")
	private String nome;
//	@Column(name= "cod_con_pes")
	private Contato contato;
//	@Column(name= "num_cic")
	private String cic;
//	@Column(name= "cod_pes_fis")
	private PessoaFisica pFisica;
//	private PessoaJuridica pJuridica;
//	@Column(name= "cod_end_pes")
//	private Endereco endereco;

	public Pessoa() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cic;
	}

	public void setCpf(String cic) {
		this.cic = cic;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public PessoaFisica getpFisica() {
		return pFisica;
	}

	public void setpFisica(PessoaFisica pFisica) {
		this.pFisica = pFisica;
	}

}
