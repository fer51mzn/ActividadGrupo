package com.piramide.dao.trabajadores;

import com.piramide.dao.DAOSerializable;
import com.piramide.entidades.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class DAOTrabajadoresSerializable extends DAOSerializable implements DAOTrabajadores {

    List<Trabajador> trabajadores;

    public DAOTrabajadoresSerializable() {
        super("trabajadores");
        Object obj = read();
        if(obj == null) {
            this.trabajadores = new ArrayList<>();
        }
        else this.trabajadores = (List<Trabajador>) obj;
    }

    public void add(Trabajador trabajador) {
        trabajadores.add(trabajador);
        this.save(trabajadores);
    }

    @Override
    public List<Trabajador> getAll() {
        return trabajadores;
    }

    @Override
    public List<Trabajador> getTrabajador(Trabajador trabajador) {
        List<Trabajador> trabajadoresBusqueda = new ArrayList<>();
        for (int i = 0; i < trabajadores.size(); i++) {
            Trabajador actual= trabajadores.get(i);
            if (actual.getDni().equals(trabajador)){
                trabajadoresBusqueda.add(actual);
                this.save(this.trabajadores);
                this.read();
            }
        }
        return trabajadoresBusqueda;
    }


}
