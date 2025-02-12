/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCredito;
import Modelo.Credito;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class ListaCreditos extends javax.swing.JFrame {

    /**
     * Creates new form ListaClitenesNaturales
     */
    DefaultTableModel modelo;
    Controlador.ControladorCredito controladorCredito;
    ArrayList<Credito> listaCredito;
    DecimalFormat forma;
    int posicion=-1;
    Credito objeto;
    
    public ListaCreditos() {
        initComponents();
        setLocationRelativeTo(null);
        modelo();
        controladorCredito = new ControladorCredito();
        forma=new DecimalFormat("0.00");
        btnEliminar.setVisible(false);
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
        Tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Ver(e); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    private void modelo() {

        modelo = new DefaultTableModel();
        modelo.addColumn("N°");
        modelo.addColumn("TIPO");
        modelo.addColumn("MINIMO A PRESTAR $");
        modelo.addColumn("MAXIMO A PRESTAR $");
        modelo.addColumn("INTERES ANUAL (%)");
        modelo.addColumn("PLAZO MAXIMO");
        Tabla.setModel(modelo);
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
        Tabla = new javax.swing.JTable();
        BtnVer = new javax.swing.JButton();
        BtnModifica = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 660));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA DE CREDITOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 400, 70);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 200, 790, 380);

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
        getContentPane().add(BtnVer);
        BtnVer.setBounds(140, 130, 90, 30);

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
        getContentPane().add(BtnModifica);
        BtnModifica.setBounds(290, 130, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NUEVO CREDITO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(450, 130, 180, 30);

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(650, 130, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin_1600x900_10536.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 970, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        // TODO add your handling code here:
        DetalleCredito vista = new DetalleCredito(objeto);
        vista.setVisible(true);
    }//GEN-LAST:event_BtnVerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RegistrarCredito vista = new RegistrarCredito();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaActionPerformed
        // TODO add your handling code here:
        ModificarCredito vista = new ModificarCredito(objeto);
        vista.setVisible(true);
    }//GEN-LAST:event_BtnModificaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModifica;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Ver(MouseEvent e) {
        int row = Tabla.rowAtPoint(e.getPoint());
        posicion = Integer.parseInt(Tabla.getValueAt(row, 0).toString());
        objeto = new Credito();
        objeto = listaCredito.get(posicion - 1);
        BtnVer.setEnabled(true);
        BtnModifica.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    void verTabla() {
        //objeto = new Categoria();
        listaCredito = new ArrayList<>();
        listaCredito = controladorCredito.obtenerLista();

        modelo.setRowCount(listaCredito.size());

        for (int i = 0; i < listaCredito.size(); i++) {

            modelo.setValueAt(i + 1, i, 0);
            modelo.setValueAt(listaCredito.get(i).getTipo(), i, 1);
            modelo.setValueAt(forma.format(listaCredito.get(i).getCantidadMin()), i, 2);
            modelo.setValueAt(forma.format(listaCredito.get(i).getCantidadMax()), i, 3);
            modelo.setValueAt(forma.format(listaCredito.get(i).getInteres()), i, 4);
            modelo.setValueAt(listaCredito.get(i).getPlazoMax()+" MESES", i, 5);

        }
        Tabla.setModel(modelo);
    }
}
