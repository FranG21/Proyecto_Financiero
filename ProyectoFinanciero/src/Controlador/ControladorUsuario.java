/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Activo;
import Modelo.Categoria;
import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorUsuario {
    public Conexion conexion;

    public ControladorUsuario() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }
    
    public ArrayList<Usuario> listaUsuarios() {
        ArrayList<Usuario> x = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM usuarios";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario aux = new Usuario();

                aux.setId(rs.getInt(1));
                aux.setUser(rs.getString(2));
                aux.setPass(rs.getString(3));
                aux.setNivel(rs.getInt(4));
                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }
    
    public Usuario buscarUsuario(String user) {
        Usuario x = null;
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM usuarios WHERE user='"+user+"'";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                x = new Usuario();

                x.setId(rs.getInt(1));
                x.setUser(rs.getString(2));
                x.setPass(rs.getString(3));
                x.setNivel(rs.getInt(4));              
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }
    
    public Usuario loginUsuario(Usuario user) {
        Usuario x = null;
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM usuarios WHERE user='"+user.getUser()+"' AND pass='"+user.getPass()+"'";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                x = new Usuario();

                x.setId(rs.getInt(1));
                x.setUser(rs.getString(2));
                x.setPass(rs.getString(3));
                x.setNivel(rs.getInt(4));              
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }
    
    public void AgregarUsuario(Usuario usuario) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO usuarios(idusu, user, pass, nivel) VALUES (null,'"+usuario.getUser()+"','"+usuario.getPass()+"',"+usuario.getNivel()+")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean ModificarUsuario(Usuario usuario) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE usuarios SET user='"+usuario.getUser()+"',pass='"+usuario.getPass()+"',nivel="+usuario.getNivel()+" WHERE idusu="+usuario.getId();
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean EliminarUsuario(Usuario usuario) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "DELETE FROM usuarios WHERE idusu="+usuario.getId();
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
