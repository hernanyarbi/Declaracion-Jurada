/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dap.CargoDeclaracdoDAO;
import aplicacion.modelo.dominio.CargoDeclarado;
import aplicacion.modelo.source.CargosDeclaradosDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan
 */
public class CargoDecalaradoDAOImp implements CargoDeclaracdoDAO, Serializable{

    @Override
    public void add(CargoDeclarado cargo) {
        CargosDeclaradosDataSource.add(cargo);
    }

    @Override
    public CargoDeclarado searchCargo(int codCargo) {
        return CargosDeclaradosDataSource.searchCargo(codCargo);
    }
    
}
