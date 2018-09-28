/**
 * 
 */
package com.project.polimusic.controlusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.polimusic.controlusuario.entity.LogAuditoria;

/**
 * @author grupoMultidisciplinario
 *
 */
public interface LogAuditoriaRepository  extends JpaRepository<LogAuditoria, Long>{

}
