/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Activo;
import Modelo.Conexion;
import Modelo.DetalleActivo;
import Modelo.Movimiento;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ControladorVenta {

    public Conexion conexion;

    public ControladorVenta() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public void Agregar(Venta x) {
        try {
            SimpleDateFormat forma = new SimpleDateFormat("YYYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO venta (id_de,idMovi,factNum,fecha,precVenta) VALUES"
                    + " (" + x.getIdDetalle() + "," + x.getIdMovimiento() + ",'" + x.getCodigoFactura() + "','" + forma.format(x.getFechaVenta()) + "'," + x.getPrecioVenta() + ")";
            st.executeUpdate(sql);
            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Venta> obtenerCodigo() {
        ArrayList<Venta> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM venta ORDER BY factNum ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta x = new Venta();
                x.setIdVenta(rs.getInt(1));
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    public ArrayList<Movimiento> obtenerListaMovimiento() {
        ArrayList<Movimiento> lista = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM movimiento WHERE estado=1";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimiento x = new Movimiento();
                x.setIdMovimiento(rs.getInt(1));
                x.setNombre(rs.getString(2));
                x.setEstado(rs.getInt(3));
                lista.add(x);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    public Integer obtenerMeses(int id) {
        int x = -1;
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "TIMESTAMPDIFF(MONTH, detalle_activo.fecha_adqui, CURDATE()) as meses "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN detalle_activo ON detalle_activo.activofijo_id = activo.idAc "
                    + "WHERE detalle_activo.activofijo_id=" + id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                x = rs.getInt(1);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    public ArrayList<Activo> obtenerListaVentas() {
        ArrayList<Activo> x = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "activo.idAc, "
                    + "activo.codAct, "
                    + "activo.descrip, "
                    + "activo.idDep, "
                    + "activo.idSub, "
                    + "activo.estado, "
                    + "activo.idMarca, "
                    + "activo.descripcionEstado, "
                    + "categoria.cod, "
                    + "subcategoria.codigo, "
                    + "departamento.codigo, "
                    + "subcategoria.nombre, "
                    + "categoria.nombre, "
                    + "venta.precVenta, "
                    + "movimiento.nombre, "
                    + "venta.fecha "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN subcategoria ON activo.idSub = subcategoria.idSub "
                    + "INNER JOIN categoria ON subcategoria.idcat = categoria.idCat "
                    + "INNER JOIN detalle_activo ON detalle_activo.activofijo_id = activo.idAc "
                    + "INNER JOIN venta ON venta.id_de = detalle_activo.id "
                    + "INNER JOIN movimiento ON venta.idMovi = movimiento.idMov "
                    + "INNER JOIN departamento ON activo.idDep = departamento.idDep "
                    + "WHERE activo.estado=2 "
                    + "ORDER BY categoria.cod ASC";
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Activo aux = new Activo();

                aux.setId(rs.getInt("idAc"));
                aux.setCodigo(rs.getString("cod") + "-" + rs.getString("codigo") + "-" + rs.getString(11) + "-" + rs.getString("codAct"));
                aux.setDescripcion(rs.getString("descrip"));
                aux.setIdDepartamento(rs.getInt("idDep"));
                aux.setIdSubcategoria(rs.getInt("idSub"));
                aux.setIdMarca(rs.getInt("idMarca"));
                aux.setDescripcionEstado(rs.getString("descripcionEstado"));
                aux.setEstado(rs.getInt("estado"));
                aux.setSub(rs.getString(12));
                aux.setCat(rs.getString(13));
                aux.setPrecioVenta(rs.getDouble(14));
                aux.setMovimiento(rs.getString(15));
                aux.setFecha(rs.getDate(16));
                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

}
