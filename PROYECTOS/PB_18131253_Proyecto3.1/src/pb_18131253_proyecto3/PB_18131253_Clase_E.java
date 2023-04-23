/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author adria
 */
class Refrigerador extends LineaBlanca implements Interfaz{
    
    private String Accesorios;
    
        public Refrigerador()
    {
      super( "Refrigerador Familia, \nRefrigerador Avenger Mb29", 4100,"16.4 pies cubicos");
      Accesorios = "Accesorios: Filtro de agua.";
      
    }
    
    public String Mostrar()
    {
       return super.Mostrar()+"\nAccesorios: "+Accesorios; 
    }
   
        @Override
    public void Dibujar(int x, int y, Component c) {
     Graphics papel = c.getGraphics();
        papel.setColor(c.getBackground());
        papel.fillRect(0,0,c.getWidth(),c.getHeight()); 
        
        papel.setColor(Color.BLUE);
        papel.fillRect(30-x, 25-y,  143, 185);
        
         papel.setColor(Color.BLACK);
        papel.drawLine(29-x, 100-y, 173-x, 100-y);
        
        papel.setColor(Color.BLACK);
        papel.drawLine(29-x, 100-y, 174-x, 101-y);
        
        papel.setColor(Color.GRAY);
        papel.fillRect(145-x, 35-y, 10, 45);
        
        papel.setColor(Color.WHITE);
        papel.fillRect(85-x, 115-y, 40, 40);
        
        papel.setColor(Color.GRAY);
        papel.fillRect(102-x, 115-y, 8, 12);
        
        papel.setColor(Color.BLACK);
        papel.fillRect(102-x, 115-y, 8, 8);
    }

    @Override
    public void Mover(Component c) {
        int j=1;
        for (int i = 1; i <=200; i++) 
        {
           Dibujar(i,j,c);
           try {Thread.sleep(50);} catch (InterruptedException ex) {
           Logger.getLogger(jFrameVisualB.class.getName()).log(Level.SEVERE, null, ex);}
           j++;
        }  
    }
    
  
}