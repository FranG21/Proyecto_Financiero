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
import Modelo.Activo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Conexion;
import Modelo.DetalleActivo;
import Modelo.SubCategoria;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorActivo {

    public Conexion conexion;

    public ControladorActivo() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void Agregar(Activo x) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO activo (codAct,descrip,idDep,idSub,estado,idMarca,descripcionEstado) VALUES"
                    + " ('" + x.getCodigo() + "','" + x.getDescripcion() + "'," + x.getIdDepartamento() + "," + x.getIdSubcategoria() + "," + 1 + "," + x.getIdMarca() + ",'" + x.getDescripcionEstado() + "')";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void AgregarDetalle(DetalleActivo x) {
        try {
            SimpleDateFormat forma=new SimpleDateFormat("YYYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO detalle_activo (serie,fecha_adqui,fecha_inicio,valor_historico,donado,vidautil_restante,activofijo_id,condicion) VALUES"
                    + " ('" + x.getSerie()+ "','" + forma.format(x.getFechaCompra())+ "','" + forma.format(x.getFechaInicio())+ "'," + x.getPrecio()+ ",'" + x.getDonado() + "'," + x.getVidaUtilRestante()+ "," + x.getActivo().getId()+ ",'" + x.getCondicion()+ "')";
            st.executeUpdate(sql);
            System.out.println("CTA AGREGADA");
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Activo> obtenerCodigo() {
        ArrayList<Activo> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM activo ORDER BY idAc ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Activo x = new Activo();
                x.setCodigo(rs.getString("codAct"));
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    public int obtenerUltimoRegistro() {
        Activo x = new Activo();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT activo.idAc FROM activo "
                    + "ORDER BY activo.idAc DESC LIMIT 1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                x.setId(rs.getInt("idAc"));

            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x.getId();
    }

}
