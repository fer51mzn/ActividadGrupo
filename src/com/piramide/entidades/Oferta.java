package com.piramide.entidades;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que describe el comportamiento de oferta
 */
public class Oferta implements Serializable {
    /**
     * Atributo puesto
     */
    private String puesto;
    /**
     * Atributo descripcion
     */
    private String descripcion;
    /**
     * Atributo salario
     */
    private Integer salario;
    /**
     * Atributo empresa
     */
    private Empresa empresa;
    /**
     * Atributo de lista de trabajadores
     */
    private List<Trabajador> trabajadores;

    /**
     * Constructor de Oferta con puesto , descripcion, salario, empresa y lista de trabajadores
     */
    public Oferta(String puesto, String descripcion, Integer salario, Empresa empresa, List<Trabajador> trabajadores) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.salario = salario;
        this.empresa = empresa;
        this.trabajadores = trabajadores;
    }

    /**
     * Con este metodo añadimos un trabajador
     * @param trabajador
     */
    public void add(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }

    /**
     * Con este metodo obtendremos la Lista de Trabajadores
     * @return
     */
    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    /**
     * Getter de puesto
     * @return
     */

    public String getPuesto() {
        return puesto;
    }

    /**
     *Getter de Descripcion
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *Getter de salario
     * @return
     */
    public Integer getSalario() {
        return salario;
    }

    /**
     * Getter de empresa
     * @return
     */
    public Empresa getEmpresa() {
        return empresa;
    }


    /**
     * Setter de puesto
     * @param puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Setter de descripcion
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Setter de salario
     * @param salario
     */
    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    /**
     * Setter de empresa
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Setter de trabajadores
     * @param trabajadores
     */
    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
