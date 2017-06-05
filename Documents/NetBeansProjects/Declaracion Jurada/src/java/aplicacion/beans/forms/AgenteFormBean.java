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
    private boolean disabledForm;
    private boolean disabledButtomm;
    
    public AgenteFormBean() {
    }

    public void add(){
        //agenteBean.add();
        disabledForm = disabled(false);
        disabledButtomm = disabled(true);
    }
    
    
    public boolean disabled(boolean dis){
        if(dis){
            dis = false;
        }else{
            dis =true;
        }
        return dis;
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

    /**
     * @return the disabledForm
     */
    public boolean isDisabledForm() {
        return disabledForm;
    }

    /**
     * @param disabledForm the disabledForm to set
     */
    public void setDisabledForm(boolean disabledForm) {
        this.disabledForm = disabledForm;
    }

    /**
     * @return the disabledButtomm
     */
    public boolean isDisabledButtomm() {
        return disabledButtomm;
    }

    /**
     * @param disabledButtomm the disabledButtomm to set
     */
    public void setDisabledButtomm(boolean disabledButtomm) {
        this.disabledButtomm = disabledButtomm;
    }
    
}
