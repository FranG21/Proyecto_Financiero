/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Controlador.ControladorProveedor;
import Controlador.ControladorSubCategoria;
import Modelo.Categoria;
import Modelo.Proveedor;
import Modelo.SubCategoria;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PEREZ
 */
public class ListaProveedor extends javax.swing.JFrame {

    /**
     * Creates new form ListaCatalago
     */
    DefaultTableModel modelo;
    ControladorProveedor ctrProveedor;
    ArrayList<Proveedor> listaProveedor;
    int posicion = -1;
    Proveedor objeto;

    public ListaProveedor() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
        ctrProveedor = new ControladorProveedor();

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
        modelo.addColumn("NIT");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("ESTADO");
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
        jLabel4 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        BtnVer = new javax.swing.JButton();
        BtnModifica = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSCat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA DE PROVEEDORES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESTADO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, 30));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ACTIVO", "INACTIVO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 140, 40));

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

        BtnModifica.setBackground(new java.awt.Color(255, 153, 0));
        BtnModifica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnModifica.setForeground(new java.awt.Color(255, 255, 255));
        BtnModifica.setText("MODIFICAR");
        BtnModifica.setEnabled(false);
        BtnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 30));

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NUEVA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 180, 30));

        btnEstado.setBackground(new java.awt.Color(204, 0, 0));
        btnEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEstado.setForeground(new java.awt.Color(255, 255, 255));
        btnEstado.setText("DAR DE BAJA");
        btnEstado.setEnabled(false);
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 120, 30));

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
        DetalleProveedor vista = new DetalleProveedor(objeto);
        vista.setVisible(true);
    }//GEN-LAST:event_BtnVerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistrarProveedor vista = new RegistrarProveedor();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaActionPerformed
        ModificarProveedor vista = new ModificarProveedor(objeto);
        vista.setVisible(true);
    }//GEN-LAST:event_BtnModificaActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        // TODO add your handling code here:
        if (objeto.getEstado() == 0) {
            if (ctrProveedor.ModificarEstado(1, objeto.getIdP())) {
                verTabla();
                objeto.setEstado(1);
                btnEstado.setBackground(Color.RED);
                btnEstado.setText("DAR DE BAJA");
                JOptionPane.showMessageDialog(null, "REGISTRO DADO DE ALTA", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            } else {

            }

        } else {
            if (ctrProveedor.ModificarEstado(0, objeto.getIdP())) {
                verTabla();
                objeto.setEstado(0);
                btnEstado.setBackground(Color.GREEN);
                btnEstado.setText("DAR DE ALTA");
                JOptionPane.showMessageDialog(null, "REGISTRO DADO DE BAJA", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            } else {
            }
        }
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
        modelo();
        if (comboEstado.getSelectedIndex() == 0) {
            verTabla();
        } else if (comboEstado.getSelectedIndex() == 1) {
            verTablaCondicionada(1);
        } else if (comboEstado.getSelectedIndex() == 2) {
            verTablaCondicionada(0);
        }
    }//GEN-LAST:event_comboEstadoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModifica;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable TablaSCat;
    private javax.swing.JButton btnEstado;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Ver(MouseEvent e) {
        int row = TablaSCat.rowAtPoint(e.getPoint());
        posicion = Integer.parseInt(TablaSCat.getValueAt(row, 0).toString());
        objeto = new Proveedor();
        objeto = listaProveedor.get(posicion - 1);
        BtnVer.setEnabled(true);
        BtnModifica.setEnabled(true);
        btnEstado.setEnabled(true);
        if (objeto.getEstado() == 0) {
            btnEstado.setBackground(Color.GREEN);
            btnEstado.setText("DAR DE ALTA");

        } else {
            btnEstado.setBackground(Color.RED);
            btnEstado.setText("DAR DE BAJA");
        }

    }

    void verTabla() {
        listaProveedor = new ArrayList<>();
        listaProveedor = ctrProveedor.obtenerLista();

        modelo.setRowCount(listaProveedor.size());

        for (int i = 0; i < listaProveedor.size(); i++) {

            modelo.setValueAt(i + 1, i, 0);
            modelo.setValueAt(listaProveedor.get(i).getNit(), i, 1);
            modelo.setValueAt(listaProveedor.get(i).getNombre(), i, 2);
            modelo.setValueAt(listaProveedor.get(i).getCorreo(), i, 3);
            modelo.setValueAt(listaProveedor.get(i).getTelefono(), i, 4);
            if (listaProveedor.get(i).getEstado() == 0) {
                modelo.setValueAt("INACTIVO", i, 5);
            } else {
                modelo.setValueAt("ACTIVO", i, 5);
            }

        }

        TablaSCat.setModel(modelo);
    }

    void verTablaCondicionada(int x) {
        listaProveedor = new ArrayList<>();
        listaProveedor = ctrProveedor.obtenerListaCondicionada(x);

        modelo.setRowCount(listaProveedor.size());

        for (int i = 0; i < listaProveedor.size(); i++) {

            modelo.setValueAt(i + 1, i, 0);
            modelo.setValueAt(listaProveedor.get(i).getNit(), i, 1);
            modelo.setValueAt(listaProveedor.get(i).getNombre(), i, 2);
            modelo.setValueAt(listaProveedor.get(i).getCorreo(), i, 3);
            modelo.setValueAt(listaProveedor.get(i).getTelefono(), i, 4);
            if (listaProveedor.get(i).getEstado() == 0) {
                modelo.setValueAt("INACTIVO", i, 5);
            } else {
                modelo.setValueAt("ACTIVO", i, 5);
            }

        }

        TablaSCat.setModel(modelo);
    }
}
