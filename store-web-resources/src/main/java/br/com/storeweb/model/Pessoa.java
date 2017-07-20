package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_pessoa", schema = "dbo")
public class Pessoa extends EntityDefault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pes")
	private Long codigo;

	@Column(name = "nm_pes")
	private String nome;

	@OneToOne
	@JoinColumn(name = "cd_con")
	private Contato contato;

	@Column(name = "nr_cic_pes")
	private String nrCic;

	@OneToOne
	@JoinColumn(name = "cd_end")
	private Endereco endereco;

	public Pessoa() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getNrCic() {
		return nrCic;
	}

	public void setNrCic(String cpfCNPJ) {
		this.nrCic = cpfCNPJ;
	}

//	public PessoaFisica getPessoaFisica() {
//		return pessoaFisica;
//	}
//
//	public void setPessoaFisica(PessoaFisica pessoaFisica) {
//		this.pessoaFisica = pessoaFisica;
//	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
