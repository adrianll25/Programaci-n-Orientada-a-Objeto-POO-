/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_01_25_aplicacionmatriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class PB_2019_01_25_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        Scanner leer= new Scanner (System.in);
        //DATOS DE ENTRADA 
        System.out.print("RENGLONES: ");
        int ren=leer.nextInt();
        System.out.print("COLUMNAS: ");
        int col=leer.nextInt();
        int [][]datos=new int [ren][col];
        Random azar = new Random();
        //PROCESO
        //GENERAR DATOS AL AZAR DESDE 10 HASTA 99:
        int r,c;
        for(r=0;r<datos.length;r++)
        {
          for(c=0;c<datos[0].length;c++)  
          {
              datos[r][c]=10+azar.nextInt(90);
          }
        }
        //MOSTRAR LOS DATOS GENERADOS AL AZAR:
        System.out.println("\nDATOS GENERADOS AL AZAR\n");
        for(r=0;r<datos.length;r++)
        {
          for(c=0;c<datos[0].length;c++)  
          {
              System.out.print(datos[r][c]+" ");
          }
        System.out.println();
        }
        //ARREGLO UNIDIMENSIONAL LLAMADA COPIA(SERVIRA PARA ORDENADAR LOS DATOS DE UNA MATRIZ):
        int []copia=new int[datos.length*datos[0].length];
        int i=0;
        for(r=0;r<datos.length;r++)
        {
            for(c=0;c<datos[0].length;c++)
            {
                copia[i]=datos[r][c];
                i++; //SE INCREMENTA PORQUE LA I ESTA IGUALADA A CERO.
            }
        }
        Arrays.sort(copia);
        //REGRESAR ESOS DATOS ORDENADOS A LA MATRIZ DATOS: 
        i=0;
        for(r=0;r<datos.length;r++)
        {
            for(c=0;c<datos[0].length;c++)
            {
                datos[r][c]=copia[i]; //A LA MATRIZ DATOS LO IGUALO A LOS DATOS ORDENADOS DEL ARREGLO COPIA. 
                i++; //SE INCREMENTA PORQUE LA I ESTA IGUALADA A CERO.
            }
        }
        //MOSTRAR LOS DATOS ORNDENADOS:
        System.out.println("\nDATOS ORDENADOS\n");
        for(r=0;r<datos.length;r++)
        {
          for(c=0;c<datos[0].length;c++)  
          {
              System.out.print(datos[r][c]+" ");
          }
        System.out.println();
        }
        
    }
    
}
