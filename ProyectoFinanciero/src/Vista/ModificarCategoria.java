/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCategoria;
import Modelo.Categoria;
import javax.swing.JOptionPane;

/**
 *
 * @author PEREZ
 */
public class ModificarCategoria extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCategoria
     */
    ControladorCategoria cc;
    private Categoria c = new Categoria();

    ModificarCategoria(Categoria c) {
        this.c = c;
        initComponents();
        setLocationRelativeTo(null);
        cc = new ControladorCategoria();
        System.out.println("o" + c.getNombre());
        CajaNombre.setText(c.getNombre());
        CajaCod.setText(c.getCodigo());
        CajaValr.setText("" + c.getValorResidual());
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
        TxtCod = new javax.swing.JLabel();
        CajaCod = new javax.swing.JTextField();
        TxtValr = new javax.swing.JLabel();
        CajaValr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MODIFICAR CATEGORIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 20));

        TxtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setText("NOMBRE");
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 30));

        CajaNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CajaNombreFocusLost(evt);
            }
        });
        getContentPane().add(CajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 30));

        TxtCod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtCod.setForeground(new java.awt.Color(255, 255, 255));
        TxtCod.setText("VIDA UTIL");
        getContentPane().add(TxtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 130, 30));
        getContentPane().add(CajaCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 200, 30));

        TxtValr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtValr.setForeground(new java.awt.Color(255, 255, 255));
        TxtValr.setText("VALOR RESIDUAL");
        getContentPane().add(TxtValr, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, 30));

        CajaValr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaValrKeyTyped(evt);
            }
        });
        getContentPane().add(CajaValr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 200, 30));

        jButton1.setBackground(new java.awt.Color(192, 57, 43));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 130, 30));

        botonRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("MODIFICAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 920, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String nombre = this.CajaNombre.getText();
        String cod = this.CajaCod.getText();
        String val = this.CajaValr.getText();
        if (vacio(nombre, val, cod)) {
            Double valr = Double.parseDouble(val);
            if (cc.existeCampo("cod", cod, c.getIdCategoria()) && cc.existeCampo("nombre", nombre, c.getIdCategoria())) {
                c.setCodigo(cod);
                c.setNombre(nombre);
                c.setValorResidual(valr);
                if (cc.ModificarCategoria(c)) {
                    JOptionPane.showMessageDialog(rootPane, "CATEGORIA MODIFICADA EXITOSAMENTE", "MODIFICAR CATEGORIA", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "ERROR AL MODIFICAR CATEGORIA!", "MODIFICAR CATEGORIA", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                mensajes(cod, nombre);
            }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void CajaNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CajaNombreFocusLost

    }//GEN-LAST:event_CajaNombreFocusLost

    private void CajaValrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaValrKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaValrKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaCod;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaValr;
    private javax.swing.JLabel TxtCod;
    private javax.swing.JLabel TxtNombre;
    private javax.swing.JLabel TxtValr;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean vacio(String nombre, String val, String cod) {
        if (nombre.isEmpty() || val.isEmpty() || cod.isEmpty()
                || nombre.equalsIgnoreCase(" ") || val.equalsIgnoreCase(" ") || cod.equalsIgnoreCase(" ")) {
            JOptionPane.showMessageDialog(rootPane, "COMPLETE LOS CAMPOS VACIOS", "MODIFICAR CATEGORIA", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void mensajes(String cod, String nombre) {
        if (!cc.existeCampo("cod", cod, this.c.getIdCategoria()) && cc.existeCampo("nombre", nombre, this.c.getIdCategoria())) {
            JOptionPane.showMessageDialog(rootPane, "CODIGO: " + cod + ", YA SE ENCUENTRA REGISTRADO", "MODIFICAR CATEGORIA", JOptionPane.WARNING_MESSAGE);
        } else if (cc.existeCampo("cod", cod, this.c.getIdCategoria()) && !cc.existeCampo("nombre", nombre, this.c.getIdCategoria())) {
            JOptionPane.showMessageDialog(rootPane, "NOMBRE: " + nombre + ", YA SE ENCUENTRA REGISTRADO", "MODIFICAR CATEGORIA", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "CODIGO: " + cod + " Y NOMBRE: " + nombre + ", YA SE ENCUENTRAN REGISTRADOS", "MODIFICAR CATEGORIA", JOptionPane.WARNING_MESSAGE);
        }
    }

    public Categoria getC() {
        return c;
    }

    public void setC(Categoria c) {
        this.c = c;
    }

}
