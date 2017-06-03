/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.RegisterBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Trabajo Y Estudio
 */
@ManagedBean
@ViewScoped
public class RegisterFormBean {
    
    @ManagedProperty(value = "#{registerBean}")
    private RegisterBean registerBean;
    public RegisterFormBean() {
    }

    public void add(){
        registerBean.add(); 
    }
    
    /**
     * @return the registerBean
     */
    public RegisterBean getRegisterBean() {
        return registerBean;
    }

    /**
     * @param registerBean the registerBean to set
     */
    public void setRegisterBean(RegisterBean registerBean) {
        this.registerBean = registerBean;
    }
    
}
