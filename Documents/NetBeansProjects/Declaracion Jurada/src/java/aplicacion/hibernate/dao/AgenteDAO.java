/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Agente;

/**
 *
 * @author hernan
 */
public interface AgenteDAO{
    /**
     * 
     * @param agente 
     */
    void add(Agente agente);
    
    /**
     * 
     * @param codAgente
     * @return 
     */
    Agente searchAgente(int codAgente);
}
