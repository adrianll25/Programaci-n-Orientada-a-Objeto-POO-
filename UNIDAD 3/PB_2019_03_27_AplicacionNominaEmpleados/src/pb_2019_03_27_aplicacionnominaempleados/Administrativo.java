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
public class Administrativo extends Empleado{
    //atributos:
    private int diasTrab;
    private double sueldoDia;
    //constructores:
    public Administrativo()
    {
        super();
        diasTrab =0;
        sueldoDia =0;
    }
    public Administrativo(int num, String nom, int diasT, double sueldoD)
    {
        super(num,nom);
        diasTrab = diasT;
        sueldoDia = sueldoD;
    }
    //metodos get set propios de la clase:
    public int getDiasTrabajados()
    {
        return diasTrab;
    }
    public void setDiasTrabajados(int diasT)
    {
        diasTrab = diasT;
    }
    
    public double getSueldoDiario()
    {
        return sueldoDia;
    }
    public void setSueldoDiario( double sueldoD)
    {
        sueldoDia = sueldoD;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" Dias Trab: "+diasTrab + " Sueldo Dia: "+sueldoDia;
    }
    
    //proceso de calculo:
    public double sueldo()
    {
        return diasTrab * sueldoDia;
    }
}
