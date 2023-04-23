/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_03_aplicacionpila;

import java.util.Random;

/**
 *
 * @author aa629
 */
public class PB_2019_05_03_AplicacionPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila edades = new Pila(12);
        
        Random azar = new Random();
        
        System.out.println(edades);
        
        while(!edades.estaLlena())
        {
            edades.poner(azar.nextInt(100));
            System.out.println(edades);
        }
        
        
        System.out.println();
        double valor;
        while(!edades.estaVacia())
        {
            
            valor = edades.quitar();
            System.out.println(edades + " -->" + valor);
        }
    }
    
}
