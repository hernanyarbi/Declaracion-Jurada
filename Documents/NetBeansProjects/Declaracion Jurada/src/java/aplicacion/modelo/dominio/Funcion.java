/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author hernan-PC
 */
public class Funcion {
    
    private int codFuncion;
    private String nombre;
    private int cargaHor;

    public Funcion() {
    }

    public Funcion(int codFuncion, String nombre, int cargaHor) {
        this.codFuncion = codFuncion;
        this.nombre = nombre;
        this.cargaHor = cargaHor;
    }

    /**
     * @return the codFuncion
     */
    public int getCodFuncion() {
        return codFuncion;
    }

    /**
     * @param codFuncion the codFuncion to set
     */
    public void setCodFuncion(int codFuncion) {
        this.codFuncion = codFuncion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cargaHor
     */
    public int getCargaHor() {
        return cargaHor;
    }

    /**
     * @param cargaHor the cargaHor to set
     */
    public void setCargaHor(int cargaHor) {
        this.cargaHor = cargaHor;
    }
    
    
}
