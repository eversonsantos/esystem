package br.com.webstore.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.webstore.validator.EnderecoValidator;

public class ServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebConfiguration.class, PersistenceConfiguration.class, EnderecoValidator.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	
}
