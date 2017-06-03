/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dap;

import aplicacion.modelo.dominio.User;

/**
 *
 * @author hernan-PC
 */
public interface UserDAO {
    /**
     * 
     * @param user 
     */
    void add(User user);
    /**
     * 
     * @param username
     * @param pass
     * @return 
     */
    User searchUser(String username, String pass);
}
