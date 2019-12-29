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
public class Credito {
    private Integer id;
    private String tipo;
    private Integer plazoMax;
    private Double cantidadMax;
    private Double cantidadMin;
    private String garantia;
    private Double interes;

    public Credito() {
    }

    public Credito(String tipo, Integer plazoMax, Double cantidadMax, Double cantidadMin, String garantia, Double interes) {
        this.tipo = tipo;
        this.plazoMax = plazoMax;
        this.cantidadMax = cantidadMax;
        this.cantidadMin = cantidadMin;
        this.garantia = garantia;
        this.interes = interes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPlazoMax() {
        return plazoMax;
    }

    public void setPlazoMax(Integer plazoMax) {
        this.plazoMax = plazoMax;
    }

    public Double getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(Double cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public Double getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(Double cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double inteeres) {
        this.interes = inteeres;
    }
    
    
    
}
