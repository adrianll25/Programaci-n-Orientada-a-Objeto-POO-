/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_15_aplicacionhorario;

/**
 *
 * @author aa630
 */
public class Horario {
    //ATRIBUTOS:
    private int horas;
    private int minutos;
    private int segundos;
    //CONSTRUCTORES
    public Horario()
    {
        horas =0;
        minutos=0;
        segundos=0;
    }
    public Horario(int h, int m, int s)
    {
        horas = h;
        minutos= m;
        segundos= s;
    }
    public Horario(Horario h) //copia
    {
        horas = h.horas;
        minutos = h.minutos;
        segundos = h.segundos;
    }
    //METODOS GET/SET
    public int getHoras()
    {
        return horas;
    }
    public int getMinutos()
    {
        return minutos;
    }
    public int getSegundos()
    {
        return segundos;
    }
    public void setHoras(int h)
    {
        horas = h;
    }
    public void setMinutos(int m)
    {
        minutos = m;
    }
    public void setSegundos(int s)
    {
        segundos = s;
    }
    //metodo to string:
    public String toString()
    {
        return horas + " h: "+ minutos +" m: "+segundos +"s";
    }
    //METODOS DE CALCULO
    public int segundosTotales()
    {
        return horas * 3600 + minutos * 60 + segundos;
    }
    public Horario suma(Horario h)
    {
        int segTot = segundosTotales() + h.segundosTotales();
        
        //horas:
        int hor = segTot / 3600; //div
        int restoSeg = segTot % 3600; //mod
        int min = restoSeg / 60; //div
        int seg = restoSeg % 60; //mod
        
        return new Horario(hor,min,seg);
    }
    public Horario resta(Horario h)
    {
        int segTot = segundosTotales() - h.segundosTotales();
        
        //horas:
        int hor = segTot / 3600; //div
        int restoSeg = segTot % 3600; //mod
        int min = restoSeg / 60; //div
        int seg = restoSeg % 60; //mod
        
        return new Horario(hor,min,seg);
    }
}
