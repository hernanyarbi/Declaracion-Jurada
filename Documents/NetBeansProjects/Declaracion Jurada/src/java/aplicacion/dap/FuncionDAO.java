/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dap;

import aplicacion.modelo.dominio.Funcion;

/**
 *
 * @author hernan
 */
public interface FuncionDAO {
    
    /**
     * 
     * @param funcion 
     */
    void add(Funcion funcion);
    
    /**
     * 
     * @param codFucion
     * @return 
     */
    Funcion searchFuncion(int codFucion);
}
