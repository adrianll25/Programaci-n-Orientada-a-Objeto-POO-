/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_10_archivobinariovisual;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import java.io.IOException;
import java.util.Arrays;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa630
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    //ATRIBUTOS DEL FRAME:
    DefaultTableModel modelo;
    MiRandom azar = new MiRandom();
    JFileChooser jfch = new JFileChooser();
    
    public JFrameMenu() {
        initComponents();
        
        modelo =(DefaultTableModel)jTableAlumnos.getModel();
        
        jTableAlumnos.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSpinAlumnos = new javax.swing.JSpinner();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabPromGeneral = new javax.swing.JLabel();
        jTextArchivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuNuevo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenuGuardarOrdenado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALUMNO", "fisica", "QUIMICA", "MATEMATICAS", "POO", "PROBABILIDAD", "PROMEDIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAlumnos);

        jLabel1.setText("NUMERO DE ALUMNOS:");

        jSpinAlumnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinAlumnosStateChanged(evt);
            }
        });

        jButAleatorios.setText("ALEATORIOS");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButCalcular.setText("CALCULAR");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("PROMEDIO GENERAL:");

        jLabPromGeneral.setBackground(new java.awt.Color(51, 255, 51));
        jLabPromGeneral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabPromGeneral.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabPromGeneral.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARCHIVO BINARIO");
        jLabel3.setOpaque(true);

        jMenu3.setText("Archivo");

        jMenuNuevo.setText("Nuevo");
        jMenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuNuevo);

        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAbrir);

        jMenuGuardar.setText("Guardar");
        jMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGuardar);

        jMenuGuardarOrdenado.setText("Guardar Ordenado");
        jMenuGuardarOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarOrdenadoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGuardarOrdenado);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Salir");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButAleatorios)
                        .addGap(26, 26, 26)
                        .addComponent(jButCalcular))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabPromGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButCalcular)
                            .addComponent(jButAleatorios))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabPromGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinAlumnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinAlumnosStateChanged
        // TODO add your handling code here:
        modelo.setRowCount((int)jSpinAlumnos.getValue());
    }//GEN-LAST:event_jSpinAlumnosStateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        for(int r= 0; r<modelo.getRowCount();r++)
        {
            modelo.setValueAt(azar.nextNombreCompleto(), r, 0);
            for(int c=1; c<modelo.getColumnCount()-1;c++)
                modelo.setValueAt(azar.nextInt(40,100), r, c);
        }
        
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        double suma,promedio;
        double sumaGral=0,promGral;
        
        for(int r=0; r<modelo.getRowCount();r++)
        {
            suma = 0;
            for(int c=1; c<modelo.getColumnCount()-1;c++)
                suma+= Double.parseDouble(modelo.getValueAt(r, c)+"");
            
            promedio = suma /(modelo.getColumnCount()-2);
            sumaGral += promedio;
            
            modelo.setValueAt(promedio, r, modelo.getColumnCount()-1);
        }
        promGral = sumaGral / modelo.getColumnCount();
        jLabPromGeneral.setText(promGral+"");
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jMenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoActionPerformed
        // TODO add your handling code here:
        
        //esto para el proyecto:
        jSpinAlumnos.setValue(0);
        jLabPromGeneral.setText("");
        
    }//GEN-LAST:event_jMenuNuevoActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        // TODO add your handling code here:
        if(jfch.showOpenDialog(jLabel1)!=0)
            return;
        
        FileInputStream fis = null;
        DataInputStream dis = null;
                 
        try {
            // TODO add your handling code here:
            
            //crear un objeto de FileReader:
            fis = new FileInputStream(jfch.getSelectedFile());
            dis = new DataInputStream(fis);
            
            
            int n = dis.readInt();
            
            jSpinAlumnos.setValue(n);
            
            for(int r =0; r<n; r++)
            {
                modelo.setValueAt(dis.readUTF(), r, 0);
                
                for(int c=1; c<modelo.getColumnCount()-1;c++)
                    modelo.setValueAt(dis.readInt(), r, c);
            }
            
            jButCalcular.doClick();
            
           
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Archivo no encontrado...."+ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas con el Archivo...."+ex.getMessage());
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al Leer...."+ex.getMessage());
        }
        finally
        {
            try {
                //cerrar los flujos:
                if(dis !=null)
                    dis.close();
                if(fis!=null) 
                    fis.close();
              
                
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarActionPerformed
        // TODO add your handling code here:
        
          if(jfch.showSaveDialog(jLabel1)!=0)
            return;
        
          FileOutputStream fos = null;
          DataOutputStream dos = null;
        try {
            // TODO add your handling code here:
            fos = new FileOutputStream(jfch.getSelectedFile());
            dos = new DataOutputStream(fos);
            
            
            dos.writeInt(modelo.getRowCount()); //se brabo el numero de alumnos
            //grabar los datos del alumno:
            for(int r=0; r<modelo.getRowCount();r++)
            {
                dos.writeUTF(modelo.getValueAt(r, 0)+""); //para cadenas
                
                for(int c=1; c<modelo.getColumnCount()-1;c++)
                    dos.writeInt((int)modelo.getValueAt(r, c)); //entero 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally 
        {  
              try { 
                  //cerrar los flujos. desde el utimo que se abrio hasta el primero:
                   if(dos!=null)
                      dos.close();
                  if(fos!=null)
                      fos.close();
                  
              } catch (IOException ex) {
                  Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        
    }//GEN-LAST:event_jMenuGuardarActionPerformed

    private void jMenuGuardarOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarOrdenadoActionPerformed
        // TODO add your handling code here:
        if(jfch.showSaveDialog(jLabel1)!=0)
            return;
        
       
          FileOutputStream fos = null;
          DataOutputStream dos = null;
        try {
            // TODO add your handling code here:
            fos = new FileOutputStream(jfch.getSelectedFile());
            dos = new DataOutputStream(fos);
            
            Alumno [] grupo = new Alumno[modelo.getRowCount()];
            
            for(int r=0; r<modelo.getRowCount(); r++)
            {
                int [] cal = new int[modelo.getColumnCount()-2];
                
                for(int c=0; c<cal.length;c++)
                    cal[c] = (int)modelo.getValueAt(r, c+1);
                
                grupo[r] = new Alumno(modelo.getValueAt(r,0)+"",cal);
            }
            
            Arrays.sort(grupo);
            
            
            dos.writeInt(grupo.length); //se brabo el numero de alumnos
            


            //grabar los datos del alumno:
            for(int r=0; r<grupo.length; r++)
            {
                dos.writeUTF(grupo[r].getNombre()); 
                
                int [] cal = grupo[r].getCalif();
                
                for(int c=0; c<cal.length;c++)
                    dos.writeInt(cal[c]); //entero 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally 
        {  
              try { 
                  //cerrar los flujos. desde el utimo que se abrio hasta el primero:
                   if(dos!=null)
                      dos.close();
                  if(fos!=null)
                      fos.close();
                  
              } catch (IOException ex) {
                  Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        
        
    }//GEN-LAST:event_jMenuGuardarOrdenadoActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JLabel jLabPromGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenuItem jMenuGuardarOrdenado;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinAlumnos;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextArchivo;
    // End of variables declaration//GEN-END:variables
}