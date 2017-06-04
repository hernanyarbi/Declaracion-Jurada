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
public class Horario {
    
    private int codHor;
    private String dia;
    private double desde;
    private double hasta;
    private int codCargo;
    private boolean estado;

    public Horario() {
    }

    public Horario(int codHor, String dia, double desde, double hasta, int codCargo, boolean estado) {
        this.codHor = codHor;
        this.dia = dia;
        this.desde = desde;
        this.hasta = hasta;
        this.codCargo = codCargo;
        this.estado = estado;
    }

    /**
     * @return the codHor
     */
    public int getCodHor() {
        return codHor;
    }

    /**
     * @param codHor the codHor to set
     */
    public void setCodHor(int codHor) {
        this.codHor = codHor;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the desde
     */
    public double getDesde() {
        return desde;
    }

    /**
     * @param desde the desde to set
     */
    public void setDesde(double desde) {
        this.desde = desde;
    }

    /**
     * @return the hasta
     */
    public double getHasta() {
        return hasta;
    }

    /**
     * @param hasta the hasta to set
     */
    public void setHasta(double hasta) {
        this.hasta = hasta;
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
