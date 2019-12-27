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
import Modelo.Departamento;
import Modelo.SubCategoria;
import com.mysql.jdbc.exceptions.DeadlockTimeoutRollbackMarker;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorDeparamento {

    public Conexion conexion;

    public ControladorDeparamento() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void AgregarDepartamento(Departamento departamento) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO departamento (nombre,codigo,estado) VALUES"
                    + " ('" + departamento.getNombreDep() + "','" + departamento.getCodigo() + "'," + 1 + ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Departamento> obtenerLista() {
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM departamento ORDER BY codigo ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departamento aux = new Departamento();

                aux.setIdDep(rs.getInt("idDep"));
                aux.setNombreDep(rs.getString("nombre"));
                aux.setCodigo(rs.getString("codigo"));
                aux.setEstado(rs.getInt("estado"));
                listaDepartamentos.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaDepartamentos;
    }

    public ArrayList<Departamento> obtenerListaCondicionada(int var) {
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM departamento WHERE departamento.estado="+var+" ORDER BY codigo ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departamento aux = new Departamento();

                aux.setIdDep(rs.getInt("idDep"));
                aux.setNombreDep(rs.getString("nombre"));
                aux.setCodigo(rs.getString("codigo"));
                aux.setEstado(rs.getInt("estado"));
                listaDepartamentos.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaDepartamentos;
    }

    public boolean ModificarDepartamento(String nombre, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE departamento SET nombre='" + nombre + "' WHERE idDep=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean ModificarEstado(int estado, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE departamento SET estado=" + estado + " WHERE idDep=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}
