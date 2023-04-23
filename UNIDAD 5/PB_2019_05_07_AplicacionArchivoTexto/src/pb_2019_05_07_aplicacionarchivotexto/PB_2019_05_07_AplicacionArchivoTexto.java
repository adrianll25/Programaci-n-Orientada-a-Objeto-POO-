/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_07_aplicacionarchivotexto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa629
 */
public class PB_2019_05_07_AplicacionArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Nombre del Archivo de Texto: ");
        String archivo = teclado.next();
        
        
        teclado  = new Scanner(System.in);
        
        System.out.println("Nombre del Alumno: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Cuantas calificaciones?: ");
        int n = teclado.nextInt();
        
        int [] calif = new int[n];
            for(int i=0; i<n; i++)
            {
                System.out.println("Calificacion "+(i+1)+": ");
                calif[i] = teclado.nextInt();
            }
        
        try { 
            //crear y abrir archivo
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(nombre);
            pw.println(n);
            
            for(int i=0; i<calif.length; i++)
                pw.println(calif[i]);
            
            // cerrar el archivo
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PB_2019_05_07_AplicacionArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
