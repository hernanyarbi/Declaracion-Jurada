/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.hibernate.config.HibernateUtil;
import aplicacion.modelo.dominio.Agente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author hernan
 */
public class AgenteDataSource implements Serializable {

    private static List<Agente> agentes = new ArrayList<>();
    
    public static void add(Agente agente){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(agente);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void upDate(Agente agente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(agente);
        session.getTransaction().commit();
        session.close();
    }
    
    public static Agente searchAgente(int legajo){
        Agente agente = null;
        
        return agente;
    }

}
