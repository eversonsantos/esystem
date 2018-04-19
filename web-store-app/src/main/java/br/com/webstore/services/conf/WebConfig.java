package br.com.webstore.services.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.webstore.services.controller.PessoaController;
import br.com.webstore.services.repository.PessoaRepository;

@EnableWebMvc
@ComponentScan(basePackageClasses = {PessoaController.class,
									 PessoaRepository.class})
public class WebConfig extends WebMvcConfigurerAdapter{

}
