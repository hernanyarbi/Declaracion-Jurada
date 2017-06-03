/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.modelo.dominio.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan-PC
 */
public class UserDataSource implements Serializable {

    private static List<User> users = new ArrayList<User>();

    public static void add(User user) {
        if (users == null) {
            users = new ArrayList<>();
        }
        users.add(user);
    }

    public static User searchUser(String username, String pass) {
        User user = null;
        users.add(new User("ejemplo1", "123456", "Ejemplo1", "Ejemplo.1", false, 0, 0));
        users.add(new User("ejemplo2", "123789", "Ejemplo2", "Ejemplo.2", true, 0, 0));
        users.add(new User("ejemplo3", "456789", "Ejemplo3", "Ejemplo.3", false, 0, 0));
        System.out.println(users);
        for (User user1 : users) {
            if (user1.getUsername().equals(username) && user1.getPassword().equals(pass)) {
                user = user1;
                break;
            }

        }
        return user;
    }

}
