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
public class SubCategoria {
    
    private Integer idSubcategoria;
    private Integer idCtegoria;
    private String nombre;
    private String codigo;
    private Integer estado;

    public SubCategoria(Integer idCtegoria, String nombre, String codigo) {
        this.idCtegoria = idCtegoria;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public SubCategoria() {
        
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public Integer getIdCtegoria() {
        return idCtegoria;
    }

    public void setIdCtegoria(Integer idCtegoria) {
        this.idCtegoria = idCtegoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
}
