/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_27_aplicacionpunto;

/**
 *
 * @author aa609
 */
public class PB_2019_02_27_AplicacionPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto A = new Punto(5,3);
        
        Punto B = new Punto();
        B.setX(-2);
        B.setY(-4);
        
        double d = A.distancia(B);
        System.out.println("La distancia entre "+A+"y "+B+"es: "+d);
        
        Punto M = A.medio(B);
        
        System.out.println("Punto medio es: "+M);
    }
    
}
