package com.piramide.dao.ofertas;

import com.piramide.dao.DAOSerializable;
import com.piramide.entidades.Empresa;
import com.piramide.entidades.Oferta;
import com.piramide.entidades.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class DAOOfertasSerializable extends DAOSerializable implements DAOOfertas {

    List<Oferta> ofertas;

    public DAOOfertasSerializable() {
        super("ofertas");
        Object obj = read();
        if(obj == null) {
            this.ofertas = new ArrayList<>();
        }
        else this.ofertas = (List<Oferta>) obj;
    }

    public void add(Oferta oferta) {
        ofertas.add(oferta);
        this.save(ofertas);
    }

    @Override
    public List<Oferta> get() {
        return ofertas;
    }

    @Override
    public List<Oferta> getEmpresa(Empresa empresa) {
        List<Oferta> ofertasBusqueda = new ArrayList<>();
        for (int i = 0; i < ofertas.size(); i++) {
            Oferta actual= ofertas.get(i);
            if (actual.getEmpresa().equals(empresa)){
                ofertasBusqueda.add(actual);
            }
        }
        return ofertasBusqueda;
    }

    @Override
    public void add(Oferta oferta, Empresa empresa) {
        oferta.setEmpresa(empresa);
        ofertas.add(oferta); //solo si no existe la oferta, si existe habría que buscarla
        save(ofertas);
    }

    @Override
    public void add(Oferta oferta, Trabajador trabajador) {
        oferta.add(trabajador);
        ofertas.add(oferta); //solo si no existe la oferta, si existe habría que buscarla
        save(ofertas);
    }

    @Override
    public List<Trabajador> getTrabajadores(Oferta oferta) {
        //habría que buscar la oferta en la lista
        return oferta.getTrabajadores();
    }

}
