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
import Modelo.Amortizacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.DetalleActivo;
import Modelo.Amortizacion;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorAmortizacion {

    public Conexion conexion;

    public ControladorAmortizacion() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void Agregar(Amortizacion x) {
        try {
            SimpleDateFormat forma = new SimpleDateFormat("YYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO amortizacion (fecha,saldoInicial,amortizacion,cuotaMensual,interes,saldoFinal,estado,idPrestamo,mora) VALUES"
                    + " ('" + forma.format(x.getFecha()) + "'," + x.getSaldoInicial() + "," + x.getAmortizacion() + "," + x.getCuotaMensual() + "," + x.getInteres() + "," + x.getSaldoFinal() + "," + 0 + "," + x.getIdPrestamo() + "," + 0 + ")";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Amortizacion> obtenerLista(int id) {
        ArrayList<Amortizacion> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM amortizacion WHERE amortizacion.idPrestamo=" + id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Amortizacion aux = new Amortizacion();

                aux.setId(rs.getInt(1));
                aux.setFecha(rs.getDate(2));
                aux.setSaldoInicial(rs.getDouble(3));
                aux.setAmortizacion(rs.getDouble(4));
                aux.setCuotaMensual(rs.getDouble(5));
                aux.setInteres(rs.getDouble(6));
                aux.setSaldoFinal(rs.getDouble(7));
                aux.setCuota(rs.getDouble(8));
                aux.setEstado(rs.getInt("estado"));
                aux.setMora(rs.getInt(11));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }

    public boolean ModificarEstado(Double cuota,int estado, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE amortizacion SET estado=" + estado + ", cuotaPagada="+cuota+" WHERE idAmortizacion=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void ModificarMora(int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE amortizacion SET mora=" + 1 + " WHERE idAmortizacion=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ArrayList<Amortizacion> obtenerListaConDias(int id) {
        ArrayList<Amortizacion> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "amortizacion.idAmortizacion, "
                    + "amortizacion.fecha, "
                    + "amortizacion.saldoInicial, "
                    + "amortizacion.amortizacion, "
                    + "amortizacion.cuotaMensual, "
                    + "amortizacion.interes, "
                    + "amortizacion.saldoFinal, "
                    + "amortizacion.estado, "
                    + "amortizacion.mora, "
                    + "TIMESTAMPDIFF(DAY ,CURDATE() ,amortizacion.fecha) AS dias "
                    + "FROM "
                    + "amortizacion "
                    + "INNER JOIN prestamo ON amortizacion.idPrestamo = prestamo.idPres "
                    + "WHERE "
                    + "prestamo.idPres=" + id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Amortizacion aux = new Amortizacion();

                aux.setId(rs.getInt(1));
                aux.setFecha(rs.getDate(2));
                aux.setSaldoInicial(rs.getDouble(3));
                aux.setAmortizacion(rs.getDouble(4));
                aux.setCuotaMensual(rs.getDouble(5));
                aux.setInteres(rs.getDouble(6));
                aux.setSaldoFinal(rs.getDouble(7));
                aux.setEstado(rs.getInt("estado"));
                aux.setMora(rs.getInt(9));
                aux.setDiferenciaDias(rs.getInt(10));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }
}
