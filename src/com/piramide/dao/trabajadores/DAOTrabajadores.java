package com.piramide.dao.trabajadores;

import com.piramide.entidades.Trabajador;

import java.util.List;

public interface DAOTrabajadores {
    public void add(Trabajador trabajador);
    public List<Trabajador> getAll();
    public List<Trabajador> getTrabajador(Trabajador trabajador);

}
