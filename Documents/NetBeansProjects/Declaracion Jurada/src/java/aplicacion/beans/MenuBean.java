/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.modelo.dominio.User;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author hernan
 */
@ManagedBean
@SessionScoped
public class MenuBean implements Serializable{

    
    public MenuBean() {
    }
    
    public User sessionUser(){
        User user = (User)FacesContext.getCurrentInstance()
                                      .getExternalContext()
                                      .getSessionMap().get("user");
        return user;
    }
    
}
