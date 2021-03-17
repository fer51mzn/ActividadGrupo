package com.piramide.dao;

import com.piramide.dao.empresas.DAOEmpresas;
import com.piramide.dao.empresas.DAOEmpresasSerializable;
import com.piramide.dao.ofertas.DAOOfertas;
import com.piramide.dao.ofertas.DAOOfertasSerializable;
import com.piramide.dao.trabajadores.DAOTrabajadores;
import com.piramide.dao.trabajadores.DAOTrabajadoresSerializable;

/**
 * Clase Factoria
 */
public class DAOFactory {
    /**
     * Atributo DAOFactory
     */
    private static DAOFactory daoFactory;
    /**
     * Atributo daoEmpresa
     */
    private DAOEmpresas daoEmpresas;
    /**
     * Atributo daoTrabajadores
     */
    private DAOTrabajadores daoTrabajadores;
    /**
     * Atributo daoOfertas
     */
    private DAOOfertas daoOfertas;

    /**
     * Constructor de la factoria
     */
    private DAOFactory(){}

    /**
     * Constructor getInstance
     * @return
     */
    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    /**
     * Constructor getDaoEmpresas
     * @return
     */
    public DAOEmpresas getDaoEmpresas() {
        if(daoEmpresas == null){
            daoEmpresas = new DAOEmpresasSerializable();
        }
        return daoEmpresas;
    }

    /**
     * Constructor getDaoTrabajadores
     * @return
     */
    public DAOTrabajadores getDaoTrabajadores() {
        if( daoTrabajadores == null){
            daoTrabajadores = new DAOTrabajadoresSerializable() {
            };
        }
        return daoTrabajadores;
    }

    /**
     * Constructor getDaoOfertas
     * @return
     */
    public DAOOfertas getDaoOfertas() {
        if( daoOfertas == null){
            daoOfertas = new DAOOfertasSerializable();
        }
        return daoOfertas;
    }
}
