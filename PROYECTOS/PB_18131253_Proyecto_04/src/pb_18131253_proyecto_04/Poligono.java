/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto_04;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author adria
 */
public class Poligono {
    private int Posicion;
    private int LadoX;
    private int LadoY;
    private int LadoX2;
    private int LadoY2;
    private Color color;
    
    
    public Poligono()
    {
        Posicion = 0;
        LadoX = 0;
        LadoY = 0;
        LadoX2 =0;
        LadoY2 = 0;
        color = Color.WHITE;
    }
    
    public Poligono(int Posicion, int LadoX, int LadoY, Color color, int LadoX2, int LadoY2)
    {
        this.Posicion = Posicion;
        this.LadoX = LadoX;
        this.LadoY = LadoY;
        this.LadoX2 = LadoX2;
        this.LadoY2 = LadoY2;
        this.color = color;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    public int getLadoX() {
        return LadoX;
    }

    public void setLadoX(int LadoX) {
        this.LadoX = LadoX;
    }

    public int getLadoY() {
        return LadoY;
    }

    public void setLadoY(int LadoY) {
        this.LadoY = LadoY;
    }
    
      public int getLadoX2() {
        return LadoX2;
    }

    public void setLadoX2(int LadoX2) {
        this.LadoX2 = LadoX2;
    }
    
      public int getLadoY2() {
        return LadoY2;
    }

    public void setLadoY2(int LadoY2) {
        this.LadoY2 = LadoY2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void dibujo(Component c)
    {
        Graphics g=c.getGraphics();
        
       g.setColor(Color.WHITE);
       g.fillRect(0,0,c.getWidth(),c.getHeight());
       
       g.setColor(color);
       g.fillRect(LadoX, LadoY2, LadoX2, LadoY);
      
     }
    
        
}
