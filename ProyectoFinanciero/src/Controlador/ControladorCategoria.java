/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author GM
 */
import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorCategoria {
    public Conexion conexion;

    public ControladorCategoria() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public void AgregarCatgoria(Categoria categoria) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
           String sql = "INSERT INTO categoria (nombre,cod,val,vidautil,vidaeco,estado) VALUES"
                   + " ('" + categoria.getNombre() + "','" + categoria.getCodigo()+ "'," + categoria.getValorResidual()+ "," + categoria.getVidaUtil()+ "," + categoria.getVidaEconomica()+ ","+0+")";
           st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
}
