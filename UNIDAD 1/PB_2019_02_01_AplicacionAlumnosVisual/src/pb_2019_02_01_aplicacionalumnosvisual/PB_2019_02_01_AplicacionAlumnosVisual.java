/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_01_aplicacionalumnosvisual;

/**
 *
 * @author aa630
 */
public class PB_2019_02_01_AplicacionAlumnosVisual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno uno = new Alumno();
        Alumno dos = new Alumno("Juan",90,85,70,75);
        Alumno tres = new Alumno(dos);
        
        
        //salida
        uno.setNombre("Raul");
        uno.setAsistencias(70);
        uno.setTareas(70);
        uno.setProyectos(70);
        uno.setExamen(60);
        
        tres.setNombre("Maria");
        System.out.println("Calificación de "+uno.getNombre()+" -> "+uno.calificacion());
        System.out.println("Calificación de "+dos.getNombre()+" -> "+dos.calificacion());
        System.out.println("Calificación de "+tres.getNombre()+" -> "+tres.calificacion());
        
        System.out.println();
        System.out.println(uno.toString());
        System.out.println(dos);
        System.out.println(tres);
    }
    
}
