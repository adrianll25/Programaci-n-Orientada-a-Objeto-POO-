/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_26_aplicacionparalelepipedoprivate;

/**
 *
 * @author adria
 */
public class Paralelepipedo extends Rectangulo{
    private double profundidad;
    
    public Paralelepipedo()
    {
       super();
        profundidad = 0;
    }

    public Paralelepipedo(double lar, double alt, double pro)
    {
       super(lar, alt);
        profundidad = pro;
    }
    
    @Override
    public String toString()
    {
     return super.toString()+" Profundidad: "+profundidad;   
    }

    public double area()
    {
        return (super.area() +  getLargo()*profundidad  +  getAlto()*profundidad)*2;
    }
    
    public double Volumen()
    {
        return super.area()*profundidad;
    }
    
    
}
