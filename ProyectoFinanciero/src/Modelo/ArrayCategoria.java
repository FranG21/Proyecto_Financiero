/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author GM
 */
public class ArrayCategoria {
    ArrayList<Categoria> listaCategoria;

    public ArrayCategoria() {
        listaCategoria=new ArrayList<>();
    }
    
    public void Insertar(Categoria c){
        listaCategoria.add(c);
    }

    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    
    
    
    
}
