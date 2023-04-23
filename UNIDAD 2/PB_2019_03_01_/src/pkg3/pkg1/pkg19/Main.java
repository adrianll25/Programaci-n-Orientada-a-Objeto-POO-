/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg1.pkg19;

/**
 *
 * @author aa615
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector v1 = new Vector(70,15);
        Vector v2 = new Vector();
        v2.setMagnitude(120);
        v2.setAngulo(65);
        
        Vector r = v1.suma(v2);
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("---------------");
        System.out.println(r);
        
        Vector opuesto = new Vector(r.getMagnitude(),r.getAngulo()+180);
        
        Vector nul = r.suma(opuesto);
        System.out.println("\n"+opuesto);
        System.out.println("\n"+nul);
        
        Vector v3 = new Vector (20,65);
        Vector v4 = v2.resta(v3);
       
        System.out.println("");
        System.out.println("v2 - v3 = "+v4);
       
        Vector v5 = new Vector();
        v5.setXY(7, -4);
        
        System.out.println(v5);
    }
    
}