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
import Modelo.Activo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.SubCategoria;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorActivo {
    
     public Conexion conexion;

    public ControladorActivo() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public ArrayList<Activo> obtenerCodigo() {
        ArrayList<Activo> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM activo ORDER BY idAc ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Activo x = new Activo();

                x.setCodigo(rs.getString("codAct"));
                
                
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
}
