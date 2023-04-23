/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_08_archivotextovisual;

import java.util.Random;

/**
 *
 * @author aa621
 */
public class MiRandom extends Random{
    
    
    private static String [] nom = {"Juan","Jacquie","Valentin","Angelica","Ariadne","Sarahi","Fabiola","Maria","Fernanda"};
    private static String [] ape = {"Aguilera","Hernandez","Alcazar","Herrera","Lopez","Flores","Mata","De La Cruz","Delgado"};
    
    public MiRandom()
    {
        super();
    }
    
    public MiRandom(int x)
    {
        super(x);
    }
    
    public String nextNombre()
    {
        return nom[nextInt(nom.length)];
    }
    
    public String nextApellido()
    {
        return ape[nextInt(ape.length)];
        
    }
    
    public String nextNombreCompleto()
    {
        return nom[nextInt(nom.length)] + " " +
               ape[nextInt(ape.length)]+ " " +
               ape[nextInt(ape.length)];
    }
    public String nextNombreLegal()
    {
        return nom[nextInt(nom.length)] + " " +
               ape[nextInt(ape.length)]+ " " +
               nom[nextInt(nom.length)];
    }
    public String nextNombreCorto()
    {
         return nom[nextInt(nom.length)] + " "+
                ape[nextInt(ape.length)];
    }
    
    public int nextInt(int ini, int fin)
    {
        return ini + nextInt(fin - ini + 1);
    }
    
    public int nextInt(int ini, int fin, int intervalo)
    {
        return nextInt(ini/intervalo, fin/intervalo)*intervalo;
    }
    
    public double nextDouble (int ini, int fin, double intervalo)
    {
        return nextInt((int)(ini/intervalo), (int)(fin/intervalo))*intervalo;
    }
}

