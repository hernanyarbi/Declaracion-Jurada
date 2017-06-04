/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.modelo.dominio.CargoDeclarado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */
public class CargosDeclaradosDataSource implements Serializable{
    
    private static List<CargoDeclarado> cargos = new ArrayList<>();
    
    public static void add(CargoDeclarado cargo){
        if(cargos == null){
            cargos = new ArrayList<>();
        }
        cargos.add(cargo);
    }
    
    public static CargoDeclarado searchCargo(int codCargo){
        CargoDeclarado cargo =  null;
        if(cargos != null){
            for (CargoDeclarado cargo1 : cargos) {
                if(cargo1.getCodCargo() == codCargo){
                    cargo = cargo1;
                }
            }
        }
        return cargo;
    }
}
