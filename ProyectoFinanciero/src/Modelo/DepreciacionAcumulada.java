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
public class DepreciacionAcumulada {
    
    private Integer numeroAnio;
    private Double depreciacionAnual;
    private Double depreciacionAcumulada;
    private Double valorLibros;

    public DepreciacionAcumulada(Integer numeroAnio, Double depreciacionAnual, Double depreciacionAcumulada, Double valorLibros) {
        this.numeroAnio = numeroAnio;
        this.depreciacionAnual = depreciacionAnual;
        this.depreciacionAcumulada = depreciacionAcumulada;
        this.valorLibros = valorLibros;
    }

    public Integer getNumeroAnio() {
        return numeroAnio;
    }

    public void setNumeroAnio(Integer numeroAnio) {
        this.numeroAnio = numeroAnio;
    }

    public Double getDepreciacionAnual() {
        return depreciacionAnual;
    }

    public void setDepreciacionAnual(Double depreciacionAnual) {
        this.depreciacionAnual = depreciacionAnual;
    }

    public Double getDepreciacionAcumulada() {
        return depreciacionAcumulada;
    }

    public void setDepreciacionAcumulada(Double depreciacionAcumulada) {
        this.depreciacionAcumulada = depreciacionAcumulada;
    }

    public Double getValorLibros() {
        return valorLibros;
    }

    public void setValorLibros(Double valorLibros) {
        this.valorLibros = valorLibros;
    }
    
    
    
    
    
}
