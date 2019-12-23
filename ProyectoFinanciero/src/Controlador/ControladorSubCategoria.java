/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.SubCategoria;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorSubCategoria {

    public Conexion conexion;

    public ControladorSubCategoria() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void AgregarSubCategoria(SubCategoria subCategoria) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO subcategoria (nombre,idcat,codigo,estado) VALUES"
                    + " ('" + subCategoria.getNombre() + "'," + subCategoria.getIdCtegoria() + ",'" + subCategoria.getCodigo() + "'," + 0 + ")";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String buscarCategoria(int id) {
        String cadena = "";
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM categoria where idCat=" + id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cadena = rs.getString("nombre");
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cadena;
    }

    public ArrayList<SubCategoria> obtenerLista() {
        ArrayList<SubCategoria> subCategorias = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM subcategoria ORDER BY codigo ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SubCategoria subCategoria = new SubCategoria();

                subCategoria.setIdSubcategoria(rs.getInt("idSub"));
                subCategoria.setNombre(rs.getString("nombre"));
                subCategoria.setIdCtegoria(rs.getInt("idcat"));
                subCategoria.setCodigo(rs.getString("codigo"));
                subCategoria.setEstado(rs.getInt("estado"));
                subCategorias.add(subCategoria);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return subCategorias;
    }
    
    public ArrayList<SubCategoria> obtenerSubCategoriaCaracter(String letra) {
        ArrayList<SubCategoria> subCategorias = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM subcategoria WHERE subcategoria.nombre LIKE '"+letra.charAt(0)+letra.charAt(1)+"%' or subcategoria.nombre LIKE '"+letra.charAt(0)+letra.charAt(1)+"%'";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SubCategoria subCategoria = new SubCategoria();

                subCategoria.setIdSubcategoria(rs.getInt("idSub"));
                subCategoria.setNombre(rs.getString("nombre"));
                subCategoria.setIdCtegoria(rs.getInt("idcat"));
                subCategoria.setCodigo(rs.getString("codigo"));
                subCategoria.setEstado(rs.getInt("estado"));
                subCategorias.add(subCategoria);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return subCategorias;
    }

    public boolean ModificarSubCategoria(SubCategoria sc) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE subcategoria SET nombre='" + sc.getNombre() + "', codigo = '" + sc.getCodigo()
                    + "' , idCat ='" + sc.getIdCtegoria() + "' WHERE idSub=" + sc.getIdSubcategoria();
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
            String sql = "UPDATE subcategoria SET estado=" + estado + " WHERE idSub=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean existeCampo(String c, String cod, int id) {
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "SELECT * FROM subcategoria WHERE " + c + "='" + cod + "' AND idSub <> " + id + " limit 2";
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
}
