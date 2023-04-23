/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_08_aplicacionmatriz;

import java.util.Random;

/**
 *
 * @author aa629
 */
public class PB_2019_03_08_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz tres = new Matriz(3,4);
        
        double [][] x = {
                            {3,7,1,2,0},
                            {4,8,9,1,4}
                        };
        
        Random azar = new Random();
        
        for(int r=0; r<tres.getRenglones(); r++)
            for (int c=0; c<tres.getColumnas(); c++)
                tres.setValor(azar.nextInt(100), r, c);
       
        
        
        Matriz cuatro = new Matriz(x);
        
        tres.mostrar();
        cuatro.mostrar();
        
        cuatro.setValor(100, 0, 0);
        cuatro.setValor(500, cuatro.getRenglones()-1, cuatro.getColumnas()-1);
        cuatro.mostrar();
    }
    
}
