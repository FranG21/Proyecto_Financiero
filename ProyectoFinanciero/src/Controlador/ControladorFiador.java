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
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.Fiador;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorFiador {

    public Conexion conexion;

    public ControladorFiador() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void Agregar(Fiador x) {
        try {

            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO fiador (nombre, dui, nit, fuente) VALUES"
                    + " ('" + x.getNombre() + "','" + x.getDui() + "','" + x.getNit() + "','" + x.getFuente() + "')";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int obtenerUltimoRegistro() {
        Fiador x = new Fiador();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM fiador ORDER BY id_fiador DESC LIMIT 1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                x.setId(rs.getInt(1));

            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x.getId();
    }

    public ArrayList<Fiador> obtenerListaUnica(int id) {
        ArrayList<Fiador> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM fiador WHERE id_fiador=" + id + "";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Fiador aux = new Fiador();

                aux.setId(rs.getInt(1));
                aux.setNombre(rs.getString(2));
                aux.setDui(rs.getString(3));
                aux.setNit(rs.getString(4));
                aux.setFuente(rs.getString(5));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }

}
