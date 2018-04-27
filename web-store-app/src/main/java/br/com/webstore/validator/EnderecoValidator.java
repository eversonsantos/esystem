package br.com.webstore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.webstore.model.Endereco;

public class EnderecoValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Endereco.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Endereco end = (Endereco) target;
		if(end.getCdCep() == 0)
			errors.rejectValue("cdCep",null, "Informe um CEP");
		
	}

}
