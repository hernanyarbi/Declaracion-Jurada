/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hernan-PC
 */
public class CargoDeclarado implements Serializable{
    
    private int codCargo;
    private String dependencia;
    private String imput;
    private String provincia;
    private String localidad;
    private String calle;
    private int num;
    private int codAgente;
    private int codfuncion;
    private Date fhIngreso;
    private String estadoCargo;
    private boolean estado;
    private String lugar;
    private Date fecha;

    public CargoDeclarado() {
    }

    public CargoDeclarado(int codCargo, 
            String dependencia, 
            String imput,
            String provincia,
            String localidad,
            String calle, 
            int num,
            int codAgente,
            int codfuncion, 
            Date fhIngreso, 
            String estadoCargo, 
            boolean estado,
            String lugar,
            Date fecha) {
        
        this.codCargo = codCargo;
        this.dependencia = dependencia;
        this.imput = imput;
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.num = num;
        this.codAgente = codAgente;
        this.codfuncion = codfuncion;
        this.fhIngreso = fhIngreso;
        this.estadoCargo = estadoCargo;
        this.estado = estado;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    /**
     * @return the codCargo
     */
    public int getCodCargo() {
        return codCargo;
    }

    /**
     * @param codCargo the codCargo to set
     */
    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    /**
     * @return the dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * @param dependencia the dependencia to set
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * @return the imput
     */
    public String getImput() {
        return imput;
    }

    /**
     * @param imput the imput to set
     */
    public void setImput(String imput) {
        this.imput = imput;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the codAgente
     */
    public int getCodAgente() {
        return codAgente;
    }

    /**
     * @param codAgente the codAgente to set
     */
    public void setCodAgente(int codAgente) {
        this.codAgente = codAgente;
    }

    /**
     * @return the codfuncion
     */
    public int getCodfuncion() {
        return codfuncion;
    }

    /**
     * @param codfuncion the codfuncion to set
     */
    public void setCodfuncion(int codfuncion) {
        this.codfuncion = codfuncion;
    }

    /**
     * @return the fhIngreso
     */
    public Date getFhIngreso() {
        return fhIngreso;
    }

    /**
     * @param fhIngreso the fhIngreso to set
     */
    public void setFhIngreso(Date fhIngreso) {
        this.fhIngreso = fhIngreso;
    }

    /**
     * @return the estadoCargo
     */
    public String getEstadoCargo() {
        return estadoCargo;
    }

    /**
     * @param estadoCargo the estadoCargo to set
     */
    public void setEstadoCargo(String estadoCargo) {
        this.estadoCargo = estadoCargo;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
