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

    Agente agente;
    AgenteDAO agenteDao;
    
    public AgenteBean() {
    }
    
    @PostConstruct
    public void init(){
        agente = new Agente();
        agenteDao = new AgenteDAOImp();
    }
    
    public void add(Agente agente){
        agenteDao.add(agente);
    }
    
    public Agente searchAgente(int legajo){
        return agenteDao.searchAgente(legajo);
    }
}
