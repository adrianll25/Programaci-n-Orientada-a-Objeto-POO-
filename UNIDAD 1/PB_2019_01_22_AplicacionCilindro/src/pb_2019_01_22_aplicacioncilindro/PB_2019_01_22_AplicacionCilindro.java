/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_01_22_aplicacioncilindro;

import java.util.Scanner;

/**
 *
 * @author zaida sugey
 */
public class PB_2019_01_22_AplicacionCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES 
        Scanner leer = new Scanner (System.in);
        double radio, altura, area, volumen;
        //DATOS DE ENTRADA 
        System.out.print("RADIO: ");
        radio=leer.nextDouble();
        System.out.print("ALTURA: ");
        altura=leer.nextDouble();
        //PROCESO
        volumen = Math.PI * Math.pow(radio,2) * altura;
        area = 2 * Math.PI * radio * (radio + altura);
        //DATOS DE SALIDA 
        System.out.println("AREA: "+area);
        System.out.println("VOLUMEN: "+volumen);
    }
    
}
