/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dap.UserDAO;
import aplicacion.modelo.dominio.User;
import aplicacion.modelo.source.UserDataSource;
import java.io.Serializable;

/**
 *
 * @author hernan-PC
 */
public class UserDAOImp implements UserDAO, Serializable{

    @Override
    public void add(User user) {
        UserDataSource.add(user);
    }

    
    @Override
    public User searchUser(String username, String pass) {
        return UserDataSource.searchUser(username, pass);
    }
    
}
