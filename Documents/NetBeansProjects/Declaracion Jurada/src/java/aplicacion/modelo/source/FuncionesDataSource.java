/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.modelo.dominio.Funcion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */
public class FuncionesDataSource implements Serializable{
    
    private static List<Funcion> funciones = new ArrayList<>();
    
    public static void add(Funcion funcion){
        if(funciones == null){
            funciones = new ArrayList<>();
        }
        funciones.add(funcion);
    }
    
    public static Funcion searchFuncion(int codFuncion){
        Funcion funcion = null;
        
        return funcion;
    }
    
}
