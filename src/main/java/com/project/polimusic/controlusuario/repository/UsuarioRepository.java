package com.project.polimusic.controlusuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.polimusic.controlusuario.entity.Usuario;


/**
 * 
 * @author grupoMultidisciplinario
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

}
