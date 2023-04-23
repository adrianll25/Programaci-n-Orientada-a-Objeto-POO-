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
class Microondas extends Electrodomestico implements Interfaz {
    
    private String Adicional;
    public Microondas()
      
    {
       
        super( "Microndas LG CHef", 2500,"negro Mate, Dorado, Plateado");
        Adicional = "Smart Watch de regalo.";
                
    }
    
    public String Mostrar()
    {
      return super.Mostrar()+"\nComplento Adicional: "+Adicional;
    }
    
    @Override
     public void Dibujar(int x, int y, Component c) {
        
Graphics papel = c.getGraphics();
        papel.setColor(c.getBackground());
        papel.fillRect(0,0,c.getWidth(),c.getHeight()); 
        
        papel.setColor(Color.BLACK);
        papel.fillRect(35-x, 50-y,  135, 105)  ;
        
        papel.setColor(Color.GRAY);
        papel.fillRect(40-x, 60-y,  99, 72)  ;
        
        papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 60-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 60-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 70-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 70-y, 8, 8);
        
       
        papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 80-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 80-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 90-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 90-y, 8, 8);
        
         papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 100-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 100-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(143-x, 110-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 110-y, 8, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(153-x, 130-y, 12, 8);
        
        papel.setColor(Color.BLUE);
        papel.fillRect(155-x, 130-y, 8, 8);


        papel.setColor(Color.BLUE);
        papel.setFont(new Font("Courier",Font.ITALIC,15));
        papel.drawString("Microondas Neon LG Chef", 15-x,y-205);
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