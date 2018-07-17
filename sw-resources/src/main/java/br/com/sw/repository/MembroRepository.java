/**
 * 
 */
package br.com.sw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sw.model.Membro;

/**
 * @author everson.lisboa
 *
 */
@Transactional
public interface MembroRepository extends JpaRepository<Membro, Long> {

}
