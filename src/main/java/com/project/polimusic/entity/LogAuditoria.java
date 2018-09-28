/**
 * 
 */
package com.project.polimusic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * @author grupoMultidisciplinario
 *
 */
@Entity
public class LogAuditoria {

	@Id
	@GeneratedValue
	private Long idLogAuditoria;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	@Column
	private String tipoAccion;
	@Column
	private Date fecha;
	@Column
	private String nombreTabla;
	@Column
	private Long numeroPK;
	@Column
	private String descripcion;
	/**
	 * @return the idLogAuditoria
	 */
	public Long getIdLogAuditoria() {
		return idLogAuditoria;
	}
	/**
	 * @param idLogAuditoria the idLogAuditoria to set
	 */
	public void setIdLogAuditoria(Long idLogAuditoria) {
		this.idLogAuditoria = idLogAuditoria;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the tipoAccion
	 */
	public String getTipoAccion() {
		return tipoAccion;
	}
	/**
	 * @param tipoAccion the tipoAccion to set
	 */
	public void setTipoAccion(String tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the nombreTabla
	 */
	public String getNombreTabla() {
		return nombreTabla;
	}
	/**
	 * @param nombreTabla the nombreTabla to set
	 */
	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}
	/**
	 * @return the numeroPK
	 */
	public Long getNumeroPK() {
		return numeroPK;
	}
	/**
	 * @param numeroPK the numeroPK to set
	 */
	public void setNumeroPK(Long numeroPK) {
		this.numeroPK = numeroPK;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
