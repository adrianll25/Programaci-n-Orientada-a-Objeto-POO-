/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto3;

import java.awt.Component;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
class JFrameVisualA extends javax.swing.JFrame{

    /**
     * Creates new form JFrameVisualA
     */
    
    MueblesCocina [] Famsa = new MueblesCocina[4];
    
    int i =0;
    
    DefaultTableModel modelo;
    
    public JFrameVisualA() {
        initComponents();
        
        modelo = (DefaultTableModel) jTableMuebles.getModel();
        jTableMuebles.setShowGrid(true);
        }
    public JFrameVisualA getFRame()
    {
        return this;
    }
    
     public void setMueblesCocina (MueblesCocina Cocina, int posicion)
    {
        Famsa[posicion]=Cocina;
    }
    
    public MueblesCocina getMueblesCocina(int posicion)
    {
        return Famsa[posicion];
    }
    
    public void CrearObjetos()
    {
        //String Nombre [] = new String[4];
        String Descripcion [] = new String[4];
        int Precio [] = new int[4];
        
        for(int i=0; i<Descripcion.length; i++)
        {
            //No[i] = jTableMuebles.getValueAt(i, 0)+"";
            Descripcion[i] = jTableMuebles.getValueAt(i, 0)+"";
            Precio[i] = Integer.parseInt(jTableMuebles.getValueAt(i,1)+"");
            
            if(i<1)
                Famsa[i] = new LineaBlanca(Descripcion[i], Precio[i], "Desconocido");
            else
                Famsa[i] = new Electrodomestico(Descripcion[i], Precio[i], "Desconocido");
                
        }
        
    }
    
    public void Ordenar()
    {
     CrearObjetos();
     Arrays.sort(Famsa);
     for(MueblesCocina a:Famsa);
     
     for(i=0; i<Famsa.length; i++)
     {
       
        jTableMuebles.setValueAt(Famsa[i].getDescripcion(), i, 1);
        jTableMuebles.setValueAt(Famsa[i].getPrecio(), i, 2);
     }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMuebles = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelDibujo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextInformacion = new javax.swing.JTextArea();
        jButEjemplo = new javax.swing.JButton();
        jButMostrar = new javax.swing.JButton();
        jButDesfilar = new javax.swing.JButton();
        jSpinPosicion = new javax.swing.JSpinner();
        jButDiagrama = new javax.swing.JButton();
        jButAsignacion = new javax.swing.JButton();
        jButSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableMuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mueble de Cocina", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTableMuebles);
        if (jTableMuebles.getColumnModel().getColumnCount() > 0) {
            jTableMuebles.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableMuebles.getColumnModel().getColumn(1).setPreferredWidth(15);
        }

        jScrollPane2.setViewportView(jPanelDibujo);

        jTextInformacion.setColumns(20);
        jTextInformacion.setRows(5);
        jScrollPane3.setViewportView(jTextInformacion);

        jButEjemplo.setBackground(new java.awt.Color(0, 153, 153));
        jButEjemplo.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButEjemplo.setText("Ejemplo");
        jButEjemplo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButMostrar.setBackground(new java.awt.Color(0, 153, 153));
        jButMostrar.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButMostrar.setText("Mostrar");
        jButMostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });

        jButDesfilar.setBackground(new java.awt.Color(0, 153, 153));
        jButDesfilar.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButDesfilar.setText("Desfilar");
        jButDesfilar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButDesfilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfilarActionPerformed(evt);
            }
        });

        jSpinPosicion.setFont(new java.awt.Font("ADAM.CG PRO", 0, 11)); // NOI18N
        jSpinPosicion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinPosicionStateChanged(evt);
            }
        });

        jButDiagrama.setBackground(new java.awt.Color(0, 153, 153));
        jButDiagrama.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButDiagrama.setText("Diagrama");
        jButDiagrama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDiagramaActionPerformed(evt);
            }
        });

        jButAsignacion.setBackground(new java.awt.Color(0, 153, 153));
        jButAsignacion.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButAsignacion.setText("Asignacion");
        jButAsignacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAsignacionActionPerformed(evt);
            }
        });

        jButSalir.setBackground(new java.awt.Color(0, 153, 153));
        jButSalir.setFont(new java.awt.Font("ADAM.CG PRO", 0, 14)); // NOI18N
        jButSalir.setText("Salir");
        jButSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSpinPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButDesfilar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButDiagrama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButAsignacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButEjemplo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSpinPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButDesfilar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButDiagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        // TODO add your handling code here:
        Estufa Mabe = new Estufa();
        Refrigerador Avenger = new Refrigerador();
        Microondas LG = new Microondas();
        Licuadora Ninja = new Licuadora();
        
        jTableMuebles.setValueAt(Mabe.getDescripcion(), 0, 0);
        jTableMuebles.setValueAt(Mabe.getPrecio(), 0, 1);
        
        jTableMuebles.setValueAt(Avenger.getDescripcion(), 1, 0);
        jTableMuebles.setValueAt(Avenger.getPrecio(), 1, 1);
        
        jTableMuebles.setValueAt(LG.getDescripcion(), 2, 0);
        jTableMuebles.setValueAt(LG.getPrecio(), 2, 1);
        
        jTableMuebles.setValueAt(Ninja.getDescripcion(), 3, 0);
        jTableMuebles.setValueAt(Ninja.getPrecio(), 3, 1);
                                               

    }//GEN-LAST:event_jButEjemploActionPerformed

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // TODO add your handling code here:
         jTextInformacion.setText("");
        
        CrearObjetos();
        
        if(Integer.parseInt(jSpinPosicion.getValue()+"")<4)
        jSpinPosicion.setValue((Integer.parseInt(jSpinPosicion.getValue()+""))+1);
        else
            jSpinPosicion.setValue(1);
        
        
        Estufa Mabe = new Estufa();
        Refrigerador Avenger = new Refrigerador();
        Microondas LG = new Microondas();
        Licuadora Ninja = new Licuadora();
        
        for(i=0; i<Famsa.length; i++)
        {
        if(Famsa[i].getDescripcion().equals(Mabe.getDescripcion()) 
            && Famsa[i].getDescripcion().equals(Mabe.getDescripcion())
                && Famsa[i].getPrecio() == Mabe.getPrecio())
            Famsa[i]=Mabe;
        
        if(Famsa[i].getDescripcion().equals(Avenger.getDescripcion()) 
            && Famsa[i].getDescripcion().equals(Avenger.getDescripcion())
                && Famsa[i].getPrecio() == Avenger.getPrecio())
            Famsa[i]=Avenger;
        
        if(Famsa[i].getDescripcion().equals(LG.getDescripcion()) 
            && Famsa[i].getDescripcion().equals(LG.getDescripcion())
                && Famsa[i].getPrecio() == LG.getPrecio())
            Famsa[i]=LG;
        
        if(Famsa[i].getDescripcion().equals(Ninja.getDescripcion()) 
            && Famsa[i].getDescripcion().equals(Ninja.getDescripcion())
                && Famsa[i].getPrecio() == Ninja.getPrecio())
            Famsa[i]=Ninja;
        
        
         if(Integer.parseInt(jSpinPosicion.getValue()+"")<4)
            jSpinPosicion.setValue((Integer.parseInt(jSpinPosicion.getValue()+""))+1);
        else
            jSpinPosicion.setValue(1);
        }
