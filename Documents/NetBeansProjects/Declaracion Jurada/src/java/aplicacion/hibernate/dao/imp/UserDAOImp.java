/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.dao.UserDAO;
import aplicacion.modelo.dominio.User;
import aplicacion.modelo.source.UserDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan-PC
 */
public class UserDAOImp implements UserDAO, Serializable{

    /**
     * 
     * @param user 
     */
    @Override
    public void add(User user) {
        UserDataSource.add(user);
    }

    /**
     * 
     * @param username
     * @param pass
     * @return 
     */
    @Override
    public User searchUser(String username, String pass) {
        return UserDataSource.searchUser(username, pass);
    }

    /**
     * 
     * @param user 
     */
    @Override
    public void upDate(User user) {
        UserDataSource.upDate(user);
    }
    
}
