/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_examen_03;

import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class jFrameVisualA extends javax.swing.JFrame {

    /**
     * Creates new form jFrameVisualA
     */
    public jFrameVisualA() {
        initComponents();
          }
     Random azar = new Random();
     Transporte [] Trans = new Transporte[16];
     
      public void ordenar(){
 
      for(int i = Trans.length-1; i>=0; i--)
     jTextInverso.append(Trans[i].Mostrar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButInverso = new javax.swing.JButton();
        jButGenerar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextGenerar = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextInverso = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButInverso.setText("Inverso");
        jButInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInversoActionPerformed(evt);
            }
        });
        getContentPane().add(jButInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jButGenerar.setText("Generar");
        jButGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(jButGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jTextGenerar.setColumns(20);
        jTextGenerar.setRows(5);
        jScrollPane2.setViewportView(jTextGenerar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, 320));

        jTextInverso.setColumns(20);
        jTextInverso.setRows(5);
        jScrollPane4.setViewportView(jTextInverso);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 240, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_18131253_examen_03/FondoJava.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInversoActionPerformed
        // TODO add your handling code here:
        jTextInverso.setText("");
        ordenar();
    }//GEN-LAST:event_jButInversoActionPerformed

    private void jButGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGenerarActionPerformed
        // TODO add your handling code here:
                
        jTextGenerar.setText("");
        
        String [] Modelo = {"1960", "1970","1980", "1990", "2000", "2010", "2020", "1950"};
        String [] Transmicion = {"Automatica","Estandar"};
  
        Avion a = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion b = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion c = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion d = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion e = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion f = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion g = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        Avion h = new Avion(Modelo[azar.nextInt(Modelo.length)],azar.nextInt(99));
        
        Automovil i = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil j = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil k = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil l = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil m = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil ñ = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil o = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
        Automovil p = new Automovil(Modelo[azar.nextInt(Modelo.length)], Transmicion[azar.nextInt(Transmicion.length)]);
 
        Trans[0] = a;
        Trans[1] = b;
        Trans[2] = c;
        Trans[3] = d;
        Trans[4] = e;
        Trans[5] = f;
        Trans[6] = g;
        Trans[7] = h;
        Trans[8] = i;
        Trans[9] = j;
        Trans[10] = k;
        Trans[11] = l;
        Trans[12] = m;
        Trans[13] = ñ;
        Trans[14] = o;
        Trans[15] = p;
        

   

        for (Transporte Tran : Trans) {
            jTextGenerar.append(Tran.Mostrar());
        }

    }//GEN-LAST:event_jButGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameVisualA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButGenerar;
    private javax.swing.JButton jButInverso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextGenerar;
    private javax.swing.JTextArea jTextInverso;
    // End of variables declaration//GEN-END:variables
}