//        switch((int)jSpinPosicion.getValue());
               switch(Integer.parseInt(jSpinPosicion.getValue()+""))
        {
            case 1:
            {
                
                jTextInformacion.append(Famsa[0].Mostrar());
                Famsa[0].Dibujar(0,0,jPanelDibujo); 
            
           
        setMueblesCocina(Famsa[0], 0);
        
               
            break;
            }
            
            case 2:
            {
                jTextInformacion.append(Famsa[1].Mostrar());
                    Famsa[1].Dibujar(0,0,jPanelDibujo);
                    
                    setMueblesCocina(Famsa[1], 1);
        
                break;
            }
            
            case 3:
            {
                jTextInformacion.append(Famsa[2].Mostrar());
            Famsa[2].Dibujar(0,0,jPanelDibujo);
            
        setMueblesCocina(Famsa[2], 2);
                break;
            }
            case 4:
            {
                jTextInformacion.append(Famsa[3].Mostrar());
                Famsa[3].Dibujar(0,0,jPanelDibujo);
                
        setMueblesCocina(Famsa[3], 3);
                break;
            }
        }               
    }//GEN-LAST:event_jButMostrarActionPerformed

    private void jButDesfilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfilarActionPerformed
        // TODO add your handling code here:
       jFrameVisualB desfile = new jFrameVisualB (this);
        
        desfile.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButDesfilarActionPerformed

    private void jButAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAsignacionActionPerformed
        // TODO add your handling code here:
         jFrameVisualD asignacion = new jFrameVisualD (this);
        
        asignacion.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButAsignacionActionPerformed

    private void jSpinPosicionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinPosicionStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSpinPosicionStateChanged

    private void jButDiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDiagramaActionPerformed
        // TODO add your handling code here:
        jFrameVisualC Diagrama = new jFrameVisualC (this);
        
        Diagrama.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButDiagramaActionPerformed

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVisualA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVisualA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAsignacion;
    private javax.swing.JButton jButDesfilar;
    private javax.swing.JButton jButDiagrama;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JButton jButSalir;
    private javax.swing.JTextPane jPanelDibujo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinPosicion;
    private javax.swing.JTable jTableMuebles;
    private javax.swing.JTextArea jTextInformacion;
    // End of variables declaration//GEN-END:variables

  
}
