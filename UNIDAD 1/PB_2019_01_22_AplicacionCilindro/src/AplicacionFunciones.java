
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class AplicacionFunciones {
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES 
        Scanner leer = new Scanner (System.in);
        double radio, altura, area, volumen;
        //DATOS DE ENTRADA 
        System.out.print("RADIO lata: ");
        radio=leer.nextDouble();
        System.out.print("ALTURA lata: ");
        altura=leer.nextDouble();
        //PROCESO
        volumen = volumenCilindro(radio, altura);
        area = areaCilindro(radio,altura);
        //DATOS DE SALIDA 
        System.out.println("AREA: "+area);
        System.out.println("VOLUMEN: "+volumen);
        
        System.out.println("");
        System.out.print("RADIO bote pintura: ");
        double radioBote=leer.nextDouble();
        System.out.print("ALTURA bote pintura: ");
        double alturaBote=leer.nextDouble();
        
        //DATOS DE SALIDA 
        System.out.println("AREA BOTE PINTURA: "+areaCilindro(radioBote,alturaBote));
        System.out.println("VOLUMEN BOTE PINTURA: "+volumenCilindro(radioBote,alturaBote));
        
        System.out.println("");
        System.out.println("VOLUMEN TANQUE="+volumenCilindro(25,120));
    }
    public static double volumenCilindro(double r, double h)
    {
        double v;
        v=Math.PI * Math.pow(r,2) * h;
        return v;
    }
    public static double areaCilindro (double r, double h)
    {
       return 2 * Math.PI * r * (r + h);    
    }
}
