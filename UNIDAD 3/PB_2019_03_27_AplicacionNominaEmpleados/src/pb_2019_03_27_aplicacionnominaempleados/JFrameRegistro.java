/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author aa630
 */
public class JFrameRegistro extends javax.swing.JFrame {

    /**
     * Creates new form JFrameRegistro
     */
    //referencia:
    JFrameMenu jfMenu; //y puede ser usado en todo el frame 
    MiRandom azar = new MiRandom();
    public JFrameRegistro(JFrameMenu jfm) { //va a resivir una referencia de jframemenu
        initComponents();
        
        jfMenu = jfm; //referencia del menu que se mando a llamar 
        
        //visualizar lo de epleado:
        jRBEmpleado.setSelected(true);
        ocultar();
        
        jLabEmpReg.setText(jfMenu.getEmpleadosRegistrados()+""); //PARA QUE APAREZCA EL NUMERO DE EMPLEADOS REGISTRADOS 
    }
    
    public void ocultar()
    {
        jLabPiezas.setVisible(false);
        jLabPrecio.setVisible(false);
        jLabVentas.setVisible(false);
        jLabComision.setVisible(false);
        jLabDias.setVisible(false);
        jLabSueldo.setVisible(false);
        jLabBono.setVisible(false);
        
        jTextPiezas.setVisible(false);
        jTextPrecio.setVisible(false);
        jTextVentas.setVisible(false);
        jTextComision.setVisible(false);
        jTextDias.setVisible(false);
        jTextSueldo.setVisible(false);
        jTextBono.setVisible(false);
        
        jTextNumero.setText("");
        jTextNombre.setText("");
        jTextPiezas.setText("");
        jTextPrecio.setText("");
        jTextVentas.setText("");
        jTextComision.setText("");
        jTextDias.setText("");
        jTextSueldo.setText("");
        jTextBono.setText("");
        
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
        jLabel1 = new javax.swing.JLabel();
        jButRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabEmpReg = new javax.swing.JLabel();
        jRBEmpleado = new javax.swing.JRadioButton();
        jRBTaller = new javax.swing.JRadioButton();
        jRBVentas = new javax.swing.JRadioButton();
        jRBAdmin = new javax.swing.JRadioButton();
        jRBEjecutivo = new javax.swing.JRadioButton();
        jButAleatorios = new javax.swing.JButton();
        jButGrabar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabPiezas = new javax.swing.JLabel();
        jTextPiezas = new javax.swing.JTextField();
        jLabPrecio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabVentas = new javax.swing.JLabel();
        jTextVentas = new javax.swing.JTextField();
        jLabComision = new javax.swing.JLabel();
        jTextComision = new javax.swing.JTextField();
        jTextSueldo = new javax.swing.JTextField();
        jLabDias = new javax.swing.JLabel();
        jTextDias = new javax.swing.JTextField();
        jLabSueldo = new javax.swing.JLabel();
        jTextBono = new javax.swing.JTextField();
        jLabBono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("REGISTRO DE EMPLEADOS ");

        jButRegresar.setText("REGRESAR");
        jButRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("EMPLEADOS REGISTRADOS: ");

        jLabEmpReg.setBackground(new java.awt.Color(102, 204, 255));
        jLabEmpReg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabEmpReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabEmpReg.setOpaque(true);

        buttonGroup1.add(jRBEmpleado);
        jRBEmpleado.setText("Empleado");
        jRBEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEmpleadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBTaller);
        jRBTaller.setText("Taller");
        jRBTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTallerActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBVentas);
        jRBVentas.setText("Ventas");
        jRBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBVentasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBAdmin);
        jRBAdmin.setText("Administratrivo");
        jRBAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAdminActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBEjecutivo);
        jRBEjecutivo.setText("Ejecutivo");
        jRBEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEjecutivoActionPerformed(evt);
            }
        });

        jButAleatorios.setBackground(new java.awt.Color(102, 102, 255));
        jButAleatorios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButAleatorios.setForeground(new java.awt.Color(255, 255, 255));
        jButAleatorios.setText("Aleatorios");
        jButAleatorios.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButGrabar.setBackground(new java.awt.Color(153, 153, 255));
        jButGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButGrabar.setForeground(new java.awt.Color(255, 255, 255));
        jButGrabar.setText("Grabar");
        jButGrabar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButCancelar.setBackground(new java.awt.Color(153, 153, 255));
        jButCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButCancelar.setText("Cancelar");
        jButCancelar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("NÚMERO:");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        jLabel4.setText("NOMBRE:");

        jLabPiezas.setText("PIEZAS:");

        jLabPrecio.setText("PRECIO UNITARIO $");

        jLabVentas.setText("VENTAS$");

        jLabComision.setText("%COMISION");

        jLabDias.setText("DIAS TRABAJADOS:");

        jLabSueldo.setText("SUELDO DIARIO $");

        jTextBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBonoActionPerformed(evt);
            }
        });

        jLabBono.setText("BONO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBEmpleado)
                                .addGap(34, 34, 34)
                                .addComponent(jRBTaller)
                                .addGap(53, 53, 53)
                                .addComponent(jRBVentas)
                                .addGap(18, 18, 18)
                                .addComponent(jRBAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(jRBEjecutivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabComision, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextComision, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabPrecio)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabDias)
                                .addGap(5, 5, 5)
                                .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabBono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextBono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButAleatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabEmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBEmpleado)
                            .addComponent(jRBTaller)
                            .addComponent(jRBVentas)
                            .addComponent(jRBAdmin)
                            .addComponent(jRBEjecutivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextComision, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabComision, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabDias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabBono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextBono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabEmpReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegresarActionPerformed
        // TODO add your handling code here:
        dispose(); //quita el registro de la memoria 
        
        jfMenu.getEtiqueta().setBackground(Color.MAGENTA); //REFERENCIA DE LA ETIQUETA DE MENU 
        
        jfMenu.setVisible(true); //se pone visible despues que se registra
    }//GEN-LAST:event_jButRegresarActionPerformed

    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButCancelarActionPerformed

    private void jRBEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEmpleadoActionPerformed
        // TODO add your handling code here:
        ocultar();
    }//GEN-LAST:event_jRBEmpleadoActionPerformed

    private void jRBTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTallerActionPerformed
        // TODO add your handling code here:
        ocultar();
        
        jLabPiezas.setVisible(true);
        jLabPrecio.setVisible(true);
        
        jTextPiezas.setVisible(true);
        jTextPrecio.setVisible(true);
    }//GEN-LAST:event_jRBTallerActionPerformed

    private void jRBVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBVentasActionPerformed
        // TODO add your handling code here:
        ocultar();
        
        jLabVentas.setVisible(true);
        jLabComision.setVisible(true);
        
        jTextVentas.setVisible(true);
        jTextComision.setVisible(true);
    }//GEN-LAST:event_jRBVentasActionPerformed

    private void jRBAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAdminActionPerformed
        // TODO add your handling code here:
        ocultar();
        jLabDias.setVisible(true);
        jLabSueldo.setVisible(true);
        
        jTextDias.setVisible(true);
        jTextSueldo.setVisible(true);
    }//GEN-LAST:event_jRBAdminActionPerformed

    private void jRBEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEjecutivoActionPerformed
        // TODO add your handling code here:
        ocultar();
        
        jLabDias.setVisible(true);
        jLabSueldo.setVisible(true);
        jLabBono.setVisible(true);
        
        jTextDias.setVisible(true);
        jTextSueldo.setVisible(true);
        jTextBono.setVisible(true);
    }//GEN-LAST:event_jRBEjecutivoActionPerformed

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
       
        
        jTextNumero.setText(azar.nextInt(1,1000)+"");
        jTextNombre.setText(azar.nextNombreLegal());
        
        jTextPiezas.setText(azar.nextInt(100,1000)+"");
        jTextPrecio.setText(azar.nextDouble(3,10,.25)+"");
        
        jTextVentas.setText(azar.nextInt(5000,70000,1000)+"");
        jTextComision.setText(azar.nextDouble(2,8,.2)+"");
        
        jTextDias.setText(azar.nextInt(6,30)+"");
        jTextSueldo.setText(azar.nextInt(102,600)+"");
        jTextBono.setText(azar.nextInt(2000,20000,500)+"");
        
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        // TODO add your handling code here:
        //estos atributos lo tiene en todo
        int numero = Integer.parseInt(jTextNumero.getText());
        String nombre = jTextNombre.getText();
        
        if(jRBEmpleado.isSelected())
        {
            Empleado emp= new Empleado(numero, nombre); //todos van a tneer la referencia d emepleado. por que engloba todo
            
            jfMenu.agregarEmpleado(emp); //referencia del arrglo de empleado con el jFrameMenu
        }
        if(jRBTaller.isSelected())
        {
            Taller tal = new Taller(numero, nombre,
                                    Integer.parseInt(jTextPiezas.getText()),
                                    Double.parseDouble(jTextPrecio.getText()));
            
            jfMenu.agregarEmpleado(tal);
        }
        if(jRBVentas.isSelected())
        {
            Ventas ven = new Ventas(numero,nombre,
                                    Double.parseDouble(jTextVentas.getText()),
                                    Double.parseDouble(jTextComision.getText()));
            
            jfMenu.agregarEmpleado(ven);
        }
        if(jRBAdmin.isSelected())
        {
            Administrativo adm = new Administrativo(numero,nombre,
                                                    Integer.parseInt(jTextDias.getText()),
                                                     Double.parseDouble(jTextSueldo.getText()));
            jfMenu.agregarEmpleado(adm);
        }
        if(jRBEjecutivo.isSelected())
        {
            Ejecutivo eje = new Ejecutivo(numero,nombre,
                                          Integer.parseInt(jTextDias.getText()),
                                          Double.parseDouble(jTextSueldo.getText()),
                                          Double.parseDouble(jTextBono.getText()));
            jfMenu.agregarEmpleado(eje);
        }
        
        jLabEmpReg.setText(jfMenu.getEmpleadosRegistrados()+""); //PARA QUE SE ACTUALICE EL REGISTRO
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        for (int i = 0; i < 50; i++) {
            
            
        
            switch(azar.nextInt(5)) //0 al 4
             {
                case 0: jRBEmpleado.setSelected(true); break;
                case 1: jRBTaller.setSelected(true); break;
                case 2: jRBVentas.setSelected(true); break;
                case 3: jRBAdmin.setSelected(true); break;
                case 4: jRBEjecutivo.setSelected(true); break;
                
            }
        
        jButAleatorios.doClick();
        jButGrabar.doClick();
        }
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jTextBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBonoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRegistro(new JFrameMenu()).setVisible(true); //ese parametro no se usara
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButRegresar;
    private javax.swing.JLabel jLabBono;
    private javax.swing.JLabel jLabComision;
    private javax.swing.JLabel jLabDias;
    private javax.swing.JLabel jLabEmpReg;
    private javax.swing.JLabel jLabPiezas;
    private javax.swing.JLabel jLabPrecio;
    private javax.swing.JLabel jLabSueldo;
    private javax.swing.JLabel jLabVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBAdmin;
    private javax.swing.JRadioButton jRBEjecutivo;
    private javax.swing.JRadioButton jRBEmpleado;
    private javax.swing.JRadioButton jRBTaller;
    private javax.swing.JRadioButton jRBVentas;
    private javax.swing.JTextField jTextBono;
    private javax.swing.JTextField jTextComision;
    private javax.swing.JTextField jTextDias;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPiezas;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextSueldo;
    private javax.swing.JTextField jTextVentas;
    // End of variables declaration//GEN-END:variables
}
