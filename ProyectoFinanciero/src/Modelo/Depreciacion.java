/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GM
 */
public class Depreciacion {
    
    private Double D;
    private Double P;
    private Integer N;
    private Double L;
    private Double porcentajeL;

    public Depreciacion(Double P, Integer N, Double porcentajeL) {
        this.P = P;
        this.N = N;
        this.porcentajeL = porcentajeL;
    }

    public Depreciacion() {
    }
    
    

    public Double getD() {
        return D;
    }

    public void setD(Double D) {
        this.D = D;
    }

    public Double getP() {
        return P;
    }

    public void setP(Double P) {
        this.P = P;
    }

    public Integer getN() {
        return N;
    }

    public void setN(Integer N) {
        this.N = N;
    }

    public Double getL() {
        return L;
    }

    public void setL(Double L) {
        this.L = L;
    }

    public Double getPorcentajeL() {
        return porcentajeL;
    }

    public void setPorcentajeL(Double porcentajeL) {
        this.porcentajeL = porcentajeL;
    }
    
}
