package AbarrotesOlea;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class panel_comtrol extends javax.swing.JFrame {

    /**
     * Creates new form panel_comtrol
     */
    public panel_comtrol() {

        initComponents();
      
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnInformacion = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnInventario = new javax.swing.JButton();
        BtnCalcular = new javax.swing.JButton();
        BtnReloj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interfaz\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 3, 36), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 51, 0));

        BtnInformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnInformacion.setText("Información");
        BtnInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        BtnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInformacionActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnInventario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnInventario.setText("Inventario");
        BtnInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });

        BtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCalcular.setText("Calculadora");
        BtnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        BtnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        BtnReloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnReloj.setText("Reloj");
        BtnReloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        BtnReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRelojActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed

       

        float cantidadNumeros,total,i,nuevoNumero, nuevo, pago, resta, y;

        cantidadNumeros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantiadad de productos a sumar"));

        total = 0;

        for(i = 1; i <= cantidadNumeros; i++){

            nuevo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto "+i+""));

            nuevoNumero = nuevo;
            total = total + nuevoNumero;

        }
        JOptionPane.showMessageDialog(null, "El total a pagar por la compra es "+total+" pesos");

        y  = Float.parseFloat(JOptionPane.showInputDialog("ingrese pago del cliente "));

        resta = y-total;

        if(resta==0){
            JOptionPane.showMessageDialog(null, "El cambio del cliente es 0 pesos" );
        }else{
            if(resta<0){
                JOptionPane.showMessageDialog(null, " Al cliente le faltan " +resta+ " pesos para completar la compra ");
            }else{
                JOptionPane.showMessageDialog(null, "El cambio del cliente es: " +resta+ " pesos");
            }

        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        this.dispose();
        new Productos().setVisible(true);
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInformacionActionPerformed
        this.dispose();
        new Informacion().setVisible(true);
    }//GEN-LAST:event_BtnInformacionActionPerformed

    private void BtnRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRelojActionPerformed
       this.dispose();
        new Reloj().setVisible(true);
    }//GEN-LAST:event_BtnRelojActionPerformed

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
            java.util.logging.Logger.getLogger(panel_comtrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_comtrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_comtrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_comtrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new panel_comtrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnInformacion;
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnReloj;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
