/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorCredito;
import Modelo.Cliente;
import Modelo.Credito;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class RegistrarCredito extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarClientes
     */
    ControladorCredito controladorCredito;

    public RegistrarCredito() {
        initComponents();
        setSize(900, 660);
        setLocationRelativeTo(null);

        controladorCredito = new ControladorCredito();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaCanMax = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        TxtNombre2 = new javax.swing.JLabel();
        Txt = new javax.swing.JLabel();
        CajaPlazoMax = new javax.swing.JTextField();
        cajaCanMin = new javax.swing.JTextField();
        Txt2 = new javax.swing.JLabel();
        cajaInteres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        Txt4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);
        getContentPane().add(cajaCanMax);
        cajaCanMax.setBounds(640, 220, 200, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 930, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVO CREDITO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 310, 70);

        TxtApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidos.setText("CANTIDAD MAXIMA A PRESTAR");
        getContentPane().add(TxtApellidos);
        TxtApellidos.setBounds(450, 220, 190, 30);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AVAL", "HIPOTECATIO" }));
        getContentPane().add(comboTipo);
        comboTipo.setBounds(590, 320, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PLAZO MAXIMO (MESES)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 120, 140, 30);
        getContentPane().add(CajaNombre);
        CajaNombre.setBounds(200, 120, 200, 30);

        TxtNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre2.setText("CANTIDAD MINIMA A PRESTAR");
        getContentPane().add(TxtNombre2);
        TxtNombre2.setBounds(20, 220, 190, 30);

        Txt.setBackground(new java.awt.Color(0, 51, 51));
        Txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Txt.setForeground(new java.awt.Color(255, 255, 255));
        Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt.setText("TIPO DE GARANTIA");
        getContentPane().add(Txt);
        Txt.setBounds(440, 320, 130, 30);
        getContentPane().add(CajaPlazoMax);
        CajaPlazoMax.setBounds(640, 120, 200, 30);
        getContentPane().add(cajaCanMin);
        cajaCanMin.setBounds(200, 220, 200, 30);

        Txt2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Txt2.setForeground(new java.awt.Color(255, 255, 255));
        Txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt2.setText("TASA DE INTERES (%)");
        getContentPane().add(Txt2);
        Txt2.setBounds(30, 310, 130, 30);
        getContentPane().add(cajaInteres);
        cajaInteres.setBounds(200, 310, 200, 30);

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
        jButton1.setBounds(190, 490, 100, 30);

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
        botonRegistrar.setBounds(60, 490, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE DEL CREDITO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 120, 130, 30);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONA NATURAL", "PERSONA JURIDICA" }));
        getContentPane().add(comboCategoria);
        comboCategoria.setBounds(200, 380, 200, 30);

        Txt4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Txt4.setForeground(new java.awt.Color(255, 255, 255));
        Txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt4.setText("CATEGORIA");
        getContentPane().add(Txt4);
        Txt4.setBounds(30, 380, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 920, 680);

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
            Integer plazoMax = Integer.parseInt(CajaPlazoMax.getText());
            Double canMax = Double.parseDouble(cajaCanMax.getText());
            Double canMin = Double.parseDouble(cajaCanMin.getText());
            Double tasa = Double.parseDouble(cajaInteres.getText());
            String garantia = comboTipo.getSelectedItem().toString();

            if ((canMax > canMin) && plazoMax > 4) {
                Credito credito = new Credito(nombre, plazoMax, canMax, canMin, garantia, tasa);
                credito.setClasifiacion(comboCategoria.getSelectedIndex());
                controladorCredito.Agregar(credito);
                JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "DEBE SER MAYOR LA CANTIDAD MAXIMA QUE LA CANTIDAD MINIMA Y EL PLAZO DEBE SER MAYOR QUE 4 MESES", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "COMPLETE CAMPOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JTextField CajaPlazoMax;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel Txt2;
    private javax.swing.JLabel Txt4;
    private javax.swing.JLabel TxtApellidos;
    private javax.swing.JLabel TxtNombre2;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaCanMax;
    private javax.swing.JTextField cajaCanMin;
    private javax.swing.JTextField cajaInteres;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        if (CajaNombre.getText().equals("") || CajaPlazoMax.getText().equals("")) {
            return false;
        } else if (cajaCanMin.getText().equals("") || cajaCanMax.getText().equals("")) {
            return false;
        } else if (cajaInteres.getText().equals("")) {
            return false;
        }
        return true;
    }
}
