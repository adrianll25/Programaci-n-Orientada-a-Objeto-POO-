/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb_18131253_proyecto_01;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author adria
 */

public class PrestamoCliente {
    
    private Prestamo[] institucion;
    
    public PrestamoCliente()
    {
       institucion = new Prestamo[8050];
        
        for(int i=0; i<institucion.length; i++)
        institucion[i] = new Prestamo();
          
    }
            
    public PrestamoCliente(int n)
    {
        institucion = new Prestamo[n];
        
        for(int i=0; i<institucion.length; i++)
            institucion[i] = new Prestamo();
        
    }
    
    
    public int getTamaño()
    {
    return institucion.length;
    }
  public void setPrestamo(Prestamo e, int idx)
    {
        institucion[idx]=e;
    }
    
    public Prestamo getPrestamo(int idx)
    {
        return institucion[idx];
    }
   
    
     public void ordenarNumerico()
     {
           for(int i=0; i<institucion.length-1; i++)
            for(int j=i+1; j<institucion.length; j++)
                if(institucion[i].CapitalTotall() < institucion[j].CapitalTotall())
                {
                    Prestamo aux = institucion[i];
                    institucion[i] = institucion[j];
                     institucion [j] = aux;
                }

     }
     
      public void ordenarAlfabetico()
     {
              for(int i=0; i<institucion.length-1; i++)
            for(int j=i+1; j<institucion.length; j++)
                if(institucion[i].getNombre().compareTo(institucion[j].getNombre()) > 0 )
                {
                    Prestamo aux = institucion[i];
                    institucion[i] = institucion[j];
                    institucion[j] = aux;
                }
     }
       public Prestamo mayorPrestamo()
    {
        Prestamo mayor = institucion[0];
        
        
        for(int i=0; i<institucion.length; i++)
            if (institucion[i].CapitalTotall() > mayor.CapitalTotall())
                mayor = institucion[i];

        return mayor;
    }
     public Prestamo menorPrestamo()
    {
        
        Prestamo menor = institucion[0];
        
        for(int i=0; i<institucion.length; i++)
            if (institucion[i].CapitalTotall() < menor.CapitalTotall())
                menor = institucion[i];

        return menor;
    }
    
     public void mostrar(JTable Tabla, JLabel etiqueta)
    {
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
     
       double CapitalTotal = 0;

       for(int r=0; r<institucion.length; r++)
        {
            Tabla.setValueAt(institucion[r].getNombre(), r, 0);
            Tabla.setValueAt(institucion[r].getCapitalInicial(), r, 1);
            Tabla.setValueAt(institucion[r].getMeses(), r, 2);
            Tabla.setValueAt(institucion[r].getTasaAnual(), r, 3);
            Tabla.setValueAt(df.format(institucion[r].InteresesGeneradoss()), r, 4);
            Tabla.setValueAt(df.format(institucion[r].CapitalTotall()), r, 5);
        
            CapitalTotal += institucion[r].CapitalTotall();
        }    
            etiqueta.setText(df.format(CapitalTotal));

    }
     
     public void calcular(JTable Tabla, JLabel Etiqueta)
     {
         double TasaAnual = 0;
         double Total = 0;
         double capInicial = 0;
         double intereses = 0;
         
         DecimalFormat df = new DecimalFormat("#,###,##0.00");
         
         for(int r=0; r<institucion.length; r++)
         {
             TasaAnual += institucion[r].InteresesGeneradoss();
             Total += institucion[r].CapitalTotall();
             
             
             
         }
         
     }
}
    

    
