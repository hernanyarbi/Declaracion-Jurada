/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.hibernate.dao.imp.UserDAOImp;
import aplicacion.hibernate.dao.UserDAO;
import aplicacion.modelo.dominio.User;
import aplicacion.modelo.source.UserDataSource;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author hernan-PC
 */
@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

    private User user;
    private UserDAO userDao;
    public LoginBean() {
    }

    @PostConstruct
    public void init() {
        userDao = new UserDAOImp();
    }

    public String searchUser(String username, String pass) {
        String word = null;
        System.out.println("Bean");
        user = userDao.searchUser(username, pass);
        if (user == null) {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atencion", "Uasuario No Encontrado"));
        } else {
            FacesContext.getCurrentInstance()
                    .getExternalContext()
                    .getSessionMap().put("user", user);
            word = "menu?faces-redirect=true";
        }
        return word;
    }

    public User sessionUser(){
        User user2 = (User)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
        return user2;
    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the userDao
     */
    public UserDAO getUserDao() {
        return userDao;
    }

    /**
     * @param userDao the userDao to set
     */
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

}
