/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_19_aplicacionnomina;

/**
 *
 * @author aa630
 */
public class Empleado {
    //ATRIBUTOS 
    private String nombre;
    private int diasTrabajados;
    private double sueldoDiario;
    private int horasExtras;
    private double porcentajeImpuesto;
    //CONSTRUCTORES
    //ESTE CONSTRUCTOR ES POR DEFAULT QUE IGUALO A CERO 
    public Empleado()
    {
        nombre="No-Id";
        diasTrabajados=0;
        sueldoDiario=0;
        horasExtras=0;
        porcentajeImpuesto=0;
    }
    //CONSTRUCTOR CON PARAMETROS 
    public Empleado(String nom, int diasTrab, double sueldoDias,int horExtras, double porcImp)
    {
        nombre = nom;
        diasTrabajados= diasTrab;
        sueldoDiario = sueldoDias;
        horasExtras = horExtras;
        porcentajeImpuesto = porcImp;
    }
    //METODO SET
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    public void setDiasTrabajados(int diasTrab)
    {
        diasTrabajados = diasTrab;
    }
    public void setSueldoDiario(double sueldoDias)
    {
        sueldoDiario = sueldoDias;
    }
    public void setHorasExtras(int horExtras)
    {
        horasExtras = horExtras;
    }
    public void setPorcentajeImpuesto(double porcImp)
    {
        porcentajeImpuesto = porcImp;
    }
    //METODO GET
    public String getNombre()
    {
        return nombre;
    }
    public int getDiasTrabajados()
    {
        return diasTrabajados;
    }
    public double getSueldoDiario()
    {
        return sueldoDiario;
    }
    public int getHorasExtras()
    {
        return horasExtras;
    }
    public double getPorcentajeImpuesto()
    {
        return porcentajeImpuesto;
    }
    //METODO TO STRING 
    @Override
    public String toString() //ES UN METODO QUE PONE LOS VALORES DE LOS ATRIBUTOS:
    {
        return nombre +
                "  Dias Trab: "+diasTrabajados +
                "  Suledo Dia: "+sueldoDiario +
                "  hora Extras: "+horasExtras +
                "  % Impuesto: "+porcentajeImpuesto;
    }
    //METODOS DE PROCESO 
    public double sueldoParcial()
    {
        return diasTrabajados * sueldoDiario;
    }
    public double importeHorasExtras()
    {
        return sueldoDiario /8 * horasExtras * 2;
    }
    public double sueldoBruto()
    {
        return sueldoParcial() + importeHorasExtras();
    }
    public double importeImpuesto()
    {
        return sueldoBruto() * porcentajeImpuesto /100;
    }
    public double sueldo()
    {
        return sueldoBruto() - importeImpuesto();
    }
    //METODO DE PROCESO CORTO 
//    public double sueldo()
//    {
//        double sueldoParcial = diasTrabajados * sueldoDiario;
//        double importeHorasExtras = sueldoDiario / 8 * horasExtras * 2;
//        double sueldoBruto = sueldoParcial + importeHorasExtras;
//        double importeImpuesto = sueldoBruto * porcentajeImpuesto / 100;
//        double sueldoNeto = sueldoBruto - importeImpuesto;
//        
//        return sueldoNeto;
//    }
}
