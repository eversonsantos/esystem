/**
 * 
 */
package br.com.sw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sw.model.Membro;
import br.com.sw.model.Raca;

/**
 * @author everson.lisboa
 *
 */
public interface RacaRepository extends JpaRepository<Raca, Long> {

}
