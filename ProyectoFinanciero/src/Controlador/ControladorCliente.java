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
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorCliente {

    public Conexion conexion;

    public ControladorCliente() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void Agregar(Cliente x) {
        try {
            SimpleDateFormat forma = new SimpleDateFormat("YYYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO cliente (nombre,apellido,dui,nit,tel,ocupacion,depa,fecha,direc,estado,tipo,cartera) VALUES"
                    + " ('" + x.getNombre() + "','" + x.getApellidos_Representante() + "','" + x.getDui() + "','" + x.getNit() + "','" + x.getTelefono() + "','" + x.getOcupacion() + "','" + x.getDepartmento() + "',"
                    + "'" + forma.format(x.getFechaIngreso()) + "','" + x.getDireccion() + "'," + 1 + "," + x.getTipo() + "," + 0 + ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Cliente> obtenerLista() {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente ORDER BY nit";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente aux = new Cliente();

                aux.setId(rs.getInt(1));
                aux.setNombre(rs.getString(2));
                aux.setApellidos_Representante(rs.getString(3));
                aux.setDui(rs.getString(4));
                aux.setNit(rs.getString(5));
                aux.setTelefono(rs.getString(7));
                aux.setOcupacion(rs.getString(8));
                aux.setDepartmento(rs.getString(9));
                aux.setFechaIngreso(rs.getDate(10));
                aux.setDireccion(rs.getString(11));
                aux.setEstado(rs.getInt(12));
                aux.setTipo(rs.getInt(13));
                aux.setCartera(rs.getInt(14));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }

    public boolean ModificarCartera(int cartera,int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE cliente SET cartera=" + 1 + " WHERE idCliente=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean ModificarCarteraEstado(int cartera,int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE cliente SET cartera=" + 2 + ", estado=0 WHERE idCliente=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}
