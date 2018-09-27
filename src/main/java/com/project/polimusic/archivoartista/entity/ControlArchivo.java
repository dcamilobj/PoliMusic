package com.project.polimusic.archivoartista.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
public class ControlArchivo implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idControlArchivo;
    @Column
    private LocalDateTime fechaCargue;
    @Column
    private String nombreArchivo;
    @Column
    private Integer cantidadLeidos;
    @Column
    private Integer cantidadErrores;

    public Integer getIdControlArchivo() {
        return idControlArchivo;
    }

    public void setIdControlArchivo(Integer idControlArchivo) {
        this.idControlArchivo = idControlArchivo;
    }

    public LocalDateTime getFechaCargue() {
        return fechaCargue;
    }

    public void setFechaCargue(LocalDateTime fechaCargue) {
        this.fechaCargue = fechaCargue;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getCantidadLeidos() {
        return cantidadLeidos;
    }

    public void setCantidadLeidos(Integer cantidadLeidos) {
        this.cantidadLeidos = cantidadLeidos;
    }

    public Integer getCantidadErrores() {
        return cantidadErrores;
    }

    public void setCantidadErrores(Integer cantidadErrores) {
        this.cantidadErrores = cantidadErrores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControlArchivo that = (ControlArchivo) o;
        return Objects.equals(idControlArchivo, that.idControlArchivo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idControlArchivo);
    }
}