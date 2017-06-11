/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.hibernate.config.HibernateUtil;
import aplicacion.modelo.dominio.User;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hernan-PC
 */
public class UserDataSource implements Serializable {

    public static void add(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    public static void upDate(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    public static User searchUser(String username, String pass) {
        User user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.like("username", username))
                .add(Restrictions.like("password", pass));
        if (!criteria.list().isEmpty()) {
            user = new User();
            user = (User) criteria.list().get(0);
        }
        session.close();
        return user;
    }

}
