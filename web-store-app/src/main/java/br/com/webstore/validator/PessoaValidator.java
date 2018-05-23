package br.com.webstore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.webstore.model.Pessoa;

public class PessoaValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Pessoa.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Pessoa pessoa = (Pessoa) target;
		
		if(pessoa.getNrCic() ==  null || pessoa.getNrCic().isEmpty()) {
			errors.rejectValue("nrCic", "required.nrCic", "CPF é obrigatorio");
		}
		
	}

}
