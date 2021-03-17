package com.piramide.dao;

import com.piramide.dao.empresas.DAOEmpresas;
import com.piramide.dao.empresas.DAOEmpresasSerializable;
import com.piramide.dao.ofertas.DAOOfertas;
import com.piramide.dao.ofertas.DAOOfertasSerializable;
import com.piramide.dao.trabajadores.DAOTrabajadores;
import com.piramide.dao.trabajadores.DAOTrabajadoresSerializable;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private DAOEmpresas daoEmpresas;
    private DAOTrabajadores daoTrabajadores;
    private DAOOfertas daoOfertas;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOEmpresas getDaoEmpresas() {
        if(daoEmpresas == null){
            daoEmpresas = new DAOEmpresasSerializable() {
                @Override
                public void save() {

                }

                @Override
                public Object read() {

                    return null;
                }
            };
        }
        return daoEmpresas;
    }

    public DAOTrabajadores getDaoTrabajadores() {
        if( daoTrabajadores == null){
            daoTrabajadores = new DAOTrabajadoresSerializable() {
                @Override
                public void save() {

                }

                @Override
                public Object read() {

                    return null;
                }
            };
        }
        return daoTrabajadores;
    }

    public DAOOfertas getDaoOfertas() {
        if( daoOfertas == null){
            daoOfertas = new DAOOfertasSerializable();
        }
        return daoOfertas;
    }
}
