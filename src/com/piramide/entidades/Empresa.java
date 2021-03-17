package com.piramide.entidades;

import java.io.Serializable;

public class Empresa implements Serializable {
    private String cif;
    private String nombre;

    public Empresa(String cif, String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String cif) {
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }
}
