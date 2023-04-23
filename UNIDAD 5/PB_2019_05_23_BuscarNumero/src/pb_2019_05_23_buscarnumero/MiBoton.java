/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_23_buscarnumero;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author aa629
 */
public class MiBoton extends JButton{
    private int numero;
    private static int color = 0;
    
    public MiBoton(int n)
    {
        numero = n;
        
        
        setSize(80,80);
        setFont(new Font("Arial",Font.BOLD, 36));
        this.setBackground(Color.red);
        
       
        
        
        
        switch(color)
        {
            case 0: setBackground(Color.red); break;
            case 1: setBackground(Color.blue); break;
            case 2: setBackground(Color.yellow); break;
            case 3: setBackground(Color.green); break;
            case 4: setBackground(Color.pink); break;
            default: setBackground(Color.orange); break;
        
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrar()
    {
        setText(numero+"");
    }

    public static int getColor() {
        return color;
    }

    public static void setColor(int aColor) {
        color = aColor;
    }
    
    
    
}
