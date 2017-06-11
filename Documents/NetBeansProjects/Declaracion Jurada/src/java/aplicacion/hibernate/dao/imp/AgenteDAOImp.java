/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.dao.AgenteDAO;
import aplicacion.modelo.dominio.Agente;
import aplicacion.modelo.source.AgenteDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan
 */
public class AgenteDAOImp implements AgenteDAO, Serializable{

    @Override
    public void add(Agente agente) {
        AgenteDataSource.add(agente);
    }

    @Override
    public Agente searchAgente(int codAgente) {
        return AgenteDataSource.searchAgente(codAgente);
    }
    
}
