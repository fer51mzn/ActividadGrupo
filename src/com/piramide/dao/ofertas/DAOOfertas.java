package com.piramide.dao.ofertas;

import com.piramide.entidades.Empresa;
import com.piramide.entidades.Oferta;
import com.piramide.entidades.Trabajador;

import java.util.List;

/**
 * Interfaz que describe el comportamiento de ofertas
 */
public interface DAOOfertas {
    /**
     * Con este método obtendremos la lista de ofertas guardada en un recurso
     * @return lista de ofertas
     */
    public List<Oferta> get();

    /**
     * Con este método obtendremos la lista de ofertas en una empresa
     * @param empresa
     * @return
     */
    public List<Oferta> getEmpresa(Empresa empresa);

    /**
     * Con este método añadimos una oferta en una empresa
     * @param oferta
     * @param empresa
     */
    public void add(Oferta oferta, Empresa empresa);

    /**
     * Con este método añadimos una oferta a un trabajador
     * @param oferta
     * @param trabajador
     */
    public void add(Oferta oferta, Trabajador trabajador);

    /**
     * Con este método obtendremos la lista de trabajadores en una oferta
     * @param oferta
     * @return
     */
    public List<Trabajador> getTrabajadores(Oferta oferta);

}
