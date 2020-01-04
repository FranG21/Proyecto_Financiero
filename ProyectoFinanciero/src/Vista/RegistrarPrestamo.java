/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorActivo;
import Controlador.ControladorAmortizacion;
import Controlador.ControladorCliente;
import Controlador.ControladorCredito;
import Controlador.ControladorDepreciacion;
import Controlador.ControladorPrestamo;
import Controlador.ControladorVenta;
import Modelo.Activo;
import Modelo.Amortizacion;
import Modelo.Cliente;
import Modelo.Credito;
import Modelo.Depreciacion;
import Modelo.DepreciacionAcumulada;
import Modelo.Movimiento;
import Modelo.Prestamo;
import Modelo.Venta;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class RegistrarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarClientes
     */
    SimpleDateFormat formaFecha;
    Date fechaActual;
    ArrayList<Prestamo> listaPrestamos;
    DecimalFormat formaPrecio;
    int meses;
    ControladorCredito controladorCredito;
    ArrayList<Credito> listaCreditos;
    Cliente cliente;
    Double cuota = -1.00;
    Credito credito;
    ArrayList<Amortizacion> listaAmortizacion;
    ControladorPrestamo controladorPrestamo;
    ControladorAmortizacion controladorAmortizacion;
    ControladorCliente controladorCliente;

    public RegistrarPrestamo(Cliente obj) {
        initComponents();

        cliente = obj;

        controladorCliente = new ControladorCliente();
        controladorCredito = new ControladorCredito();
        controladorPrestamo = new ControladorPrestamo();
        controladorAmortizacion = new ControladorAmortizacion();
        formaFecha = new SimpleDateFormat("dd-MM-YYYY");
        fechaActual = new Date();
        formaPrecio = new DecimalFormat("0.00");
        listaCreditos = new ArrayList<>();
        listaAmortizacion = new ArrayList<>();

        CajaFecha.setText(formaFecha.format(fechaActual));

        CajaDui.setText(cliente.getDui());
        CajaNombre.setText(cliente.getNombre());

        listaCreditos = controladorCredito.obtenerListaEstado();
        llenarCombo();
        //Línea 1
        this.setSize(new Dimension(899, 450));

        //Línea 2
        this.setMinimumSize(new Dimension(899, 450));
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

        CajaCuota = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtDui = new javax.swing.JLabel();
        CajaFecha = new javax.swing.JTextField();
        CajaDui = new javax.swing.JTextField();
        TxtNombre2 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        TxtDui1 = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        CajaMonto = new javax.swing.JTextField();
        TxtDui2 = new javax.swing.JLabel();
        TxtDui3 = new javax.swing.JLabel();
        CajaPlazo = new javax.swing.JTextField();
        botonRegistrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(799, 342));
        getContentPane().setLayout(null);

        CajaCuota.setEnabled(false);
        getContentPane().add(CajaCuota);
        CajaCuota.setBounds(190, 300, 200, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 930, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR PRESTAMO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 310, 70);

        TxtApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidos.setText("MONTO");
        getContentPane().add(TxtApellidos);
        TxtApellidos.setBounds(450, 170, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DUI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 110, 130, 30);

        TxtDui.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtDui.setForeground(new java.awt.Color(255, 255, 255));
        TxtDui.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TxtDui.setText("CUOTA");
        getContentPane().add(TxtDui);
        TxtDui.setBounds(70, 300, 110, 30);

        CajaFecha.setEnabled(false);
        getContentPane().add(CajaFecha);
        CajaFecha.setBounds(600, 230, 200, 30);

        CajaDui.setEnabled(false);
        getContentPane().add(CajaDui);
        CajaDui.setBounds(190, 110, 200, 30);

        TxtNombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre2.setText("NOMBRE DEL CLIENTE");
        getContentPane().add(TxtNombre2);
        TxtNombre2.setBounds(450, 110, 120, 30);

        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(comboTipo);
        comboTipo.setBounds(190, 170, 200, 30);

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
        jButton1.setBounds(710, 370, 100, 30);

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
        botonRegistrar.setBounds(570, 370, 110, 30);

        TxtDui1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtDui1.setForeground(new java.awt.Color(255, 255, 255));
        TxtDui1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtDui1.setText("FECHA DE REGISTRO");
        getContentPane().add(TxtDui1);
        TxtDui1.setBounds(430, 230, 160, 30);

        CajaNombre.setEnabled(false);
        getContentPane().add(CajaNombre);
        CajaNombre.setBounds(600, 110, 200, 30);
        getContentPane().add(CajaMonto);
        CajaMonto.setBounds(600, 170, 200, 30);

        TxtDui2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtDui2.setForeground(new java.awt.Color(255, 255, 255));
        TxtDui2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtDui2.setText("TIPO DE PRESTAMO");
        getContentPane().add(TxtDui2);
        TxtDui2.setBounds(40, 170, 160, 30);

        TxtDui3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtDui3.setForeground(new java.awt.Color(255, 255, 255));
        TxtDui3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TxtDui3.setText("PLAZO");
        getContentPane().add(TxtDui3);
        TxtDui3.setBounds(70, 230, 110, 30);
        getContentPane().add(CajaPlazo);
        CajaPlazo.setBounds(190, 230, 200, 30);

        botonRegistrar1.setBackground(new java.awt.Color(255, 204, 0));
        botonRegistrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar1.setText("GENERAR CUOTA");
        botonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar1);
        botonRegistrar1.setBounds(420, 300, 170, 33);

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

            Integer idCliente = cliente.getId();
            Integer idCredito = listaCreditos.get(comboTipo.getSelectedIndex() - 1).getId();
            Double montoMin = listaCreditos.get(comboTipo.getSelectedIndex() - 1).getCantidadMin();
            Double monto = Double.parseDouble(CajaMonto.getText());
            int plazo = Integer.parseInt(CajaPlazo.getText());
            Double intereses = 0.00;
            Double saldoFinal = 0.00;
            Amortizacion amortizacion;
            Double in = listaCreditos.get(comboTipo.getSelectedIndex() - 1).getInteres() / 12;
            in = in / 100;

            asignarTipo();

            if (monto > montoMin) {
                Prestamo x = new Prestamo(monto, plazo, fechaActual, cuota, idCliente, idCredito);
                controladorPrestamo.Agregar(x);
                x.setId(controladorPrestamo.obtenerUltimoRegistro());

                for (int i = 0; i < plazo; i++) {
                    intereses = monto * in;

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(fechaActual); // Configuramos la fecha que se recibe
                    calendar.add(Calendar.MONTH, 1);
                    fechaActual = calendar.getTime();

                    amortizacion = new Amortizacion(fechaActual, monto, cuota - intereses, intereses, cuota, monto, x.getId());
                    monto = monto - (cuota - intereses);
                    amortizacion.setSaldoFinal(monto);

                    controladorAmortizacion.Agregar(amortizacion);
                    listaAmortizacion.add(amortizacion);
                }
                JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS", "EXITO", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "DEBE D INGRESAR UN MONTO MAYOR AL MINIMO QUE ES $"+montoMin, "EXITO", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "COMPLETE CAMPOS", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrar1ActionPerformed
        // TODO add your handling code here:
        if (comboTipo.getSelectedIndex() != 0 && !CajaMonto.getText().equals("")) {
            credito = listaCreditos.get(comboTipo.getSelectedIndex() - 1);
            cuota = obtenerCuota();
            CajaCuota.setText("" + formaPrecio.format(cuota));
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UN TIPO DE CREDITO Y INGRESE MONTO", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrar1ActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
        CajaCuota.setText("");
    }//GEN-LAST:event_comboTipoActionPerformed

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
    private javax.swing.JTextField CajaCuota;
    private javax.swing.JTextField CajaDui;
    private javax.swing.JTextField CajaFecha;
    private javax.swing.JTextField CajaMonto;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaPlazo;
    private javax.swing.JLabel TxtApellidos;
    private javax.swing.JLabel TxtDui;
    private javax.swing.JLabel TxtDui1;
    private javax.swing.JLabel TxtDui2;
    private javax.swing.JLabel TxtDui3;
    private javax.swing.JLabel TxtNombre2;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegistrar1;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        comboTipo.addItem("SELECCIONE");
        for (int i = 0; i < listaCreditos.size(); i++) {
            comboTipo.addItem(listaCreditos.get(i).getTipo());
        }
    }

    private boolean validar() {
        if (comboTipo.getSelectedIndex() == 0 || CajaMonto.getText().equals("")) {
            return false;
        } else if (CajaPlazo.getText().equals("") || CajaCuota.getText().equals("")) {
            return false;
        }
        return true;
    }

    private Double obtenerCuota() {
        Double pagoMensual = 0.00;
        Double p = Double.parseDouble(CajaMonto.getText());
        JOptionPane.showMessageDialog(null, "" + credito.getInteres());
        Double i = credito.getInteres() / 12;
        int n = Integer.parseInt(CajaPlazo.getText());
        i = i / 100;

        pagoMensual = (p * i) / (1 - Math.pow(1 / (1 + i), n));

        return pagoMensual;
    }

    private void asignarTipo() {

        listaPrestamos = new ArrayList<>();
        listaPrestamos = controladorPrestamo.obtenerLista(cliente.getId());

        if (listaPrestamos.isEmpty()) {
            controladorCliente.ModificarCartera(1, cliente.getId());
        }
    }
}
