/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author aa630
 */
public class PB_2019_03_27_AplicacionNominaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creacion de 3 objetos:
        Empleado pedro = new Empleado(1,"Pedro Arias");
        Administrativo laura = new Administrativo();
        laura.setNumero(2);
        laura.setNombre("Laura Gómez");
        laura.setDiasTrabajados(15);
        laura.setSueldoDiario(400);
        
        Ejecutivo luis = new Ejecutivo(3,"Luis Perez",30,600,5000);
        
        Taller javier = new Taller(4,"Javier López",500,4);
        
        Ventas maria = new Ventas();
        maria.setNumero(5);
        maria.setNombre("Maria Garcia");
        maria.setVentasTotales(40000);
        maria.setComision(6);
        
        System.out.println(pedro);
        System.out.println(laura);
        System.out.println(luis);
        System.out.println(javier);
        System.out.println(maria);
        
        System.out.println();
        System.out.println("El sueldo de "+laura.getNombre() +" es $"+laura.sueldo());
        System.out.println("El sueldo de "+luis.getNombre() +" es $"+luis.sueldo());
        System.out.println("El sueldo de "+javier.getNombre() +" es $"+javier.sueldo());
        System.out.println("El sueldo de "+maria.getNombre() +" es $"+maria.sueldo());
        
        Empleado [] lista = new Empleado[6]; //arreglo de referencia
        
        //asignarle  a los objetos ya creados:
        lista[0] = pedro;
        lista[1] = laura;
        lista[2] = luis;
        lista[3] = javier;
        lista[4] = maria;
        lista[5] = new Ventas(6,"Raul Hernandez",100000,5);
        
        //ordenamiento en forma descendente 
        for (int i = 0; i < lista.length-1; i++) 
            for (int j = 0; j < lista.length; j++) 
                if(lista[i].sueldo() > lista[j].sueldo())
                {
                    Empleado aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
        
        System.out.println();
        for (Empleado e: lista) 
            System.out.println(e.getNumero()+" "+e.getNombre()+" $"+e.sueldo());
            
        
        
        
        
        
    }
    
}
