/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Controlador.ControladorDeparamento;
import Controlador.ControladorSubCategoria;
import Modelo.Categoria;
import Modelo.Departamento;
import Modelo.SubCategoria;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PEREZ
 */
public class ModificarDepartamento extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCategoria
     */
    ControladorDeparamento controladorDep;
    int idDep;
    
    public ModificarDepartamento(Departamento dep) {
        initComponents();
        setLocationRelativeTo(null);
        CajaNombre.setText(dep.getNombreDep());
        idDep=dep.getIdDep();
        controladorDep = new ControladorDeparamento();
        
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
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVA DEPARTAMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 20));

        TxtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setText("NOMBRE");
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 30));
        getContentPane().add(CajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 30));

        jButton1.setBackground(new java.awt.Color(192, 57, 43));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 100, 30));

        botonRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:

        String nombre = CajaNombre.getText();
        
        if (true) {
            Departamento dep = new Departamento("", nombre);
            controladorDep.ModificarDepartamento(nombre,idDep);
            JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS", "EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JLabel TxtNombre;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}
