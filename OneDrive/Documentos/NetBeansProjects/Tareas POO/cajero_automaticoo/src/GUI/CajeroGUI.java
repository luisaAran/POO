/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Excepciones.OperacionInvalidaException;
import Excepciones.SaldoInsuficienteException;
import cajero_automaticoo.CajeroAutomatico;

/**
 *
 * @author LUISA ARANGO
 */
public class CajeroGUI extends javax.swing.JFrame {
    private CajeroAutomatico cajero;

    /**
     * Creates new form CajeroGUI
     */
    public CajeroGUI() {
        initComponents();
         cajero = new CajeroAutomatico(0.0); // Inicializa el cajero con saldo 0.0
        saldoInicial.setText("Saldo Inicial: $0.0"); // Muestra el saldo inicial

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saldoInicial = new javax.swing.JLabel();
        DepositarButton1 = new javax.swing.JButton();
        RetirarButton2 = new javax.swing.JButton();
        ConsultarSaldoButton3 = new javax.swing.JButton();
        Texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajeArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saldoInicial.setText("Saldo Inicial ");

        DepositarButton1.setText("Depositar");
        DepositarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarButton1ActionPerformed(evt);
            }
        });

        RetirarButton2.setText("Retirar");
        RetirarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarButton2ActionPerformed(evt);
            }
        });

        ConsultarSaldoButton3.setText("Consultar Saldo");
        ConsultarSaldoButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSaldoButton3ActionPerformed(evt);
            }
        });

        mensajeArea.setColumns(20);
        mensajeArea.setRows(5);
        jScrollPane1.setViewportView(mensajeArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(saldoInicial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(ConsultarSaldoButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DepositarButton1)
                                .addGap(64, 64, 64)
                                .addComponent(RetirarButton2)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(saldoInicial)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositarButton1)
                    .addComponent(RetirarButton2))
                .addGap(18, 18, 18)
                .addComponent(ConsultarSaldoButton3)
                .addGap(18, 18, 18)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
    * Maneja el evento de depósito de dinero.
    * Intenta depositar la cantidad ingresada por el usuario y actualiza el saldo.
    * 
    * @param evt Evento de acción generado por el botón de depósito.
    */

    private void DepositarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarButton1ActionPerformed
        // TODO add your handling code here:
         String cantidadTexto = Texto.getText();
        if (cantidadTexto.isEmpty()) {
        mensajeArea.append("Ingrese una cantidad antes de depositar.\n");
        return;
        }

        try {
        double cantidad = Double.parseDouble(cantidadTexto);
        cajero.depositar(cantidad);
        mensajeArea.append("Depósito de $" + cantidad + " realizado.\n");
    } catch (NumberFormatException ex) {
        mensajeArea.append("Cantidad inválida. Ingrese un valor numérico.\n");
    } catch (OperacionInvalidaException ex) {
        mensajeArea.append("Error: " + ex.getMessage() + "\n");
    }


    }//GEN-LAST:event_DepositarButton1ActionPerformed
            /**
    * Maneja el evento de consulta de saldo
    * 
    * @param evt Evento de acción generado por el botón de consulta de saldo
    */       
    private void ConsultarSaldoButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSaldoButton3ActionPerformed
        // TODO add your handling code here:
         mensajeArea.append("Saldo actual: $" + cajero.consultarSaldo() + "\n");                                                   
                        
    }//GEN-LAST:event_ConsultarSaldoButton3ActionPerformed
    /**
    * Maneja el evento de retiro de dinero.
    * Retira la cantidad ingresada por el usuario y actualiza el saldo
    * 
    * @param evt Evento de acción generado por el botón de retiro
    */

    private void RetirarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarButton2ActionPerformed
        // TODO add your handling code here:
          String cantidadTexto = Texto.getText();
        if (cantidadTexto.isEmpty()) {
        mensajeArea.append("Ingrese una cantidad antes de retirar.\n");
        return;
        }

        try {
        double cantidad = Double.parseDouble(Texto.getText());
        cajero.retirar(cantidad);
        mensajeArea.append("Retiro de $" + cantidad + " realizado.\n");
    } catch (NumberFormatException ex) {
        mensajeArea.append("Cantidad inválida.\n");
    } catch (SaldoInsuficienteException | OperacionInvalidaException ex) {
        mensajeArea.append("Error: " + ex.getMessage() + "\n");
    }

    }//GEN-LAST:event_RetirarButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CajeroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajeroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajeroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajeroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajeroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarSaldoButton3;
    private javax.swing.JButton DepositarButton1;
    private javax.swing.JButton RetirarButton2;
    private javax.swing.JTextField Texto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mensajeArea;
    private javax.swing.JLabel saldoInicial;
    // End of variables declaration//GEN-END:variables
}
