/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author PEREZ
 */
public class RegistrarSubCategoria extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCategoria
     */
    public RegistrarSubCategoria() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        TxtNombre = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        TxtNombre1 = new javax.swing.JLabel();
        CajaNombre1 = new javax.swing.JTextField();
        TxtNombre2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVA CATEGORIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 310, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 930, 20);

        TxtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setText("NOMBRE");
        getContentPane().add(TxtNombre);
        TxtNombre.setBounds(100, 110, 130, 30);
        getContentPane().add(CajaNombre);
        CajaNombre.setBounds(70, 140, 200, 30);

        TxtNombre1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre1.setText("CODIGO");
        getContentPane().add(TxtNombre1);
        TxtNombre1.setBounds(100, 210, 130, 30);
        getContentPane().add(CajaNombre1);
        CajaNombre1.setBounds(70, 240, 200, 30);

        TxtNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre2.setText("CATEGORIA");
        getContentPane().add(TxtNombre2);
        TxtNombre2.setBounds(440, 110, 130, 30);

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
        jButton1.setBounds(520, 240, 100, 30);

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
        botonRegistrar.setBounds(390, 240, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "CATEGORIA 1", "CATEGORIA 2", "...." }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(410, 140, 200, 30);

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
    }//GEN-LAST:event_botonRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarSubCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarSubCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarSubCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSubCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarSubCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaNombre1;
    private javax.swing.JLabel TxtNombre;
    private javax.swing.JLabel TxtNombre1;
    private javax.swing.JLabel TxtNombre2;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
