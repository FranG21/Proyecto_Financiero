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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.Prestamo;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorPrestamo {
    
    public Conexion conexion;

    public ControladorPrestamo() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public void Agregar(Prestamo x) {
        try {SimpleDateFormat forma=new SimpleDateFormat("YYYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO prestamo (monto,plazo,fechafinan,cuota,estado,idCli,idCre) VALUES"
                    + " (" + x.getMonto()+ "," + x.getPlazo()+ ",'" + forma.format(x.getFechaInicio()) + "'," + x.getCuota()+ "," + 0 + "," + x.getIdCliente()+ "," + x.getIdCredito()+ ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public ArrayList<Prestamo> obtenerLista(int var) {
        ArrayList<Prestamo> listaPrestamo = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM prestamo WHERE idCli="+var+" ORDER BY idPres ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo aux = new Prestamo();

                aux.setId(rs.getInt(1));
                aux.setMonto(rs.getDouble(2));
                aux.setPlazo(rs.getInt(3));
                aux.setFechaInicio(rs.getDate(4));
                aux.setCuota(rs.getDouble(5));
                aux.setEstado(rs.getInt(7));
                aux.setIdCliente(rs.getInt(8));
                aux.setIdCredito(rs.getInt(9));
                listaPrestamo.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaPrestamo;
    }
     
     public int obtenerUltimoRegistro() {
        Prestamo x = new Prestamo();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM prestamo ORDER BY idPres DESC LIMIT 1";
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
     
     
    
}
