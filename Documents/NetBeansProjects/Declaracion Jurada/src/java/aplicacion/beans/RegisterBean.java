/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.dao.imp.UserDAOImp;
import aplicacion.dap.UserDAO;
import aplicacion.modelo.dominio.User;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Trabajo Y Estudio
 */
@ManagedBean
@ViewScoped
public class RegisterBean {

    private User user;
    private UserDAO userDao;
    public RegisterBean() {
    }

    @PostConstruct
    public void init() {
        setUser(new User());
        setUserDao(new UserDAOImp());
    }
    
    
    public void add(){
        getUserDao().add(user);
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
