package com.project.polimusic.archivoartista.entity;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
public class TipoCampo implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoCampo;
    @Column
    private String nombreCampo;

    public Integer getIdTipoCampo() {
        return idTipoCampo;
    }

    public void setIdTipoCampo(Integer idTipoCampo) {
        this.idTipoCampo = idTipoCampo;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }


}