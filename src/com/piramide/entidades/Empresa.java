package com.piramide.entidades;

import java.io.Serializable;

/**
 * Clase que describe el comportamiento de empresa
 */
public class Empresa implements Serializable {
    /**
     * Atributo CIF
     */
    private String cif;
    /**
     * Atributo nombre
     */
    private String nombre;
    /**
     * Constructor de empresa con CIF y nombre
     */
    public Empresa(String cif, String nombre) {
        this.nombre = nombre;
    }
    /**
     * Constructor de empresa con CIF
     */
    public Empresa(String cif) {
        this.cif = cif;
    }
    /**
     * Getter de CIF
     */
    public String getCif() {
        return cif;
    }
    /**
     * Getter de Nombre
     */
    public String getNombre() {
        return nombre;
    }
}
