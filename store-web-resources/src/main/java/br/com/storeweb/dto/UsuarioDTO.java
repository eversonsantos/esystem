package br.com.storeweb.dto;

import br.com.storeweb.model.Usuario;


public class UsuarioDTO extends PessoaDTO{
	
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
//		sb.append("CPF: ").append(this.getPessoa().getNr_cic_pes()).append("\n");
//		sb.append("Nome: ").append(this.getPessoa().getNm_pes()).append("\n");
		sb.append("RG: ").append(this.getPessoaFisica().getNr_rg()).append("\n");
		sb.append("Sexo: ").append(this.getPessoaFisica().getId_sex()).append("\n");
		sb.append("Nacionalidade: ").append(this.getPessoaFisica().getCd_nac().getNm_pais()).append("\n");
		sb.append("Naturalidade: ").append(this.getPessoaFisica().getCd_uf_nat().getSg_uf()).append("\n");
		sb.append("Pai: ").append(this.getPessoaFisica().getNm_pai()).append("\n");
		sb.append("Mãe: ").append(this.getPessoaFisica().getNm_mae()).append("\n");
		sb.append("Nascimento: ").append(this.getPessoaFisica().getDt_nasc()).append("\n");
		sb.append("Escolaridade: ").append(this.getPessoaFisica().getId_nv_esc()).append("\n");
		sb.append("Estado Civil: ").append(this.getPessoaFisica().getId_est_cv()).append("\n");
		sb.append("Endereco: Rua ").append(this.getEndereco().getNm_log()).append(", ").append(this.getEndereco().getNr_en()).append("-");
		sb.append(this.getEndereco().getNm_bai()).append(", ").append(this.getEndereco().getNm_cid()).append(" - ").append(this.getEndereco().getCd_uf()).append(", ").append(this.getEndereco().getCd_cep());
		
		return sb.toString();
	}
}
