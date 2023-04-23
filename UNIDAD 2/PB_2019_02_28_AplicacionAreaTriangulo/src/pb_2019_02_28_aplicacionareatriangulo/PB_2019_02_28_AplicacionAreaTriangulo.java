/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_28_aplicacionareatriangulo;

/**
 *
 * @author aa609
 */
public class PB_2019_02_28_AplicacionAreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto M = new Punto(1,4);
        Punto P = new Punto (4,-2);
        Punto R = new Punto (-3,-2);
        
        
        Triangulo uno = new Triangulo (M,P,R);
        
        System.out.println(uno);
        System.out.println("Area: "+uno.area());
        
        Punto F = new Punto (1,-2);
        
        Triangulo T1 = new Triangulo(M,P,F);
        
        Triangulo T2 = new Triangulo();
        
        T2.setPuntoA(M);
        T2.setPuntoB(F);
        T2.setPuntoC(R);
       
        System.out.println("Area T1: "+T1.area());
        System.out.println("Area T2: "+T2.area());
        System.out.println("Area uno: "+(T1.area()+T2.area()));
        
    }
            
        
    }
    

