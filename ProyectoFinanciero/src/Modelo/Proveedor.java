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
public class Proveedor {
    
    private Integer idP;
    private String nombre;
    private String direccion;
    private String nit;
    private String responsable;
    private String telefono;
    private String correo;
    private String observaciones;
    private Integer estado;

    public Proveedor(String nombre, String direccion, String nit, String responsable, String telefono, String correo, String observaciones, Integer estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.responsable = responsable;
        this.telefono = telefono;
        this.correo = correo;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public Proveedor() {
    }

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
