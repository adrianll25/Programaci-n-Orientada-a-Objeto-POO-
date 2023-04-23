/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_25_aplicacionparalelepipedo;

/**
 *
 * @author adria
 */
public class PB_2019_03_25_AplicacionParalelepipedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Linea regla = new Linea(30);
        Rectangulo ventana = new Rectangulo(200,80);
        Paralelepipedo escritorio = new Paralelepipedo(130,75,60);
        
        
        System.out.println(regla);
        System.out.println(ventana);
        System.out.println(escritorio);
        
        // se pueden crear objetos de una referencia de su superclase, directa o indirecta
        Linea puerta = new Rectangulo(90,210);
        
        Rectangulo caja = new Paralelepipedo(20,30,50);
        
        Linea lampara = new Paralelepipedo(60,130,15);
        
        
        // a la inversa no se puede 
        // Rectangulo x = new Linea();
        
        Linea [] varios = new Linea [6];
        
        varios [0] = regla;
        varios [1] = ventana;
        varios [2] = escritorio;
        varios [3] = puerta; 
        varios [4] = caja;
        varios [5] = lampara;
    
        
        System.out.println();
        for(int i=0; i<varios.length; i++)
            System.out.println(varios[i]);
        
        System.out.println();
        for (Linea x : varios)
            System.out.println(x);
    }
    
}
