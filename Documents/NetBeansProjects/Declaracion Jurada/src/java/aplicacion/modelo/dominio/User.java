package aplicacion.modelo.dominio;
// Generated 14-jun-2017 18:20:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String username;
     private String password;
     private String name;
     private String lastname;
     private char sex;
     private String tel;
     private Set agente = new HashSet(0);

    public User() {
    }

	
    public User(String username, String password, String name, String lastname, char sex) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
    }
    public User(String username, String password, String name, String lastname, char sex, String tel, Set agente) {
       this.username = username;
       this.password = password;
       this.name = name;
       this.lastname = lastname;
       this.sex = sex;
       this.tel = tel;
       this.agente = agente;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public char getSex() {
        return this.sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Set getAgente() {
        return this.agente;
    }
    
    public void setAgente(Set agente) {
        this.agente = agente;
    }




}


