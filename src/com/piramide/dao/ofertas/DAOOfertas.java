package com.piramide.dao.ofertas;

import com.piramide.entidades.Empresa;
import com.piramide.entidades.Oferta;

import java.util.List;

public interface DAOOfertas {
    public List<Oferta> get();
    public List<Oferta> getEmpresa(Empresa empresa);
    public void add(Oferta oferta);
    //public void add(Oferta oferta, Empresa empresa);

}
