/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_04_10_numerocompuesto;

/**
 *
 * @author adria
 */
public class PB_2019_04_10_NumeroCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //NumeroCompuesto nc = new NumeroCompuesto(4,2);
        //No puede crearse un objeto de una clase abstracta
        Punto p = new Punto(-5,8);
        Fraccion f = new Fraccion(3,7);
        Complejo c = new Complejo(-9,6);
        NumeroCompuesto c2 = new Complejo(2,7);
        NumeroCompuesto f2 = new Fraccion(1,5);
        
        //System.out.println(nc.desplegar());
        System.out.println(p.desplegar());
        System.out.println(f.desplegar());
        System.out.println(c.desplegar());
        System.out.println(f2.desplegar());
        System.out.println(c2.desplegar());
        
        System.out.println();
        System.out.println(p.mostrar());
        System.out.println(f.mostrar());
        System.out.println(c.mostrar());
        System.out.println(f2.mostrar());
        System.out.println(c2.mostrar());
        
        NumeroCompuesto [] num = new NumeroCompuesto[5];
        
        num[0] = p;
        num[1] = f;
        num[2] = c;
        num[3] = f2;
        num[4] = c2;
        
        System.out.println();
        
        for(NumeroCompuesto n:num)
            System.out.println(n.desplegar()+"   "+n.mostrar());
    }
    
}
