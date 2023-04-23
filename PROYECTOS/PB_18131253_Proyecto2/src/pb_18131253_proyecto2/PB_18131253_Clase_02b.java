/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto2;

import java.util.Random;

/**
 *
 * @author alope
 */
//En esta clase generamos los nombres de los dispositivos que utilizaremos en el boton de aleatorios.
class NomDispositivo {
    private static Random azar = new Random();
    private static String [] nom = {"AL-","TP-","LT-","AL2-","MG-","NK-",
                             "OP-","JG-","DA-","XX-","Qk-",
                             "FG-","JK-","JF-","UL-","AM-"};
    private static String [] ape = {"128","69","74","2","012","733",
                             "364","520","000","739","544",
                             "140","666","85","10","1.36","1.1.1"};
    
    public static String nextNombre()
    {
        return nom[azar.nextInt(nom.length)];
    }
    
    public static String nextNombreCorto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }

   
    public static String nextNombreLegal()
    {
        return ape[azar.nextInt(ape.length)] + " " +
               ape[azar.nextInt(ape.length)] + " " +
               nom[azar.nextInt(nom.length)];
    }
}
