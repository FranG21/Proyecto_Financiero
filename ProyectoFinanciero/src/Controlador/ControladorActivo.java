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
            SimpleDateFormat forma = new SimpleDateFormat("YYYY-MM-dd");
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "INSERT INTO detalle_activo (serie,fecha_adqui,fecha_inicio,valor_historico,donado,vidautil_restante,activofijo_id,condicion) VALUES"
                    + " ('" + x.getSerie() + "','" + forma.format(x.getFechaCompra()) + "','" + forma.format(x.getFechaInicio()) + "'," + x.getPrecio() + ",'" + x.getDonado() + "'," + x.getVidaUtilRestante() + "," + x.getActivo().getId() + ",'" + x.getCondicion() + "')";
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

    public ArrayList<Activo> obtenerLista() {
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
                    + "categoria.nombre "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN departamento ON activo.idDep = departamento.idDep "
                    + "INNER JOIN subcategoria ON activo.idSub = subcategoria.idSub "
                    + "INNER JOIN categoria ON subcategoria.idcat = categoria.idCat "
                    + "WHERE activo.estado=1 OR activo.estado=0 "
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
                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    public ArrayList<Activo> obtenerListaActivos() {
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
                    + "categoria.nombre "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN departamento ON activo.idDep = departamento.idDep "
                    + "INNER JOIN subcategoria ON activo.idSub = subcategoria.idSub "
                    + "INNER JOIN categoria ON subcategoria.idcat = categoria.idCat "
                    + "WHERE activo.estado=1 "
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
                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    public ArrayList<Activo> obtenerListaCondicionada(int var) {
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
                    + "categoria.nombre "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN departamento ON activo.idDep = departamento.idDep "
                    + "INNER JOIN subcategoria ON activo.idSub = subcategoria.idSub "
                    + "INNER JOIN categoria ON subcategoria.idcat = categoria.idCat "
                    + "WHERE activo.estado=" + var + " "
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
                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    public Integer obtenerIdDetalle(int id) {
        int x = -1;
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "detalle_activo.id "
                    + "FROM "
                    + "detalle_activo "
                    + "WHERE activofijo_id=" + id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Activo aux = new Activo();

                x = rs.getInt(1);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    public boolean ModificarEstado(int estado, int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE activo SET estado=" + estado + " WHERE idAc=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean ModificarEstadoVenta(int id) {
        try {
            conexion.abrirConexion();
            Statement st = conexion.abrirConexion().createStatement();
            String sql = "UPDATE activo SET estado=2 WHERE idAc=" + id;
            st.executeUpdate(sql);
            conexion.cerrarConexion();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public ArrayList<DetalleActivo> obtenerListaDetalle(int var) {
        ArrayList<DetalleActivo> x = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT * FROM detalle_activo WHERE activofijo_id=" + var;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetalleActivo aux = new DetalleActivo();

                aux.setIdDetalle(rs.getInt(1));
                aux.setSerie(rs.getString(2));
                aux.setFechaCompra(rs.getDate(3));
                aux.setFechaInicio(rs.getDate(4));
                aux.setPrecio(rs.getDouble(5));
                aux.setDonado(rs.getString(6));
                aux.setVidaUtilRestante(rs.getInt(7));

                x.add(aux);
            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

}
