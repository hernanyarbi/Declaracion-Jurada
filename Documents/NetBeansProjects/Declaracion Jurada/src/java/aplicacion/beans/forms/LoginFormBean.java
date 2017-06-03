/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.LoginBean;
import aplicacion.modelo.dominio.User;
import aplicacion.modelo.source.UserDataSource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author hernan-PC
 */
@ManagedBean
@RequestScoped
public class LoginFormBean {

    @ManagedProperty(value=("#{userBean}"))
    private LoginBean userBean;
    private String username;
    private String pass;
    public LoginFormBean() {
    
    }
    public String searchUser(){
        System.out.println("FormBean");
        return userBean.searchUser(username, pass);
    }

    /**
     * @return the userBean
     */
    public LoginBean getUserBean() {
        return userBean;
    }

    /**
     * @param userBean the userBean to set
     */
    public void setUserBean(LoginBean userBean) {
        this.userBean = userBean;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
