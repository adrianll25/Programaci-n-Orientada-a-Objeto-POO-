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
class Estufa extends LineaBlanca implements Interfaz{
    
    private String Colores;
    
    public Estufa()
    {
      super( "Estufa Profesional, \nMabe 2k19", 7100,"7 sartenes, 2 ollas");
       Colores = "Negra, azul, Plateada.";
    }
    
    public String Mostrar()
    {
       return super.Mostrar()+"\nColores: "+Colores;
    }

    @Override
    public void Dibujar(int x, int y, Component c) {
        Graphics papel = c.getGraphics();
        papel.setColor(c.getBackground());
        papel.fillRect(0,0,c.getWidth(),c.getHeight()); 
        papel.setColor(Color.GRAY);
        
        papel.setColor(Color.GRAY);
        papel.fillRect(35-x, 50-y,  125, 115)  ;
        
        papel.setColor(Color.WHITE);
        papel.fillRect(55-x, 90-y,  85, 65)  ;
        
        papel.setColor(Color.BLACK);
        papel.drawLine(55-x, 100-y, 140-x, 100-y);
        
        papel.setColor(Color.BLACK);
        papel.fillOval(50-x, 55-y, 10, 10);
        
        papel.setColor(Color.BLACK);
        papel.fillOval(70-x, 55-y, 10, 10);
        
         papel.setColor(Color.BLACK);
        papel.fillOval(90-x, 55-y, 10, 10);
        
         papel.setColor(Color.BLACK);
        papel.fillOval(110-x, 55-y, 10, 10);
        
         papel.setColor(Color.BLACK);
        papel.fillOval(130-x, 55-y, 10, 10);
        
        papel.setColor(Color.BLUE);
        papel.setFont(new Font("Courier",Font.ITALIC,18));
        papel.drawString("Estufa Mabe Mx2019", 20-x,22-y);
        
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
