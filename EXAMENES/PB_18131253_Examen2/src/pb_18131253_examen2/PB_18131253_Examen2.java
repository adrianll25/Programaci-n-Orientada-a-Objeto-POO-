/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_examen2;

/**
 *
 * @author adria
 */
public class PB_18131253_Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Petroleo uno = new Petroleo(17, 3);
        Petroleo dos = new Petroleo(30, 2);
        Petroleo suma;
        suma = uno.Suma(dos);
        
        System.out.println("Suma: " + suma);
    }
    
}
