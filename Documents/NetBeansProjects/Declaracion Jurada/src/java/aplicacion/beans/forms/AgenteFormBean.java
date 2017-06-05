/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.AgenteBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hernan
 */
@ManagedBean
@ViewScoped
public class AgenteFormBean {
    
    @ManagedProperty(value = "#{agenteBean}")
    private AgenteBean agenteBean;
    
    public AgenteFormBean() {
    }

    public void add(){
        agenteBean.add();
    }
    /**
     * @return the agenteBean
     */
    public AgenteBean getAgenteBean() {
        return agenteBean;
    }

    /**
     * @param agenteBean the agenteBean to set
     */
    public void setAgenteBean(AgenteBean agenteBean) {
        this.agenteBean = agenteBean;
    }

}
