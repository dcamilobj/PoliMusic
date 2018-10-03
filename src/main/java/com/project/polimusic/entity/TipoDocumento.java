package com.project.polimusic.entity;

import javax.persistence.*;

@Entity
public class TipoDocumento {
	@Id
	@GeneratedValue
	private Integer idTipoDocumento;
	@Column
	private String descripcion;

	/**
	 * @return the idTipoDocumento
	 */
	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	/**
	 * @param idTipoDocumento
	 *            the idTipoDocumento to set
	 */
	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
