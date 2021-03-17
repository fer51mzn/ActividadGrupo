package com.piramide.dao.ofertas;

import com.piramide.dao.DAOSerializable;
import com.piramide.entidades.Empresa;
import com.piramide.entidades.Oferta;

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

}
