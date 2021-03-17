package com.piramide.dao.ofertas;

import com.piramide.entidades.Empresa;
import com.piramide.entidades.Oferta;
import com.piramide.entidades.Trabajador;

import java.util.List;

public interface DAOOfertas {
    public List<Oferta> get();
    public List<Oferta> getEmpresa(Empresa empresa);

    public void add(Oferta oferta, Empresa empresa);
    public void add(Oferta oferta, Trabajador trabajador);
    public List<Trabajador> getTrabajadores(Oferta oferta);

}
