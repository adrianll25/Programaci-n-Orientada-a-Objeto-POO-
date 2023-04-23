/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_11_aplicacionmatriz;

import java.util.Random;

/**
 *
 * @author ai19
 */
public class PB_2019_03_11_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion del objeto "tres" con el segundo constructor:
        Matriz tres = new Matriz(3,4); //segundo constructor 
        //generar los datos de un arreglo llamado x:
        double [][] x = {
                          {3,7,1,2,0},
                          {4,8,9,1,4}
                        };
        
        Random azar = new Random();
        //generar los datos de la matriz al azar:
        for(int r=0; r<tres.getRenglones();r++)
            for (int c = 0; c < tres.getColumnas(); c++) 
                 tres.setValor(azar.nextInt(100), r, c);
                
         //crear el objeto cuatro haciendo llegar los datos del arreglo x:  
        Matriz cuatro = new Matriz (x); //3er constructor (copia)
        
        tres.mostrar();
        cuatro.mostrar();
        
        cuatro.setValor(100,0,0);
        cuatro.setValor(500,cuatro.getRenglones()-1, cuatro.getColumnas()-1); //es menos 1 para ponerle el valor a la ultima columna y renglon
        
        cuatro.mostrar();

        // creacion del objeto uno con el segundo constructor:
        Matriz uno = new Matriz(2,4);
        //llenado de los datos de la matriz:
        uno.setValor(4, 0, 0);
        uno.setValor(2, 0, 1);
        uno.setValor(3, 0, 2);
        uno.setValor(5, 0, 3);
        
        uno.setValor(1, 1, 0);
        uno.setValor(8, 1, 1);
        uno.setValor(3, 1, 2);
        uno.setValor(2, 1, 3);
        
        //creacion del arreglo d con datos definidos:
        double [][] d={{1,4,2,6},{7,5,8,3}};
        //creacion del objeto dos con el 3er constructor:
        Matriz dos = new Matriz(d); 
        
        tres = uno.suma(dos); // con el objeto tres, se hara la suma con uno y dos
        //mandar a pantalla las matrices:
        uno.mostrar();
        dos.mostrar();
        tres.mostrar();
        //creacion del objeto cinco:
        Matriz cinco = uno.suma(cuatro);
        cinco.mostrar();
        cinco = uno.multiplicacion(10); //utilizando el metodo de multiplicacion por un escalar
        cinco.mostrar();
        //creacion del objeto seis:
        Matriz seis = uno.resta(dos);
        seis.mostrar();
        
        
    }
    
}
