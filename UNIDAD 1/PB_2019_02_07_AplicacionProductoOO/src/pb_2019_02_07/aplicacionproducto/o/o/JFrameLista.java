package pb_2019_02_07.aplicacionproducto.o.o;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
public class JFrameLista extends javax.swing.JFrame {
    public JFrameLista() {
        initComponents();
        jTableLista.setShowGrid(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jButPorPrecio = new javax.swing.JButton();
        jButAlfabetico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Costo $", "% Margen", "% Directo", "% Impuesto", "IMPUESTO $", "MARGEN $", "DESCUENTO $", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLista);
        if (jTableLista.getColumnModel().getColumnCount() > 0) {
            jTableLista.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel1.setText("N° de productos:");

        jButAleatorios.setText("Aleatorios");
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

        jButPorPrecio.setText("POR PRECIO");
        jButPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPorPrecioActionPerformed(evt);
            }
        });

        jButAlfabetico.setText("POR NOMBRE");
        jButAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAlfabeticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jButCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButPorPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(jButAlfabetico)
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jButAleatorios)
                        .addComponent(jButPorPrecio)
                        .addComponent(jButAlfabetico))
                    .addComponent(jButCalcular))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int renglones = Integer.parseInt(jSpinner1.getValue() + "");
        DefaultTableModel modelo = (DefaultTableModel)jTableLista.getModel();
        modelo.setRowCount(renglones);
        
    }//GEN-LAST:event_jSpinner1StateChanged
    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        String [] prod = {"Laptop","Mouse óptico","Mouse inalámbrico","Tablet",
                          "Ipad","Iphone","Alfon","Proyector","Impresora láser",
                          "Impresora inyección","Impresora matriz"};
        double [] imp  = {0, 6, 10, 12, 16, 20, 24.5, 44};
        Random azar = new Random();
        for (int r = 0; r < jTableLista.getRowCount(); r++) {
            jTableLista.setValueAt(prod[azar.nextInt(prod.length)], r, 0);  // Descripción 
            jTableLista.setValueAt(100 + azar.nextInt(20000),       r, 1);  // Costo
            jTableLista.setValueAt(5   + azar.nextInt(26),          r, 2);  // % Margen
            jTableLista.setValueAt(10 + azar.nextInt(25),          r, 3);  // % Descuento
            jTableLista.setValueAt(imp[azar.nextInt(imp.length)],   r, 4);  // % Impuesto
        }
       
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        //crear un objeto:
        Producto x = new Producto();
        
        DecimalFormat d = new DecimalFormat("###,##0.00");
        
        for(int r=0; r<jTableLista.getRowCount(); r++)
        {
            x.setCosto(Double.parseDouble(jTableLista.getValueAt(r,1)+""));
            x.setMargenUtilidad(Double.parseDouble(jTableLista.getValueAt(r,2)+""));
            x.setPorcDescuento(Double.parseDouble(jTableLista.getValueAt(r,3)+""));
            x.setPorcImpuesto(Double.parseDouble(jTableLista.getValueAt(r,4)+""));
            
            jTableLista.setValueAt(d.format(x.importeMargenUtilidad()),r,5);
            jTableLista.setValueAt(d.format(x.importeDescuento()),r,6);
            jTableLista.setValueAt(d.format(x.importeImpuesto()),r,7);
            jTableLista.setValueAt(d.format(x.precio()),r,8);
            
        }
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPorPrecioActionPerformed
        // TODO add your handling code here:
        //crear un arreglo de REFERENCIAS con el mismo numero de elementos que los renglones jTable 
        //ESTAMOS CREANDO EL LUGAR  DONDE VAN A IR LOS OBJETOS
        Producto [] lista = new Producto[jTableLista.getRowCount()];
        
        DecimalFormat d = new DecimalFormat("###,##0.00");
        
        
        //CREAMOS LOS OBJETOS Y LES ASIGNAMOS LOS VALORES DEL jTable 
        for(int r=0; r<lista.length; r++)
        
           lista[r] = new Producto(
                                 jTableLista.getValueAt(r, 0)+"",//descripcion
                                   Double.parseDouble(jTableLista.getValueAt(r, 1)+""), //costo
                                   Double.parseDouble(jTableLista.getValueAt(r, 2)+""),//%margen
                                   Double.parseDouble(jTableLista.getValueAt(r, 3)+""),// % descto
                                   Double.parseDouble(jTableLista.getValueAt(r, 4)+"") // % impuesto
            );
        //ordenamos los datos:
        //Arrays.sort(lista); //no ordena arreglos de objetos (DE MOMENTO)
        for (int i = 0; i<lista.length-1; i++)
            for (int j = i+1; j<lista.length; j++)
                if (lista[i].precio() > lista[j].precio())
                {
                    Producto aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                    
                }
        
        
        //copiamos el arreglo al jTable 
        for (int r=0; r < lista.length; r++)
        {
            jTableLista.setValueAt(lista[r].getDescrpcion(), r, 0);
            jTableLista.setValueAt(lista[r].getCosto(), r, 1);
            jTableLista.setValueAt(lista[r].getMargenUtilidad(), r, 2);
            jTableLista.setValueAt(lista[r].getPorcDescuento(), r, 3);
            jTableLista.setValueAt(lista[r].getPorcImpuesto(), r, 4);
            
            jTableLista.setValueAt(d.format(lista[r].importeMargenUtilidad()), r, 5);
            jTableLista.setValueAt(d.format(lista[r].importeDescuento()), r, 6);
            jTableLista.setValueAt(d.format(lista[r].importeImpuesto()), r, 7);
            jTableLista.setValueAt(d.format(lista[r].precio()), r, 8);
            
            
            
        }
        
        
        
    }//GEN-LAST:event_jButPorPrecioActionPerformed

    private void jButAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAlfabeticoActionPerformed
        // BOTON PARA ORDENAR POR NOMBRE
        Producto [] lista = new Producto[jTableLista.getRowCount()];
        
        DecimalFormat d = new DecimalFormat("###,##0.00");
        
        
        //CREAMOS LOS OBJETOS Y LES ASIGNAMOS LOS VALORES DEL jTable 
        for(int r=0; r<lista.length; r++)
        
           lista[r] = new Producto(
                                 jTableLista.getValueAt(r, 0)+"",//descripcion
                                   Double.parseDouble(jTableLista.getValueAt(r, 1)+""), //costo
                                   Double.parseDouble(jTableLista.getValueAt(r, 2)+""),//%margen
                                   Double.parseDouble(jTableLista.getValueAt(r, 3)+""),// % descto
                                   Double.parseDouble(jTableLista.getValueAt(r, 4)+"") // % impuesto
            );
        //ordenamos los datos:
        //Arrays.sort(lista); //no ordena arreglos de objetos (DE MOMENTO)
        for (int i = 0; i<lista.length-1; i++)
            for (int j = i+1; j<lista.length; j++)
                if (lista[i].getDescrpcion().compareTo(lista[j].getDescrpcion()) > 0 )
                {
                    Producto aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                    
                }
        
       
        //copiamos el arreglo al jTable 
        for (int r=0; r < lista.length; r++)
        {
            jTableLista.setValueAt(lista[r].getDescrpcion(), r, 0);
            jTableLista.setValueAt(lista[r].getCosto(), r, 1);
            jTableLista.setValueAt(lista[r].getMargenUtilidad(), r, 2);
            jTableLista.setValueAt(lista[r].getPorcDescuento(), r, 3);
            jTableLista.setValueAt(lista[r].getPorcImpuesto(), r, 4);
            
            jTableLista.setValueAt(d.format(lista[r].importeMargenUtilidad()), r, 5);
            jTableLista.setValueAt(d.format(lista[r].importeDescuento()), r, 6);
            jTableLista.setValueAt(d.format(lista[r].importeImpuesto()), r, 7);
            jTableLista.setValueAt(d.format(lista[r].precio()), r, 8);
            
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButAlfabeticoActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButAlfabetico;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButPorPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
}