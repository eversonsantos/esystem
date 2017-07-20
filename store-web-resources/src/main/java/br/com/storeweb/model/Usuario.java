package br.com.storeweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_usuario", schema = "dbo")
public class Usuario extends EntityDefault implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_usua")
	private long cdUsuario;

	@Column(name = "cd_mat_usu", length = 10)
	private String cdMatricula;

	@Column(name = "ds_log_usu", length = 50)
	private String dsLogin;

	@Column(name = "cd_snh_usu", length = 20)
	private String cdSenha;
//
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_pes")
	private Pessoa pessoa;

	@Column(name = "dt_cad")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;

	public Usuario() {

	}

	public long getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getCdMatricula() {
		return cdMatricula;
	}

	public void setCdMatricula(String cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	public String getDsLogin() {
		return dsLogin;
	}

	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
	}

	public String getCdSenha() {
		return cdSenha;
	}

	public void setCdSenha(String cdSenha) {
		this.cdSenha = cdSenha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

}
