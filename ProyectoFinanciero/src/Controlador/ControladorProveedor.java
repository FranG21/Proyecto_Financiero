/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import java.sql.PreparedStatement;

/**
 *
 * @author GM
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.Proveedor;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorProveedor {
    
    public Conexion conexion;

    public ControladorProveedor() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public ArrayList<Proveedor> obtenerLista() {
        ArrayList<Proveedor> listaProveedor = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM proveedor ORDER BY nombre ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor aux = new Proveedor();

                aux.setIdP(rs.getInt("ide"));
                aux.setNombre(rs.getString("nombre"));
                aux.setCorreo(rs.getString("correo"));
                aux.setNit(rs.getString("nit"));
                aux.setResponsable(rs.getString("contacto"));
                aux.setObservaciones(rs.getString("observacion"));
                aux.setDireccion(rs.getString("direccion"));
                aux.setTelefono(rs.getString("telefono"));
                aux.setEstado(rs.getInt("estado"));
                listaProveedor.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaProveedor;
    }
    
    public ArrayList<Proveedor> obtenerListaActivo() {
        ArrayList<Proveedor> listaProveedor = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM proveedor WHERE proveedor.estado=1 ORDER BY nombre ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor aux = new Proveedor();

                aux.setIdP(rs.getInt("ide"));
                aux.setNombre(rs.getString("nombre"));
                aux.setEstado(rs.getInt("estado"));
                listaProveedor.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaProveedor;
    }
    
}
