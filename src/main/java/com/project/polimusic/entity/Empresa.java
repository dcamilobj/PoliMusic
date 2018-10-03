package com.project.polimusic.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Empresa {
	@Id
	@GeneratedValue
	private Integer idEmpresa;
	@ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento listTipoDocumento;
	@Column
	private String nroDocumento;
	@Column
	private String nombre;
	@Column
	private Double pagoOperacion ;
	@Column
	private String estado;
	/**
	 * @return the idEmpresa
	 */
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	/**
	 * @return the listTipoDocumento
	 */
	public TipoDocumento getListTipoDocumento() {
		return listTipoDocumento;
	}
	/**
	 * @param listTipoDocumento the listTipoDocumento to set
	 */
	public void setListTipoDocumento(TipoDocumento listTipoDocumento) {
		this.listTipoDocumento = listTipoDocumento;
	}
	/**
	 * @return the nroDocumento
	 */
	public String getNroDocumento() {
		return nroDocumento;
	}
	/**
	 * @param nroDocumento the nroDocumento to set
	 */
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pagoOperacion
	 */
	public Double getPagoOperacion() {
		return pagoOperacion;
	}
	/**
	 * @param pagoOperacion the pagoOperacion to set
	 */
	public void setPagoOperacion(Double pagoOperacion) {
		this.pagoOperacion = pagoOperacion;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
