/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.hibernate.dao.imp.UserDAOImp;
import aplicacion.hibernate.dao.UserDAO;
import aplicacion.modelo.dominio.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hernan-PC
 */
@ManagedBean
@ViewScoped
public class RegisterBean implements Serializable{

    private User user;
    private UserDAO userDao;
    
    public RegisterBean() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Nuevas instancias");
        user = new User();
        userDao =  new UserDAOImp();
        System.out.println("Usuario instanciado: "+ user.getName() + user.getUsername());
    }
    
    
    public void add(){
        System.out.println("usuario "+user.getName());
        userDao.add(user);
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
