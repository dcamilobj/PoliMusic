/**
 * 
 */
package com.project.polimusic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.polimusic.entity.Perfil;


/**
 * @author grupoMultidisciplinario
 *
 */
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
