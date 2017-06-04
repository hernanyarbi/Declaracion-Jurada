/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dap;

import aplicacion.modelo.dominio.Horario;

/**
 *
 * @author hernan
 */
public interface HorarioDAO {
    
    void add(Horario horario);
    
    Horario searchHorario(int codHorario);
    
}
