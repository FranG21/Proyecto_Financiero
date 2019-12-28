/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author GM
 */
public class Venta {
    
    private Integer idVenta;
    private Integer idDetalle;
    private Integer idMovimiento;
    private String codigoFactura;
    private Double precioVenta;
    private Date fechaVenta;

    public Venta() {
    }

    public Venta(Integer idDetalle, Integer idMovimiento, String codigoFactura, Double precioVenta, Date fechaVenta) {
        this.idDetalle = idDetalle;
        this.idMovimiento = idMovimiento;
        this.codigoFactura = codigoFactura;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
    }

    

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    
}
