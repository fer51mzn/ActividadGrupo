package com.piramide.entidades;

public class Oferta {
    private String puesto;
    private String descripcion;
    private Integer salario;
    private Empresa empresa;

    public Oferta(String puesto, String descripcion, Integer salario, Empresa empresa) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.salario = salario;
        this.empresa = empresa;
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

    @Override
    public String toString() {
        return "Oferta{" +
                "puesto='" + puesto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                ", empresa=" + empresa +
                '}';
    }
}
