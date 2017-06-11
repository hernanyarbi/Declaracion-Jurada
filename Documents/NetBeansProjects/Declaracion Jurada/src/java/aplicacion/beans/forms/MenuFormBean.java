/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.MenuBean;
import aplicacion.modelo.dominio.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hernan
 */
@ManagedBean
@SessionScoped
public class MenuFormBean implements Serializable{

    @ManagedProperty(value="#{menuBean}")
    private MenuBean menuBean;
    private User user;
    
    public MenuFormBean() {
    }
    
    @PostConstruct
    public void init(){
        user = menuBean.sessionUser();
    }

    /**
     * @return the menuBean
     */
    public MenuBean getMenuBean() {
        return menuBean;
    }

    /**
     * @param menuBean the menuBean to set
     */
    public void setMenuBean(MenuBean menuBean) {
        this.menuBean = menuBean;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }
    
}
