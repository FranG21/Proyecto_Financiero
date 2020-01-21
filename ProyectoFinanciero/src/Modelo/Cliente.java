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
public class Cliente {

    private Integer id;
    private String nombre;
    private String apellidos_Representante;
    private String dui;
    private String nit;
    private String telefono;
    private String ocupacion;
    private String departmento;
    private Date fechaIngreso;
    private String direccion;
    private Integer estado;
    private Integer tipo;
    private Integer cartera;
    private Integer nMora;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos_Representante, String dui, String nit, String telefono, String ocupacion, String departmento, Date fechaIngreso, String direccion, Integer tipo) {
        this.nombre = nombre;
        this.apellidos_Representante = apellidos_Representante;
        this.dui = dui;
        this.nit = nit;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.departmento = departmento;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos_Representante() {
        return apellidos_Representante;
    }

    public void setApellidos_Representante(String apellidos_Representante) {
        this.apellidos_Representante = apellidos_Representante;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDepartmento() {
        return departmento;
    }

    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getCartera() {
        return cartera;
    }

    public void setCartera(Integer cartera) {
        this.cartera = cartera;
    }

    public Integer getnMora() {
        return nMora;
    }

    public void setnMora(Integer nMora) {
        this.nMora = nMora;
    }
    
    

}
