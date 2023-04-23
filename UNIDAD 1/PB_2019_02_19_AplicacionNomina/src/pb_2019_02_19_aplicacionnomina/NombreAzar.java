/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_19_aplicacionnomina;

import java.util.Random;

/**
 *
 * @author aa630
 */
public class NombreAzar {
    
    //atributos:
    private static String [] nom = {"Ana","Maria","Pedro","Chino","Jaqui","Martha","Mag","Jesus","Dante","Fernanda"};
    private static String [] ape = {"Lopez","Gomez","Montes","Mendez","Garcia","Hernandez","Gonzalez","Favela","Muñoz","Perez"};
    private  static Random azar = new Random();
    //metodos staticos 
    public static String nextNombre()
    {
        return nom[azar.nextInt(nom.length)];
    }
    public static String nextNombreCompleto()
    {
        return nom[azar.nextInt(nom.length)]+" "+
               ape[azar.nextInt(nom.length)]+" "+
               ape[azar.nextInt(nom.length)];
    }
    public static String nextNombreLegal()
    {
        return
               ape[azar.nextInt(nom.length)]+" "+
               nom[azar.nextInt(nom.length)]+" "+
               ape[azar.nextInt(nom.length)];
    }
    public static String nextNombreCorto()
    {
        return nom[azar.nextInt(nom.length)]+" "+
               ape[azar.nextInt(nom.length)];
    }
}
