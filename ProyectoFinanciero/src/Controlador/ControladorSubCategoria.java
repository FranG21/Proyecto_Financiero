/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.SubCategoria;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorSubCategoria {
    public Conexion conexion;

    public ControladorSubCategoria() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public void AgregarSubCategoria(SubCategoria subCategoria) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
           String sql = "INSERT INTO subcategoria (nombre,idcat,codigo,estado) VALUES"
                   + " ('" + subCategoria.getNombre() + "'," + subCategoria.getIdCtegoria()+ ",'" + subCategoria.getCodigo()+ "',"+0+")";
           st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
