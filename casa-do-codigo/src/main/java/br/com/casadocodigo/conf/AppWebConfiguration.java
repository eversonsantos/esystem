package br.com.casadocodigo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.controller.HomeController;
import br.com.casadocodigo.daos.LivroDAO;


@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,
									LivroDAO.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/views/");
		view.setSuffix(".jsp");
		
		return view;
	}

}
