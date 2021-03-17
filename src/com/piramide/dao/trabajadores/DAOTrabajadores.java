package com.piramide.dao.trabajadores;

import com.piramide.entidades.Trabajador;

import java.util.List;

public interface DAOTrabajadores {
    public void add(Trabajador trabajador);
    public List<Trabajador> get();
    public List<Trabajador> getTrabajador(Trabajador trabajador);

    void save();
    Object read();
}
