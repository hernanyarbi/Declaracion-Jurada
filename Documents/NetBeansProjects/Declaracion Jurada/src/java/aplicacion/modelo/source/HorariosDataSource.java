/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.modelo.dominio.Horario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */
public class HorariosDataSource implements Serializable{
    
    private static List<Horario> horarios = new ArrayList<>();
    
    public static void add(Horario horario){
        if(horarios == null){
            horarios = new ArrayList<>();
        }
        horarios.add(horario);
    }
    
    public static Horario searchHorario(int codHorario){
      return null;
    }
}
