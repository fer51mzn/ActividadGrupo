package com.piramide.dao.empresas;

import com.piramide.entidades.Empresa;

import java.util.List;

public interface DAOEmpresas {
    public void add(Empresa empresa);
    public List<Empresa> getAll();
    public List<Empresa> getEmpresa(Empresa empresa);
}
