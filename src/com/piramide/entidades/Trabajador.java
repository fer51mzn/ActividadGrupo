package com.piramide.entidades;

public class Trabajador {

    private Titulacion titulacion;
    private String dni;
    private String nombre;

    public Trabajador(String dni) {
        this.titulacion = titulacion;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "titulacion=" + titulacion +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
