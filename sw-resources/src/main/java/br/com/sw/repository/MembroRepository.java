/**
 * 
 */
package br.com.sw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sw.model.Membro;

/**
 * @author everson.lisboa
 *
 */
public interface MembroRepository extends JpaRepository<Membro, Long> {

}
