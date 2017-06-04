/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dap.FuncionDAO;
import aplicacion.modelo.dominio.Funcion;
import aplicacion.modelo.source.FuncionesDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan
 */
public class FuncionDAOImp implements FuncionDAO, Serializable{

    @Override
    public void add(Funcion funcion) {
        FuncionesDataSource.add(funcion);
    }

    @Override
    public Funcion searchFuncion(int codFucion) {
        return FuncionesDataSource.searchFuncion(codFucion);
    }
    
}
