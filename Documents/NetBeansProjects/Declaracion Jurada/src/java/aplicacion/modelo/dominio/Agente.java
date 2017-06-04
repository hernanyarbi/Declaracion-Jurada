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
public class Agente implements Serializable{

    private int legajo;
    private String tipoNumDoc;
    private String numMatricula;
    private String dm;
    private Date fhNac;
    private char sexo;
    private String estCivil;
    private int cuitCuil;
    private String apellido;
    private String apellidoCasada;
    private String nombres;
    private String ocupacion;
    private String titulo;
    private String provincia;
    private int cp;
    private String localidad;
    private String barrio;
    private String calle;
    private int num;
    private int telefono;
    private String email;
    private boolean estado;

    public Agente() {
    }

    public Agente(int legajo,
            String tipoNumDoc,
            String numMatricula,
            String dm, Date fhNac,
            char sexo, String estCivil,
            int cuitCuil, String apellido,
            String apellidoCasada,
            String nombres,
            String ocupacion,
            String titulo,
            String provincia,
            int cp,
            String localidad,
            String barrio,
            String calle,
            int num,
            int telefono,
            String email,
            boolean estado) {
        this.legajo = legajo;
        this.tipoNumDoc = tipoNumDoc;
        this.numMatricula = numMatricula;
        this.dm = dm;
        this.fhNac = fhNac;
        this.sexo = sexo;
        this.estCivil = estCivil;
        this.cuitCuil = cuitCuil;
        this.apellido = apellido;
        this.apellidoCasada = apellidoCasada;
        this.nombres = nombres;
        this.ocupacion = ocupacion;
        this.titulo = titulo;
        this.provincia = provincia;
        this.cp = cp;
        this.localidad = localidad;
        this.barrio = barrio;
        this.calle = calle;
        this.num = num;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }

    /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the tipoNumDoc
     */
    public String getTipoNumDoc() {
        return tipoNumDoc;
    }

    /**
     * @param tipoNumDoc the tipoNumDoc to set
     */
    public void setTipoNumDoc(String tipoNumDoc) {
        this.tipoNumDoc = tipoNumDoc;
    }

    /**
     * @return the numMatricula
     */
    public String getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the dm
     */
    public String getDm() {
        return dm;
    }

    /**
     * @param dm the dm to set
     */
    public void setDm(String dm) {
        this.dm = dm;
    }

    /**
     * @return the fhNac
     */
    public Date getFhNac() {
        return fhNac;
    }

    /**
     * @param fhNac the fhNac to set
     */
    public void setFhNac(Date fhNac) {
        this.fhNac = fhNac;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the estCivil
     */
    public String getEstCivil() {
        return estCivil;
    }

    /**
     * @param estCivil the estCivil to set
     */
    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    /**
     * @return the cuitCuil
     */
    public int getCuitCuil() {
        return cuitCuil;
    }

    /**
     * @param cuitCuil the cuitCuil to set
     */
    public void setCuitCuil(int cuitCuil) {
        this.cuitCuil = cuitCuil;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the apellidoCasada
     */
    public String getApellidoCasada() {
        return apellidoCasada;
    }

    /**
     * @param apellidoCasada the apellidoCasada to set
     */
    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp) {
        this.cp = cp;
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
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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


}
