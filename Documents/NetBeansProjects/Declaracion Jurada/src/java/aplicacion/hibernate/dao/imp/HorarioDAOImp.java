/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.dao.HorarioDAO;
import aplicacion.modelo.dominio.Horario;
import aplicacion.modelo.source.HorariosDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan
 */
public class HorarioDAOImp implements HorarioDAO, Serializable{

    @Override
    public void add(Horario horario) {
        HorariosDataSource.add(horario);
    }

    @Override
    public Horario searchHorario(int codHorario) {
        return HorariosDataSource.searchHorario(codHorario);
    }
    
}
