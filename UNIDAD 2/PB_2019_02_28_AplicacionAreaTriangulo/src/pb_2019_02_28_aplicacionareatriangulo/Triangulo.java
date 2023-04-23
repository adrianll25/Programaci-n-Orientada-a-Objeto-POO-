/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_28_aplicacionareatriangulo;

/**
 *
 * @author aa609
 */
public class Triangulo {
    // ATRIBUTOS
    private Punto  puntoA;
    private Punto puntoB;
    private Punto puntoC;
    
    
    // CONSTRUCTORES
    public Triangulo()
    {
        puntoA = new Punto();
        puntoB = new Punto();
        puntoC = new Punto();
    }
    
    public Triangulo(Punto a, Punto b, Punto c)
    {
        puntoA = a;
        puntoB = b;
        puntoC = c;
    }
    
    
    // METODO SET
    public void setPuntoA(Punto a)
    {
        puntoA = a;
    }
    
    public void setPuntoB(Punto b)
    {
        puntoB = b;
    }
    
    public void setPuntoC (Punto c)
    {
        puntoC = c;
    }
    
    // METODO GET
    public Punto getPuntoA()
    {
        return puntoA;
    }
    
    public Punto getPuntoB()
    {
        return puntoB;
    }
    
    public Punto getPuntoC()
    {
        return puntoC;
    }
    
    @Override
    public String toString ()
    {
        return "A"+puntoA+" B"+puntoB+" C"+puntoC;
    }
    
    
    public double lado1()
    {
        return puntoA.distancia(puntoB);
    }
    
    public double lado2()
    {
        return puntoB.distancia(puntoC);
    }
    
    public double lado3()
    {
        return puntoC.distancia(puntoA);
    }
    

    // METODO DE CALCULO
    public double perimetro()
    {
        return lado1() + lado2() + lado3();
    }
 
    public double area()
    {
        double s = perimetro()/2;
        
        return Math.sqrt(s*(s-lado1())*(s-lado2())*(s-lado3()));
        
    }
}