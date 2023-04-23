/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_19_aplicacionnomina;

/**
 *
 * @author aa630
 */
public class PB_2019_02_19_AplicacionNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //es un metodo sin crear objetos: el static 
        //CREAR UN OBJETO 
        Empleado juan = new Empleado("Juan Perez",14,250,5,8);
        
        System.out.println(juan);
        System.out.println("Sueldo de: "+juan.getNombre()+" $"+juan.sueldo());
        
        Empleado maria = new Empleado(); //objeto
        maria.setNombre("Maria lopez");
        maria.setDiasTrabajados(30);
        maria.setSueldoDiario(700);
        maria.setHorasExtras(1);
        maria.setPorcentajeImpuesto(20);
        
        System.out.println("\n"+maria);
        System.out.println("Sueldo de: "+maria.getNombre()+" $"+maria.sueldo());
        
        
    }
    
}
