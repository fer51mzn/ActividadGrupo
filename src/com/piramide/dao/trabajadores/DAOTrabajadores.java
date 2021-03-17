package com.piramide.dao.trabajadores;

import com.piramide.entidades.Trabajador;

import java.util.List;

/**
 * Interfaz que describe el comportamiento de trabajadores
 */
public interface DAOTrabajadores {
    /**
     * Con este método añadimos una trabajador
     * @param trabajador
     */
    public void add(Trabajador trabajador);
    /**
     * Con este método obtendremos la lista de trabajadores guardada en un recurso
     * @return
     */
    public List<Trabajador> getAll();
    /**
     * Con este método obtendremos la lista de trabajador en una trabajador
     * @param trabajador
     * @return
     */
    public List<Trabajador> getTrabajador(Trabajador trabajador);

}
