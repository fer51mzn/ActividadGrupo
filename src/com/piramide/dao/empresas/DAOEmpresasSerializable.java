package com.piramide.dao.empresas;

import com.piramide.dao.DAOSerializable;
import com.piramide.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public abstract class DAOEmpresasSerializable extends DAOSerializable implements DAOEmpresas {

    List<Empresa> empresas;

    public DAOEmpresasSerializable() {
        super("empresas");
        Object obj = read();
        if(obj == null) {
            this.empresas = new ArrayList<>();
        }
        else this.empresas = (List<Empresa>) obj;
    }

    @Override
    public void add(Empresa empresa) {
        this.empresas.add(empresa);
        this.save(this.empresas);
    }

    @Override
    public List<Empresa> getAll() {
        return empresas;
    }

    public List<Empresa> getEmpresa(Empresa empresa) {
        List<Empresa> empresasBusqueda = new ArrayList<>();
        for (int i = 0; i < empresas.size(); i++) {
            Empresa actual= empresas.get(i);
            if (actual.getCif().equals(empresa)){
                empresasBusqueda.add(actual);
            }
        }
        return empresasBusqueda;
    }

    @Override
    public void save() {

    }

    @Override
    public Object read() {
        return null;
    }


}
