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
public class Prestamo {

    private Integer id;
    private Double monto;
    private Integer plazo;
    private Date fechaInicio;
    private Double cuota;
    private Integer estado;
    private Integer idCliente;
    private Integer idCredito;

    public Prestamo() {
    }

    public Prestamo(Double monto, Integer plazo, Date fechaInicio, Double cuota, Integer idCliente, Integer idCredito) {
        this.monto = monto;
        this.plazo = plazo;
        this.fechaInicio = fechaInicio;
        this.cuota = cuota;
        this.idCliente = idCliente;
        this.idCredito = idCredito;
    }

    
    
    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(Integer idCredito) {
        this.idCredito = idCredito;
    }
    
}
