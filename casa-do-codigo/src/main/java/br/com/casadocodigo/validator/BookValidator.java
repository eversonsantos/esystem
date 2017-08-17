package br.com.casadocodigo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.model.Book;

public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Book.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prices", "field.required");
		
		Book livro = (Book) target;
		
		if(livro.getNumberPages() == 0){
			errors.rejectValue("numberPages", "field.required");
		}
	}
}
