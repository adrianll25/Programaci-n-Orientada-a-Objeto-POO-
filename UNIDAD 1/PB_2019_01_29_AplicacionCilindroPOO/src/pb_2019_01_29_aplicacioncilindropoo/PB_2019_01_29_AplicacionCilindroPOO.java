/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_01_29_aplicacioncilindropoo;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class PB_2019_01_29_AplicacionCilindroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREANDO OBJTO (LATA)(CILINDRO)
        
        
        Cilindro lata = new Cilindro();
        
        Scanner leer = new Scanner (System.in);
        
        double rLata;
        double aLata;
        
        
        System.out.println("RADIO: ");
        rLata = leer.nextDouble();
        
        System.out.println("ALTURA: ");
        aLata = leer.nextDouble();

        lata.setradio(rLata);
        lata.setaltura(aLata);
       
        
        System.out.println("AREA LATA: "+lata.area());
        System.out.println("VOLUMEN LATA: "+lata.volumen());
        
       
        // CREANDO OBJETO (BOTE)(CILINDRO)
        Cilindro bote = new Cilindro();
        
        bote.setradio(5);
        bote.setaltura(12);
       
        
        System.out.println("");
        System.out.println("AREA BOTE: "+bote.area());
        System.out.println("VOLUMEN BOTE: "+bote.volumen());
        System.out.println("");
        System.out.println("Lata --> "+lata.toString());
        System.out.println("Bote --> "+bote);
       
        Cilindro otro = new Cilindro (15,40);
        System.out.println("Otro --> "+otro);
        
        Cilindro tanque = new Cilindro (bote.getradio(), bote.getaltura());
        
        Cilindro x = new Cilindro (bote);
        System.out.println("x --> "+x);
        
    }
    
}
