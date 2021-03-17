package com.piramide.dao.empresas;

import com.piramide.entidades.Empresa;

import java.util.List;

/**
 * Interfaz que describe el comportamiento de empresas
 */
public interface DAOEmpresas {
    /**
     * Con este método añadimos una empresa
     * @param empresa
     */
    public void add(Empresa empresa);

    /**
     * Con este método obtendremos la lista de empresas guardada en un recurso
     * @return
     */
    public List<Empresa> getAll();

    /**
     * Con este método obtendremos la lista de empresa en una empresa
     * @param empresa
     * @return
     */
    public List<Empresa> getEmpresa(Empresa empresa);
}
