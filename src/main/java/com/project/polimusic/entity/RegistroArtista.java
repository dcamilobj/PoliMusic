package com.project.polimusic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
public class RegistroArtista implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegistroArtista;
    @Column
    private String valor;
    @ManyToOne
    @JoinColumn(name = "id_tipo_campo")
    private TipoCampo listTipoCampo;
    @ManyToOne
    @JoinColumn(name = "id_control_archivo")
    private ControlArchivo listControlArchivo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroArtista that = (RegistroArtista) o;
        return Objects.equals(idRegistroArtista, that.idRegistroArtista);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRegistroArtista);
    }

    public Integer getIdRegistroArtista() {
        return idRegistroArtista;
    }

    public void setIdRegistroArtista(Integer idRegistroArtista) {
        this.idRegistroArtista = idRegistroArtista;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public TipoCampo getListTipoCampo() {
        return listTipoCampo;
    }

    public void setListTipoCampo(TipoCampo listTipoCampo) {
        this.listTipoCampo = listTipoCampo;
    }

    public ControlArchivo getListControlArchivo() {
        return listControlArchivo;
    }

    public void setListControlArchivo(ControlArchivo listControlArchivo) {
        this.listControlArchivo = listControlArchivo;
    }



}
