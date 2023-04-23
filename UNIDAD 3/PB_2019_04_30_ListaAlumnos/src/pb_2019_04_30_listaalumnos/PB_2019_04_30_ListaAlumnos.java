/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_04_30_listaalumnos;

import java.util.Arrays;

/**
 *
 * @author aa629
 */
public class PB_2019_04_30_ListaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno [] grupo = {
                            new Alumno("Juan",20,74.5),
                            new Alumno("Maria",18,83.3),
                            new Alumno("Hector",21,98.1),
                            new Alumno("Jose",20,62.9),
                            new Alumno("Pedro",24,92.8),
                            new Alumno("Diana",19,81.6),
                            new Alumno("Adriana",22,90.0)};
        
        Arrays.sort(grupo);
        
        for(Alumno a:grupo)
            System.out.println(a);
        
    }
    
}
