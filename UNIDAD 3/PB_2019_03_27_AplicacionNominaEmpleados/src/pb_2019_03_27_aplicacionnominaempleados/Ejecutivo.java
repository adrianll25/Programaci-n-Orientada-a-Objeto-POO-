/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author aa630
 */
public class Ejecutivo extends Administrativo{
    //atributos:
    private double bono;
    //constructor:
    public Ejecutivo()
    {
        super();
        bono =0;
    }
    public Ejecutivo(int num, String nom, int diasT,double sueldoD, double bono)
    {
        super(num,nom,diasT,sueldoD);
        this.bono = bono;
    }
    //metodo get set:
    public double getBono()
    {
        return bono;
    }
    public void setBono(double bono)
    {
        this.bono = bono;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Bono: "+bono;
    }
    
    //metodo de proceso:
    public double sueldo()
    {
        return super.sueldo() + bono;
    }
}
