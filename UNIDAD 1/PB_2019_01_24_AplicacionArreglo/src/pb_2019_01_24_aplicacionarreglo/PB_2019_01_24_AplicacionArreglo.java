/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_01_24_aplicacionarreglo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class PB_2019_01_24_AplicacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DESARROLLAR UN DIAGRAMA DE FLUJO QUE PERMITA CALCULAR LA SUMA, PROMEDIO, NUMERO MAYOR Y MENOR Y ORDENAR LOS DATOS.
        //LA CANTIDAD DE DATOS DEBE SER TECLEADA POR EL USUARIO Y LOS DATOS DEBEN DE SER GENERADOS AL AZAR.TODO ELLO CON UN ARREGLO UNIDIMENCIONAL. 
        
        //DECLARACION DE VARIABLES:
        Scanner leer = new Scanner (System.in);
        //DATOS DE ENTRADA
        System.out.print("NÚMERO DE DATOS: ");
        int n=leer.nextInt();
       
        int []datos= new int [n];
        Random azar= new Random();
        //PROCESO
        System.out.println("\nDATOS GENERADOS AL AZAR\n");
        for(int i=0; i<datos.length;i++)
        {
            datos[i]=azar.nextInt(1000); //del 0 al 999
            System.out.println(i+" -> "+datos[i]+"");
        }
        //suma de datos:
        int suma=0;
        double promedio;
        for(int i=0; i<datos.length;i++)
        {
            suma+=datos[i];
        }
        promedio= suma/(datos.length*1.0);
        //DATOS DE SALIDA 
        System.out.println("");
        System.out.println("SUMA= "+suma);
        System.out.println("PROMEDIO= "+promedio);
        //OBTENER EL NUMERO MAYOR Y MENOR:
        int mayor=datos[0];
        int menor=datos[0];
        for(int i=1; i<datos.length;i++)
        {
            if(datos[i]>mayor)
                mayor=datos[i];
            if(datos[i]<menor)
                menor=datos[i];
        }
        System.out.println("");
        System.out.println("MAYOR= "+mayor);
        System.out.println("MENOR= "+menor);
        //ORDENAR LOS NUMERO DE MENOR A MAYOR:
        System.out.println("\nDATOS ORDENADOS\n");
        Arrays.sort(datos);
        for(int i=0; i<datos.length;i++)
        {
            System.out.println(i+" -> "+datos[i]+"");
        }
        
    }
    
}
