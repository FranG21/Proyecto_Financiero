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
public class Categoria {

    private String nombre;
    private String codigo;
    private Integer vidaUtil;
    private Integer vidaEconomica;
    private Integer valorResidual;
    private Integer estado;

    public Categoria(String nombre, String codigo, Integer vidaUtil, Integer vidaEconomica, Integer valorResidual, Integer estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.vidaUtil = vidaUtil;
        this.vidaEconomica = vidaEconomica;
        this.valorResidual = valorResidual;
        this.estado = estado;
    }

    public Categoria() {
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

    public Integer getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Integer vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public Integer getVidaEconomica() {
        return vidaEconomica;
    }

    public void setVidaEconomica(Integer vidaEconomica) {
        this.vidaEconomica = vidaEconomica;
    }

    public Integer getValorResidual() {
        return valorResidual;
    }

    public void setValorResidual(Integer valorResidual) {
        this.valorResidual = valorResidual;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
