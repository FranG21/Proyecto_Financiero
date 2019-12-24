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
public class Departamento {
    
    private Integer idDep;
    private String codigo;
    private String nombreDep;
    private Integer estado;

    public Departamento(Integer idDep, String codigo, String nombreDep, Integer estado) {
        this.idDep = idDep;
        this.codigo = codigo;
        this.nombreDep = nombreDep;
        this.estado = estado;
    }

    public Departamento(String codigo, String nombreDep) {
        this.codigo = codigo;
        this.nombreDep = nombreDep;
    }

    public Departamento() {
    }
    
    

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
    
    
}
