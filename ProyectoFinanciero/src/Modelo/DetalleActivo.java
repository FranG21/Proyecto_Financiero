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
public class DetalleActivo {
    
    private Integer idDetalle;
    private String serie;
    private Date fechaCompra;
    private Date fechaInicio;
    private Double precio;
    private String donado;
    private Integer vidaUtilRestante;
    private Activo activo;
    private String condicion;
    private Double valorReidual;

    public DetalleActivo(String serie, Date fechaCompra, Date fechaInicio, Double precio, String donado, Integer vidaUtilRestante, Activo activo, String condicion) {
        this.serie = serie;
        this.fechaCompra = fechaCompra;
        this.fechaInicio = fechaInicio;
        this.precio = precio;
        this.donado = donado;
        this.vidaUtilRestante = vidaUtilRestante;
        this.activo = activo;
        this.condicion = condicion;
    }

    public DetalleActivo() {
    }   

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDonado() {
        return donado;
    }

    public void setDonado(String donado) {
        this.donado = donado;
    }

    public Integer getVidaUtilRestante() {
        return vidaUtilRestante;
    }

    public void setVidaUtilRestante(Integer vidaUtilRestante) {
        this.vidaUtilRestante = vidaUtilRestante;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getValorReidual() {
        return valorReidual;
    }

    public void setValorReidual(Double valorReidual) {
        this.valorReidual = valorReidual;
    }
    
    
    
}
