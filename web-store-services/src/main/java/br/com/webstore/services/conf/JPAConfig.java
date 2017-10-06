package br.com.webstore.services.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.webstore.services.dominio.DominioDialect;
import br.com.webstore.services.dominio.DominioDriverConf;
import br.com.webstore.services.dominio.DominioPackge;
import br.com.webstore.services.repository.PessoaRepository;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses={PessoaRepository.class})
public class JPAConfig {
	
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityFactoryBean(){
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(DominioPackge.MODEL.getPackge());
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(adapter);
		em.setJpaProperties(additionalProperties());
		return em;
	}

	@Bean
	public Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", DominioDialect.POSTGRESQL.getDialect());
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		return properties;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DominioDriverConf.POSTGRESQL.getDriver());
		dataSource.setUrl(DominioDriverConf.POSTGRESQL.getUrl().concat("storeweb").toString());
		dataSource.setUsername(DominioDriverConf.POSTGRESQL.getLogin());
		dataSource.setPassword(DominioDriverConf.POSTGRESQL.getPassword());
		return dataSource;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
	}

}
