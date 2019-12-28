/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Activo;
import Modelo.Conexion;
import Modelo.Movimiento;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorVenta {
    
    public Conexion conexion;

    public ControladorVenta() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public ArrayList<Venta> obtenerCodigo() {
        ArrayList<Venta> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM venta ORDER BY factNum ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta x = new Venta();
                x.setIdVenta(rs.getInt(1));
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    public ArrayList<Movimiento> obtenerListaMovimiento() {
        ArrayList<Movimiento> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM movimiento WHERE estado=1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimiento x = new Movimiento();
                x.setIdMovimiento(rs.getInt(1));
                x.setNombre(rs.getString(2));
                x.setEstado(rs.getInt(3));
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
}
