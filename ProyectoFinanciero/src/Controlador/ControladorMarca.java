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
import Modelo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorMarca {
    
    public Conexion conexion;

    public ControladorMarca() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public void Agregar(Marca x) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO marca (nombre,estado) VALUES"
                    + " ('" + x.getNombre() + "'," + 1 + ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<Marca> obtenerLista() {
        ArrayList<Marca> listaMarca = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM marca ORDER BY nombre ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Marca aux = new Marca();

                aux.setIdM(rs.getInt("idMarca"));
                aux.setNombre(rs.getString("nombre"));
                aux.setEstado(rs.getInt("estado"));
                listaMarca.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaMarca;
    }
    
}
