package com.project.polimusic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Artistas {
	@Id
	@GeneratedValue
	private Integer idArtista;
	@ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento listTipoDocumento;
	@Column
	private String nroDocumento;
	@Column
	private String primerNombre;
	@Column
	private String segundoNombre;
	@Column
	private String primerApellido;
	@Column
	private String segundoApellido;
	@Column
	private String nombreArtistico;
	@ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa listEmpresa;
	@Column
	private String estado;
	/**
	 * @return the idArtista
	 */
	public Integer getIdArtista() {
		return idArtista;
	}
	/**
	 * @param idArtista the idArtista to set
	 */
	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
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
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}
	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}
	/**
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the nombreArtistico
	 */
	public String getNombreArtistico() {
		return nombreArtistico;
	}
	/**
	 * @param nombreArtistico the nombreArtistico to set
	 */
	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}
	/**
	 * @return the listEmpresa
	 */
	public Empresa getListEmpresa() {
		return listEmpresa;
	}
	/**
	 * @param listEmpresa the listEmpresa to set
	 */
	public void setListEmpresa(Empresa listEmpresa) {
		this.listEmpresa = listEmpresa;
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
