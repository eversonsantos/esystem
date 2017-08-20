package br.com.casadocodigo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.controller.LivroController;


@EnableWebMvc
@ComponentScan(basePackageClasses = {LivroController.class})
public class AppWebConfigurantion {
	
	@Bean
	public InternalResourceViewResolver internalResourceView (){
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/views/");//Path das paginas
		view.setSuffix(".jsp");//extensão das paginas(.jsp)
		return view;
	}

}
