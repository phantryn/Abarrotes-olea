/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbarrotesOlea;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import calculadora99.sumaProductos;
/**
 *
 * @author user
 */
public class Reloj extends javax.swing.JFrame implements Runnable {

    
    String hora, minuto, segundo, am_pm;
    Calendar calendario;
    Thread hilo;
    int h;
    
    public Reloj() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Reloj");
        
        hilo = new Thread(this);
        hilo.start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnReloj = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnReloj.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        BtnReloj.setForeground(new java.awt.Color(0, 0, 255));
        BtnReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnReloj.setText("jLabel1");
        BtnReloj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 4, true));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 0));
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hora centro de México");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnReloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BtnReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       new panel_comtrol().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnReloj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
     @Override
    public void run() {
        while(true){
        calcular();
        BtnReloj.setText(hora +":" +minuto+":" + segundo +":"+ am_pm );
        try{
            hilo.sleep(1000);
        }catch (InterruptedException ex){
           
        }
    
    }
}
private void calcular (){
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual= new Date ();
        
        calendario.setTime(fechaHoraActual);
        am_pm= calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM"; 
        
        if (am_pm.endsWith("PM")){
            h = calendario.get(Calendar.HOUR_OF_DAY);
            hora= h >9? ""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9? ""+calendario.get(Calendar.HOUR_OF_DAY):"0"+ calendario.get(Calendar.HOUR_OF_DAY);
            
        }
        minuto=calendario.get(Calendar.MINUTE)>9? ""+calendario.get(Calendar.MINUTE):"0"+ calendario.get(Calendar.MINUTE);
        segundo=calendario.get(Calendar.SECOND)>9? ""+calendario.get(Calendar.SECOND):"0"+ calendario.get(Calendar.SECOND);
    }
}
