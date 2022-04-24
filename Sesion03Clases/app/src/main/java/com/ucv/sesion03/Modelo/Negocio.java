package com.ucv.sesion03.Modelo;

import java.io.Serializable;

public class Negocio implements Serializable {
    private String nombre;
    private Integer foto;
    private Integer fotolocal;

    public Negocio() {
    }

    public Negocio(String nombre, Integer foto, Integer fotolocal) {

        this.nombre = nombre;
        this.foto = foto;
        this.fotolocal = fotolocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getFotolocal() {
        return fotolocal;
    }

    public void setFotolocal(Integer fotolocal) {
        this.fotolocal = fotolocal;
    }
}
