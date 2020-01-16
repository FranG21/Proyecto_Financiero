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
import Modelo.Depreciacion;
import Modelo.DetalleActivo;
import Modelo.SubCategoria;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JOptionPane;

public class ControladorDepreciacion {

    public Conexion conexion;

    public ControladorDepreciacion() {
        conexion = new Conexion();
        PreparedStatement st = null;
    }

    public Depreciacion obtenerObjeto(int id) {
        Depreciacion x = new Depreciacion();
        ResultSet rs = null;
        try {
            Connection accesoDB = conexion.abrirConexion();
            String sql = "SELECT "
                    + "detalle_activo.valor_historico, "
                    + "categoria.val, "
                    + "categoria.vidautil, "
                    + "detalle_activo.vidautil_restante, "
                    + "detalle_activo.valor_r "
                    + "FROM "
                    + "activo "
                    + "INNER JOIN subcategoria ON activo.idSub = subcategoria.idSub "
                    + "INNER JOIN categoria ON subcategoria.idcat = categoria.idCat "
                    + "INNER JOIN detalle_activo ON detalle_activo.activofijo_id = activo.idAc "
                    + "WHERE activo.idAc="+id;
            PreparedStatement ps = accesoDB.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                x.setP(rs.getDouble(1));
                x.setPorcentajeL(0.00+rs.getDouble(5));
                x.setN(rs.getInt(4));

            }
            conexion.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

}
