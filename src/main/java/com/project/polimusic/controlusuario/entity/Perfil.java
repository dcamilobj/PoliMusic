/**
 * 
 */
package com.project.polimusic.controlusuario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author grupoMultidisciplinario
 *
 */
@Entity
public class Perfil {
	
	@Id
	@GeneratedValue
	private Long idPerfil;
	@Column
	private String nombrePerfil;
	
	/**
	 * @return the idPerfil
	 */
	public Long getIdPerfil() {
		return idPerfil;
	}
	/**
	 * @param idPerfil the idPerfil to set
	 */
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	/**
	 * @return the nombrePerfil
	 */
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	/**
	 * @param nombrePerfil the nombrePerfil to set
	 */
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	
}
