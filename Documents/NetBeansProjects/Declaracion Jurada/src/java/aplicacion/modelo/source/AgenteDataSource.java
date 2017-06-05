/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.source;

import aplicacion.modelo.dominio.Agente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */
public class AgenteDataSource implements Serializable {

    private static List<Agente> agentes = new ArrayList<>();
    
    public static void add(Agente agente){
        System.out.println("agente0");
        if(agentes != null){
            agentes = new ArrayList<>();
        }
        agentes.add(agente);
        System.out.println("agente");
        System.out.println("Nombre:"+agentes.get(0).getNombres().toString());
    }
    
    public static Agente searchAgente(int legajo){
        Agente agente = null;
        if(agentes != null){
            for (Agente agente1 : agentes) {
                if (agente1.getLegajo() == legajo) {
                    agente = agente1;
                }
            }
        }
        return agente;
    }

}
