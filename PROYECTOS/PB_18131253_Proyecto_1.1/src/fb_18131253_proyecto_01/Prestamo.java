/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb_18131253_proyecto_01;

import java.text.DecimalFormat;

/**
 *
 * @author adria
 */

public class Prestamo {
    private String Nombre;
    private double CapitalInicial;
    private int Meses;
    private double TasaAnual;
    private double Intereses;
    private double CapitalFinal;
    
    //Contructores
    public Prestamo()
    {
    Nombre = "No-Id";
    CapitalInicial=0;
    Meses=0;
    TasaAnual=0;
    Intereses=0;
    CapitalFinal=0;
    }
    
    public Prestamo(String Nom, double CapitalIni, int Mes, double TasaAn, double interes, double CapitalFin)
    {
    Nombre = Nom;
    CapitalInicial = CapitalIni;
    Meses = Mes;  
    TasaAnual = TasaAn;
    Intereses = interes;
    CapitalFinal = CapitalFin;
    
    }
    
    public Prestamo(Prestamo e)//Copia
    {
     Nombre = e.Nombre;
     CapitalInicial = e.CapitalInicial;
     Meses = e.Meses;
     TasaAnual = e.TasaAnual;
     Intereses = e.Intereses;
     CapitalFinal = e.CapitalFinal;
    }
    //Set
    public void Nombre(String Nom)
    {
        Nombre = Nom;
    }
    public void CapitalInicial(double CapitalIni)
    {
        CapitalInicial = CapitalIni;
    }
    public void Meses(int Mes)
    {
        Meses = Mes;
    }
    public void TasaAnual(double TasaAn)
    {
        TasaAnual = TasaAn;
    }
    public void Intereses(double interes)
    {
        Intereses = interes;
    }
    public void CapitalFInal(double CapitalFin)
    {
        CapitalFinal = CapitalFin;
    }
    
    //Get
    public String getNombre()
    {
        return Nombre;
        
    }
    public int getMeses()
    {
        return Meses;
    }
    public double getCapitalInicial()
    {
        return CapitalInicial;
    }
    
    public double getTasaAnual()
    {
        return TasaAnual;
    }
    
    public double getCapitalFinal()
    {
        return CapitalFinal;
    }
   
     public String toString()
    {
        return Nombre+"  Capital Incial: "+CapitalInicial
                     +"  N° Meses: "+Meses
                     +"  Tasa Anual: "+TasaAnual;
                     
                     
    }
    
    
    //Calculos
 public double TasaAn()
    {
        return TasaAnual/100;
    }
    
   
    public double CapitalTotall()
    {
        return CapitalInicial*Math.pow((1+TasaAn()),Meses);
    }
    
    public double InteresesGeneradoss()
            {
                return CapitalTotall()-CapitalInicial;
            }
     
    
}
