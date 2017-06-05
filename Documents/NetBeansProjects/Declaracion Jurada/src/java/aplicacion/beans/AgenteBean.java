/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.dao.imp.AgenteDAOImp;
import aplicacion.dap.AgenteDAO;
import aplicacion.modelo.dominio.Agente;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hernan
 */
@ManagedBean
@ViewScoped
public class AgenteBean {

    private Agente agente;
    private AgenteDAO agenteDao;
    
    public AgenteBean() {
    }
    
    @PostConstruct
    public void init(){
        setAgente(new Agente());
        setAgenteDao(new AgenteDAOImp());
    }
    
    public void add(){
        getAgenteDao().add(getAgente());
    }
    
    public Agente searchAgente(int legajo){
        return getAgenteDao().searchAgente(legajo);
    }

    /**
     * @return the agente
     */
    public Agente getAgente() {
        return agente;
    }

    /**
     * @param agente the agente to set
     */
    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    /**
     * @return the agenteDao
     */
    public AgenteDAO getAgenteDao() {
        return agenteDao;
    }

    /**
     * @param agenteDao the agenteDao to set
     */
    public void setAgenteDao(AgenteDAO agenteDao) {
        this.agenteDao = agenteDao;
    }
}
