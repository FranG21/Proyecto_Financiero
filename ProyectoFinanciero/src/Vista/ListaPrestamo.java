/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Controlador.ControladorPrestamo;
import Controlador.ControladorSubCategoria;
import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.Prestamo;
import Modelo.SubCategoria;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PEREZ
 */
public class ListaPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form ListaCatalago
     */
    DefaultTableModel modelo;

    int posicion = -1;
    Prestamo objeto;
    Cliente cliente;
    ArrayList<Prestamo> listaPrestamo;
    ControladorPrestamo controladorPrestamo;

    SimpleDateFormat forma;
    DecimalFormat formaPrecio;

    public ListaPrestamo(Cliente obj) {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
        cliente = obj;
        listaPrestamo = new ArrayList<>();
        controladorPrestamo = new ControladorPrestamo();

        forma = new SimpleDateFormat("dd-MM-YYYY");
        formaPrecio = new DecimalFormat("0.00");
        // listaPrestamo=controladorPrestamo.obtenerLista(cliente.getId());
        modelo();
        verTabla();
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                verTabla();
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
                verTabla();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        TablaSCat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Ver(e); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    private void modelo() {

        modelo = new DefaultTableModel();
        modelo.addColumn("N°");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DUI");
        modelo.addColumn("ESTADO");
        modelo.addColumn("PLAZO (MESES)");
        modelo.addColumn("MONTO");
        modelo.addColumn("CUOTA");
        modelo.addColumn("FECHA DE INICIO");
        TablaSCat.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BtnVer = new javax.swing.JButton();
        BtnAmortizacion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSCat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA PRESTAMO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 70));

        BtnVer.setBackground(new java.awt.Color(0, 153, 0));
        BtnVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnVer.setForeground(new java.awt.Color(255, 255, 255));
        BtnVer.setText("VER");
        BtnVer.setEnabled(false);
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, 30));

        BtnAmortizacion.setBackground(new java.awt.Color(255, 153, 0));
        BtnAmortizacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnAmortizacion.setForeground(new java.awt.Color(255, 255, 255));
        BtnAmortizacion.setText("AMORTIZACION");
        BtnAmortizacion.setEnabled(false);
        BtnAmortizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAmortizacionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAmortizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 130, 30));

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NUEVO PRESTAMO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 30));

        TablaSCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaSCat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 790, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 970, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed

    }//GEN-LAST:event_BtnVerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistrarPrestamo vista = new RegistrarPrestamo(cliente);
        vista.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnAmortizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAmortizacionActionPerformed
        ListaAmortizacion vista = new ListaAmortizacion(objeto);
        vista.setVisible(true);
    }//GEN-LAST:event_BtnAmortizacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAmortizacion;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable TablaSCat;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Ver(MouseEvent e) {
        int row = TablaSCat.rowAtPoint(e.getPoint());
        posicion = Integer.parseInt(TablaSCat.getValueAt(row, 0).toString());
        objeto = new Prestamo();
        objeto = listaPrestamo.get(posicion - 1);
        BtnVer.setEnabled(true);
        BtnAmortizacion.setEnabled(true);

    }

    void verTabla() {

        listaPrestamo = new ArrayList<>();
        listaPrestamo = controladorPrestamo.obtenerLista(cliente.getId());

        modelo.setRowCount(listaPrestamo.size());

        for (int i = 0; i < listaPrestamo.size(); i++) {

            modelo.setValueAt(i + 1, i, 0);
            modelo.setValueAt(cliente.getDui(), i, 1);
            modelo.setValueAt(cliente.getNombre(), i, 2);
            if (listaPrestamo.get(i).getEstado() == 0) {
                modelo.setValueAt("PENDIENTE", i, 3);
            } else {
                modelo.setValueAt("CANCELADO", i, 3);
            }
            modelo.setValueAt(listaPrestamo.get(i).getPlazo(), i, 4);
            modelo.setValueAt(formaPrecio.format(listaPrestamo.get(i).getMonto()), i, 5);
            modelo.setValueAt(formaPrecio.format(listaPrestamo.get(i).getCuota()), i, 6);
            modelo.setValueAt(forma.format(listaPrestamo.get(i).getFechaInicio()), i, 7);

        }

        TablaSCat.setModel(modelo);
    }

}
