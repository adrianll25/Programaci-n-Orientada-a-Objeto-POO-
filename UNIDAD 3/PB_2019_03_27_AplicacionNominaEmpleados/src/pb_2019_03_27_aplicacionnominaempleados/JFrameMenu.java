/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

import javax.swing.JLabel;

/**
 *
 * @author aa630
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    
    //atributos:
    private Empleado [] nomina = new Empleado[500]; //referencia del arreglo. es de la clase empleado porque es el que contiene todo
    
    private int empleadosRegistrados;
    
    public JFrameMenu() {
        initComponents();
        
        empleadosRegistrados =0;
        jLabEmpReg.setText(empleadosRegistrados+"");
    }
    
    //metodos del frmae:
    public int getTamaño()
    {
        return nomina.length;
    }
    //metodo para saber cuanto empleados registrados hay:
    public int getEmpleadosRegistrados()
    {
        return empleadosRegistrados;
    }
    public boolean agregarEmpleado(Empleado emp) //este ayuda a si se puede agregar un empleado 
    {
        if(empleadosRegistrados == nomina.length)
            return false;
        
        nomina[empleadosRegistrados] = emp;
        empleadosRegistrados++;//para que incremente 
        jLabEmpReg.setText(empleadosRegistrados+""); //para actualizarse 
        return true;
    }
    
    //para que llegue un empleado a ese arreglo:
    public void setEmpleado(Empleado emp, int posicion) //objeto, posicion 
    {
        if(posicion >=0 && posicion < nomina.length) //de cero a nueve
            nomina[posicion] = emp;
    }
    
    public Empleado getEmpleado(int posicion)
    {
        if(posicion >=0 && posicion < nomina.length) //de cero a nueve
        return nomina[posicion];
        else
            return null;
    }
    //tener acceso a la etiqueta de menu
    public JLabel getEtiqueta()
    {
        return jLabEmpReg;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButRegistro = new javax.swing.JButton();
        jButReporte = new javax.swing.JButton();
        jButConsulta = new javax.swing.JButton();
        jButSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabEmpReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButRegistro.setText("REGISTRO");
        jButRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegistroActionPerformed(evt);
            }
        });

        jButReporte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButReporte.setText("REPORTE");
        jButReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButReporteActionPerformed(evt);
            }
        });

        jButConsulta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButConsulta.setText("CONSULTA");
        jButConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButConsultaActionPerformed(evt);
            }
        });

        jButSalida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButSalida.setText("SALIDA");
        jButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("EMPLEADOS REGISTRADOS: ");

        jLabEmpReg.setBackground(new java.awt.Color(153, 153, 255));
        jLabEmpReg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabEmpReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabEmpReg.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabEmpReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabEmpReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButSalidaActionPerformed

    private void jButRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegistroActionPerformed
        // TODO add your handling code here:
        //CREAR UN OBJETO DE JFRAME REGISTRO:
        setVisible(false); //se lo pide a this
        
        JFrameRegistro jfRegistro = new JFrameRegistro(this);
        jfRegistro.setVisible(true);
        
    }//GEN-LAST:event_jButRegistroActionPerformed

    private void jButReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButReporteActionPerformed
        // TODO add your handling code here:
        //CREAR UN OBJETO DE JFRAME Reporte:
        setVisible(false); //se lo pide a this
        
        JFrameReporte jfReporte = new JFrameReporte(this);
        jfReporte.setVisible(true);
    }//GEN-LAST:event_jButReporteActionPerformed

    private void jButConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButConsultaActionPerformed
        // TODO add your handling code here:
        //CREAR UN OBJETO DE JFRAME consulta:
        setVisible(false); //se lo pide a this
        
        JFrameConsulta jfConsulta = new JFrameConsulta(this);
        jfConsulta.setVisible(true);
    }//GEN-LAST:event_jButConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButConsulta;
    private javax.swing.JButton jButRegistro;
    private javax.swing.JButton jButReporte;
    private javax.swing.JButton jButSalida;
    private javax.swing.JLabel jLabEmpReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
