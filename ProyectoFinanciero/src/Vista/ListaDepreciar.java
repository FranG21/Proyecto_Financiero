/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */

public class ListaDepreciar extends javax.swing.JFrame {

    /**
     * Creates new form ListaClitenesNaturales
     */
    DefaultTableModel modelo;
    
    public ListaDepreciar() {
        initComponents();
        setLocationRelativeTo(null); 
        modelo();
    }
    
    private void modelo() {
        
        modelo = new DefaultTableModel();
        modelo.addColumn("N°");
        modelo.addColumn("CODIGO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("SUBCATEGORIA");
       // modelo.addColumn("TIPO");
        Tablacliente.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablacliente = new javax.swing.JTable();
        BtnVer = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 660));
        setMinimumSize(new java.awt.Dimension(950, 660));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEPRECIACION DE ACTIVO FIJO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 400, 70);

        Tablacliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tablacliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 200, 790, 380);

        BtnVer.setBackground(new java.awt.Color(0, 153, 0));
        BtnVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnVer.setForeground(new java.awt.Color(255, 255, 255));
        BtnVer.setText("VER");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVer);
        BtnVer.setBounds(140, 130, 90, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(550, 50, 230, 30);

        jButton1.setText("BUSCAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 50, 90, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        jLabel1.setText("SAFJKSDKFJSDFNJNKSFJNKDFJNKJNK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 970, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        // TODO add your handling code here:
        DetalleDepreciar vista = new DetalleDepreciar();
        vista.setVisible(true);
    }//GEN-LAST:event_BtnVerActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable Tablacliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
}
