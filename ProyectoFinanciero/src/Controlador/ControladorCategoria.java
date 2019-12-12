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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorCategoria {

    public Conexion conexion;

    public ControladorCategoria() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void AgregarCatgoria(Categoria categoria) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO categoria (nombre,cod,val,vidautil,vidaeco,estado) VALUES"
                    + " ('" + categoria.getNombre() + "','" + categoria.getCodigo() + "'," + categoria.getValorResidual() + "," + categoria.getVidaUtil() + "," + categoria.getVidaEconomica() + "," + 0 + ")";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Categoria> obtenerCuentas() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM categoria ORDER BY cod ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();

                categoria.setIdCategoria(rs.getInt("idCat"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setCodigo(rs.getString("cod"));
                categoria.setValorResidual(rs.getInt("val"));
                categoria.setVidaEconomica(rs.getInt("vidaeco"));
                categoria.setVidaUtil(rs.getInt("vidautil"));
                categoria.setEstado(rs.getInt("estado"));
                categorias.add(categoria);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return categorias;
    }

    public boolean ModificarCategoria(Categoria c) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE nombre=" + c.getNombre() + "cod=" + c.getCodigo();
            st.executeUpdate(sql);
            System.out.println("CTA MODIFICADA");
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean existeCampo(String c, String cod) {
        int r = 0;
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "SELECT * FROM categoria where " + c + "='" + cod + "' limit 2";
            st.execute(sql);
            r = st.getFetchSize();
            conexion.cerrarConexion();
            if (r == 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean ModificarEstado(int estado,int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE categoria SET estado="+estado+" WHERE idCat="+id;
            st.executeUpdate(sql);
            System.out.println("CTA MODIFICADA");
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}
