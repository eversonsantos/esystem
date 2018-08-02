package br.com.sw.swresources;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sw.model.Raca;
import br.com.sw.repository.RacaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwResourcesApplicationTests {

	@Autowired
	private RacaRepository racaRepository;
	
	@Test
	public void contextLoads() {
		
		Raca raca = new Raca();
		raca.setNome("Tauren");
		raca.setAtualizacao(new Date());
		raca.setSituacao("A");
		raca.setUsuario("test");
		this.racaRepository.save(raca);
		
		
		assertNotNull(raca.getCodigo());
	}

}
