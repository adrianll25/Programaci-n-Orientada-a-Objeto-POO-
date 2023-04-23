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
public class Linea {
   protected double largo;
   
   public Linea()
   {
       largo = 0;
   }
   
   public Linea(double largo)
   {
       this.largo = largo;
   }
   
   @Override
   public String toString()
   {
       return "Largo: "+largo;
   }
}
