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
class Licuadora extends Electrodomestico implements Interfaz{
   private String Tamaño;
    
    public Licuadora ()
    {
        super( "Licuadora Ninja MX19", 1540,"Negro Mate, Plateado");
        Tamaño = "30.15 cm.";
        
    }
    
     public String Mostrar(){
        return super.Mostrar()+"\nTamaño: "+Tamaño;
    }
    
        @Override
    public void Dibujar(int x, int y, Component c) {
        Graphics papel = c.getGraphics();
        papel.setColor(c.getBackground());
        papel.fillRect(0,0,c.getWidth(),c.getHeight()); 
        
        papel.setColor(Color.RED);
        papel.fillRect(50-x, 130-y,  90, 40)  ;
        
        papel.setColor(Color.RED);
        papel.fillRect(60-x, 115-y,  70, 20)  ;
        
        papel.setColor(Color.BLACK);
        papel.drawLine(60-x, 117-y, 40-x, 50-y);

        papel.setColor(Color.BLACK);
        papel.drawLine(61-x, 118-y, 41-x, 51-y);
                    
        papel.setColor(Color.BLACK);
        papel.drawLine(129-x, 117-y, 149-x, 50-y);

        papel.setColor(Color.BLACK);
        papel.drawLine(130-x, 118-y, 150-x, 51-y);
        
        papel.setColor(Color.red);
        papel.fillOval(40-x, 35-y, 110, 40);
        
        papel.setColor(Color.WHITE);
        papel.fillOval(91-x, 30-y, 10, 10);
        
        papel.setColor(Color.BLACK);
        papel.fillOval(85-x, 145-y, 20, 20);
        
        papel.setColor(Color.BLUE);
        papel.setFont(new Font("Courier",Font.ITALIC,15));
        papel.drawString("Licuadora Ninja", 15-x,205-5);
        

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

