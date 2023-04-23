/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb_18131253_proyecto_01;

import java.util.Random;

/**
 *
 * @author alope
 */
public class Nombre {
    private static Random azar = new Random();
    private static String [] nom = {"Jose","Juan","Maria","Luis","Laura","Mauricio",
                             "Pedro","Jorge","Diana","Raul","Patricia",
                             "Fernanda","Araceli","Javier","Ulises","Yolanda"};
    private static String [] ape = {"Lopez","Ruiz","Gomez","Ramirez","Jimenez","Hernandez",
                             "Garcia","Fernandez","Melendez","Rangel","Salazar",
                             "Arias","Zarate","Gonzalez","Guzman","Tapia","Vargas"};
    
    public static String nextNombre()
    {
        return nom[azar.nextInt(nom.length)];
    }
    
    public static String nextApellido()
    {
        return ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreCorto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }

    public static String nextNombreCompleto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }

    public static String nextNombreLegal()
    {
        return ape[azar.nextInt(ape.length)] + " " +
               ape[azar.nextInt(ape.length)] + " " +
               nom[azar.nextInt(nom.length)];
    }
}
