/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dap;

import aplicacion.modelo.dominio.CargoDeclarado;

/**
 *
 * @author hernan
 */
public interface CargoDeclaracdoDAO {
    
    /**
     * 
     * @param cargo 
     */
    void add(CargoDeclarado cargo);
    
    /**
     * 
     * @param codCargo
     * @return 
     */
    CargoDeclarado searchCargo(int codCargo);
}
