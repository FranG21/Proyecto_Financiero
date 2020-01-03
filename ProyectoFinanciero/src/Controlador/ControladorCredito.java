/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Credito;
import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorCredito {
    public Conexion conexion;

    public ControladorCredito() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public void Agregar(Credito x) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO creditos (tipo,plazom,cmax,cmin,garantia,interes) VALUES"
                    + " ('" + x.getTipo()+ "'," + x.getPlazoMax()+ "," + x.getCantidadMax() + "," + x.getCantidadMin() + ",'" + x.getGarantia() + "'," + x.getInteres() + ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<Credito> obtenerLista() {
        ArrayList<Credito> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM creditos ORDER BY tipo";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Credito aux = new Credito();

                aux.setId(rs.getInt(1));
                aux.setTipo(rs.getString(2));
                aux.setPlazoMax(rs.getInt(3));
                aux.setCantidadMax(rs.getDouble(4));
                aux.setCantidadMin(rs.getDouble(5));
                aux.setGarantia(rs.getString(6));
                aux.setInteres(rs.getDouble(7));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }
    
    public ArrayList<Credito> obtenerListaEstado() {
        ArrayList<Credito> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM creditos ORDER BY tipo";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Credito aux = new Credito();

                aux.setId(rs.getInt(1));
                aux.setTipo(rs.getString(2));
                aux.setPlazoMax(rs.getInt(3));
                aux.setCantidadMax(rs.getDouble(4));
                aux.setCantidadMin(rs.getDouble(5));
                aux.setGarantia(rs.getString(6));
                aux.setInteres(rs.getDouble(7));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }
    
    public ArrayList<Credito> obtenerListaUnica(int id) {
        ArrayList<Credito> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM creditos WHERE idCre="+id+" ORDER BY tipo";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Credito aux = new Credito();

                aux.setId(rs.getInt(1));
                aux.setTipo(rs.getString(2));
                aux.setPlazoMax(rs.getInt(3));
                aux.setCantidadMax(rs.getDouble(4));
                aux.setCantidadMin(rs.getDouble(5));
                aux.setGarantia(rs.getString(6));
                aux.setInteres(rs.getDouble(7));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }
}
