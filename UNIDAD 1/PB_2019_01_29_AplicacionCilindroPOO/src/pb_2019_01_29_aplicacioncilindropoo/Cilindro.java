/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_01_29_aplicacioncilindropoo;

/**
 *
 * @author adria
 */
class Cilindro {
    //ATRIBUTOS
    private double radio;
    private double altura; 
    
    // METODOS GET/SET
    public Cilindro ()
    {
        radio = 0;
        altura = 0;
    }
          
        
    public Cilindro (double r, double a)
    {
        radio = r;
        altura = a;
        
    }
    
    public Cilindro (Cilindro c)
    {
        radio = c.getradio();
        altura = c.getaltura();
    }
            
    public double getradio()
    {
      return radio;  
    }

    public double getaltura()
    {
       
        return altura;
    }
    
    
    public void setradio(double r)
    {
        radio = Math.abs(r);
        radio = r;
    }
    
    public void setaltura(double a)
    {
        altura = Math.abs(a);
        altura = a;
    }
    
    
    @Override
    public String toString ()
    {
        return "RADIO: "+radio+" ALTURA: "+altura;
        
    }
    
    // METODOS DE PROCESO
    double area()
    {
        return 2 * Math.PI * radio * (radio+altura);
        
    }
    
    double volumen()
    {
        return Math.PI * Math.pow(radio,2) * altura;
        
    }
}
