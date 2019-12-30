/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GM
 */
public class Amortizacion {
    
    private Integer id;
    private Date fecha;
    private Double SaldoInicial;
    private Double amortizacion;
    private Double interes;
    private Double SaldoFinal;
    private Double cuota;
    private Integer estado; 
    private Integer idPrestamo;

    public Amortizacion() {
    }

    public Amortizacion(Date fecha, Double SaldoInicial, Double amortizacion, Double interes,Double cuota, Double SaldoFinal, Integer idPrestamo) {
        this.fecha = fecha;
        this.SaldoInicial = SaldoInicial;
        this.amortizacion = amortizacion;
        this.interes = interes;
        this.SaldoFinal = SaldoFinal;
        this.idPrestamo = idPrestamo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getSaldoInicial() {
        return SaldoInicial;
    }

    public void setSaldoInicial(Double SaldoInicial) {
        this.SaldoInicial = SaldoInicial;
    }

    public Double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(Double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getSaldoFinal() {
        return SaldoFinal;
    }

    public void setSaldoFinal(Double SaldoFinal) {
        this.SaldoFinal = SaldoFinal;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }
    
    

    @Override
    public String toString() {
        SimpleDateFormat forma=new SimpleDateFormat("dd-MM-YYYY");
        DecimalFormat fomaN=new DecimalFormat("0.00");
        return "fecha=" + forma.format(fecha) + ", SaldoInicial=" + fomaN.format(SaldoInicial) + ", amortizacion=" + fomaN.format(amortizacion) + ", interes=" + fomaN.format(interes) + ", SaldoFinal=" + fomaN.format(SaldoFinal) + ", idPrestamo=" + idPrestamo ;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
    
}
