/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_12_04_19_dibujo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa609
 */
public class JFrameDibujo extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDibujo
     */
    public JFrameDibujo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButDibujar = new javax.swing.JButton();
        jButMover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRBFrame = new javax.swing.JRadioButton();
        jRBPanel = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButDibujar.setText("Dibujar");
        jButDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDibujarActionPerformed(evt);
            }
        });

        jButMover.setText("mover");
        jButMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMoverActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        buttonGroup1.add(jRBFrame);
        jRBFrame.setText("FRAME");

        buttonGroup1.add(jRBPanel);
        jRBPanel.setText("PANEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBFrame)
                        .addGap(28, 28, 28)
                        .addComponent(jRBPanel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButMover)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButMover, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRBFrame)
                        .addComponent(jRBPanel))
                    .addComponent(jButDibujar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDibujarActionPerformed
        // TODO add your handling code here:
       dibujar(100,jButDibujar);
    }//GEN-LAST:event_jButDibujarActionPerformed

    private void jButMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMoverActionPerformed
        // TODO add your handling code here:
        Component comp;
        
        if(jRBFrame.isSelected())
            comp = this;
        else
            comp = jPanel1;
        
        for (int i = 1; i < 250; i+=2) 
            dibujar(i,jPanel1);
        
        
    }//GEN-LAST:event_jButMoverActionPerformed
    
    public void dibujar(int x, Component c)
    {
       Graphics papel = c.getGraphics();
       
       //borrar
        papel.setColor(c.getBackground());
        papel.fillRect(5,70,c.getWidth()-10,135);
        
        papel.setColor(Color.black); 
        papel.drawRect(x+50,95,80,25);
        papel.drawLine(x+30,120,x+50,95);
        papel.drawLine(x+150,120,x+130,95);
        papel.drawRect(x+15,120,170,30);
        
        papel.setColor(Color.yellow);
        papel.fillRect(x+20,125,160,20);
        
        papel.setColor(Color.red);
        papel.setFont(new Font("Courier",Font.ITALIC,18));
        papel.drawString("Tec Laguna", x+50, 140);
        
        papel.setColor(Color.black);
        papel.fillOval(x+40,145,20,20);
        papel.fillOval(x+130,145,20,20);
        
        papel.setColor(Color.blue);
        papel.drawLine(x+10,167,x+190,167); 
        
        //segunda opcion 
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(JFrameDibujo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
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
            java.util.logging.Logger.getLogger(JFrameDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDibujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDibujo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButDibujar;
    private javax.swing.JButton jButMover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBFrame;
    private javax.swing.JRadioButton jRBPanel;
    // End of variables declaration//GEN-END:variables
}