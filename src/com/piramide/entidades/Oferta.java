package com.piramide.entidades;

import java.io.Serializable;
import java.util.List;

public class Oferta implements Serializable {
    private String puesto;
    private String descripcion;
    private Integer salario;
    private Empresa empresa;
    private List<Trabajador> trabajadores;

    public Oferta(String puesto, String descripcion, Integer salario, Empresa empresa, List<Trabajador> trabajadores) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.salario = salario;
        this.empresa = empresa;
        this.trabajadores = trabajadores;
    }

    public void add(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getSalario() {
        return salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }



    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
