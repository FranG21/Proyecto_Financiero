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

    public boolean ModificarCartera(int cartera, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE cliente SET cartera=" + cartera + " WHERE idCliente=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean ModificarCarteraEstado(int cartera, int id) {
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

    public ArrayList<Cliente> obtenerListaCondicionada(int estado) {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente WHERE estado=" + estado + " ORDER BY nit";
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

    public ArrayList<Cliente> obtenerListaCondicionadaCartera(int estado) {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente WHERE cartera=" + estado + " ORDER BY nit";
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

    public boolean existeDui(String dui) {
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente WHERE dui='" + dui + "' LIMIT 1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean existeNit(String nit) {
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente WHERE nit='" + nit + "' LIMIT 1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public void Modificar(Cliente x) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE cliente SET nombre='" + x.getNombre() + "', apellido='" + x.getApellidos_Representante() + "', dui='" + x.getDui() + "',"
                    + " nit='" + x.getNit() + "', tel='" + x.getTelefono() + "', ocupacion='" + x.getOcupacion() + "', depa='" + x.getDepartmento() + "', direc='" + x.getDireccion() + "', tipo=" + x.getTipo() + " WHERE idCliente=" + x.getId();
            st.executeUpdate(sql);
            conexion.cerrarConexion();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean ModificarEstado(int estado, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE cliente SET estado=" + estado + " WHERE idCliente=" + id;
            st.executeUpdate(sql);

            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public ArrayList<Cliente> obtenerListaClaseA() {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "cliente.idCliente, "
                    + "cliente.nombre, "
                    + "cliente.apellido, "
                    + "cliente.dui, "
                    + "cliente.nit, "
                    + "cliente.repre, "
                    + "cliente.tel, "
                    + "cliente.ocupacion, "
                    + "cliente.depa, "
                    + "cliente.fecha, "
                    + "cliente.direc, "
                    + "cliente.estado, "
                    + "cliente.tipo, "
                    + "cliente.cartera, "
                    + "IFNULL((select COUNT(idAmortizacion) as mora "
                    + "FROM "
                    + "amortizacion "
                    + "INNER JOIN prestamo ON amortizacion.idPrestamo = prestamo.idPres "
                    + "WHERE "
                    + "prestamo.idCli = cliente.idCliente AND "
                    + "amortizacion.mora = 1),0)  as nmora "
                    + "FROM "
                    + "cliente "
                    + "WHERE cliente.cartera!=2 "
                    + "ORDER BY nit";
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
                aux.setnMora(rs.getInt(15));
                auxs.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return auxs;
    }

    public ArrayList<Cliente> obtenerListaClaseB() {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM cliente WHERE cartera=" + 1 + " ORDER BY nit";
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

    public ArrayList<Cliente> obtenerListaClaseC() {
        ArrayList<Cliente> auxs = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "cliente "
                    + "INNER JOIN prestamo ON prestamo.idCli = cliente.idCliente "
                    + "WHERE (cliente.tipo=0 AND prestamo.monto>2500) OR (cliente.tipo=1 AND prestamo.monto>25000) AND prestamo.estado=1 AND cliente.cartera=0 ORDER BY nit";
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

}
