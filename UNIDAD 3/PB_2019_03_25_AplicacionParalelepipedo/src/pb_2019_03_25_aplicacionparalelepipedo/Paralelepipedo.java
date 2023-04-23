/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_25_aplicacionparalelepipedo;

/**
 *
 * @author adria
 */
public class Paralelepipedo extends Rectangulo{
    private double profundidad;
    
    public Paralelepipedo()
    {
        largo = 0;
        alto = 0;
        profundidad = 0;
    }

    public Paralelepipedo(double lar, double alt, double pro)
    {
        largo = lar;
        alto = alt;
        profundidad = pro;
    }
    
    @Override
    public String toString()
    {
     return "Largo: "+largo+" Alto: "+alto+" Profundidad: "+profundidad;   
    }

    public double area()
    {
        return (largo*alto  +  largo*profundidad  +  alto*profundidad)*2;
    }
    
    public double Volumen()
    {
        return largo*alto*profundidad;
    }
    
    
}
