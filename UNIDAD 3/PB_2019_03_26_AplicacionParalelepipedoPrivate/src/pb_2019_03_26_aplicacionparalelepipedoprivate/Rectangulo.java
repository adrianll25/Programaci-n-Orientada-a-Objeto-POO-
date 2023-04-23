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
public class Rectangulo extends Linea{
    private double alto;
    
    public Rectangulo()
    {
        super(); //llamando al constructor de su superclase (Linea)
        alto  = 0;
    }
    
    
    public Rectangulo(double lar, double alt)
    {
        super(lar);
        alto = alt;
    }
    
    public void setAlto(double alt)
    {
        alto = alt;
    }
    
    public double getAlto()
    {
        return alto;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" Alto: "+alto;
    }
    
    public double perimetro()
    {
        return (getLargo()+alto)*2;
    }
    
    public double area()
    {
        return getLargo() * alto;
    }
    
    
}
