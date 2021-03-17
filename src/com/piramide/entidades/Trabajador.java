package com.piramide.entidades;

import java.io.Serializable;


/**
 * Clase que describe el comportamiento de trabajador
 */
public class Trabajador implements Serializable {
    /**
     * Atributo de titulación
     */

    private Titulacion titulacion;
    /**
     * Atributo de dni
     */
    private String dni;
    /**
     * Atributo de nombre
     */
    private String nombre;

    /**
     * Contructor de Trabajador con DNI
     * @param dni
     */
    public Trabajador(String dni) {
        this.titulacion = titulacion;
        this.dni = dni;
        this.nombre = nombre;
    }

    /**
     *Getter de titulación
     * @return
     */
    public Titulacion getTitulacion() {
        return titulacion;
    }

    /**
     * Getter de DNI
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     * Getter de Nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * TO String
     * @return
     */
    @Override
    public String toString() {
        return "Trabajador{" +
                "titulacion=" + titulacion +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
