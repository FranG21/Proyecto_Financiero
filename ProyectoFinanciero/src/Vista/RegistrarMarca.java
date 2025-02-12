/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorMarca;
import Modelo.Marca;
import Modelo.Proveedor;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class RegistrarMarca extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarClientes
     */
    ControladorMarca controlador;
    Proveedor pro;

    public RegistrarMarca(Proveedor p) {
        initComponents();
        pro = p;
        controlador = new ControladorMarca();
        cajaProveedor.setEnabled(false);
        cajaProveedor.setText(pro.getNombre());
        //Línea 1
        this.setSize(new Dimension(830, 264));

        //Línea 2
        this.setMinimumSize(new Dimension(830, 264));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TxtNit = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        TxtNombre2 = new javax.swing.JLabel();
        cajaProveedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(799, 342));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 930, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR MARCA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 310, 70);

        TxtNit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNit.setForeground(new java.awt.Color(255, 255, 255));
        TxtNit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtNit.setText("PROVEEDOR");
        getContentPane().add(TxtNit);
        TxtNit.setBounds(440, 110, 130, 30);
        getContentPane().add(CajaNombre);
        CajaNombre.setBounds(200, 110, 200, 30);

        TxtNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre2.setText("NOMBRE");
        getContentPane().add(TxtNombre2);
        TxtNombre2.setBounds(80, 110, 120, 30);
        getContentPane().add(cajaProveedor);
        cajaProveedor.setBounds(590, 110, 200, 30);

        jButton1.setBackground(new java.awt.Color(192, 57, 43));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 170, 100, 30);

        botonRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(120, 170, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 970, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            String nombre = CajaNombre.getText();

            Marca m = new Marca(nombre, pro.getIdP());
            controlador.Agregar(m);
            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "COMPLETE CAMPOS", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrarClientes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JLabel TxtNit;
    private javax.swing.JLabel TxtNombre2;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        CajaNombre.setText("");

    }

    private boolean validar() {
        if (CajaNombre.getText().equals("")) {
            return false;
        }
        return true;
    }
}
