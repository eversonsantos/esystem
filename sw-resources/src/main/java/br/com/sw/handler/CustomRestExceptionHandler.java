package br.com.sw.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.sw.error.ErrorDetails;
import br.com.sw.exception.ResourceNotFoundException;

@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
	

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex){
		ErrorDetails errorDetails = new ErrorDetails(new Date().getTime(), "Not found", ex.getMessage(), HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<?> handleResourceException(ResourceNotFoundException ex){
//		ErrorDetails errorDetails = new ErrorDetails(new Date().getTime(), "Bad Request", ex.getMessage(), HttpStatus.BAD_REQUEST.value());
//		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
//	}
}
