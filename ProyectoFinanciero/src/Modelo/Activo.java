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
public class Activo {

    private int id;
    private String codigo;
    private String descripcion;
    private Integer idDepartamento;
    private Integer idSubcategoria;
    private  Integer idMarca;
    private String descripcionEstado;
    private Integer estado;
    private String sub;
    private String cat;

    public Activo(String codigo) {
        this.codigo = codigo;
    }

    public Activo(String codigo, String descripcion, Integer idDepartamento, Integer idSubcategoria, Integer idMarca, String descripcionEstado, Integer estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idDepartamento = idDepartamento;
        this.idSubcategoria = idSubcategoria;
        this.idMarca = idMarca;
        this.descripcionEstado = descripcionEstado;
        this.estado = estado;
    }
    
    public Activo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
    

}
