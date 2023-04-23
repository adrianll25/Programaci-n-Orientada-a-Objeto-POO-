/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_04_11_interfazfiguras;

/**
 *
 * @author aa635
 */
public class PB_2019_04_11_InterfazFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo vicioso = new Circulo(15);
        Rectangulo pantalla = new Rectangulo(140,160);
        Triangulo amoroso = new Triangulo(12,18,9);
        
        mostrar(vicioso);
        mostrar (pantalla);
        mostrar (amoroso);
        
        // iFiguraPlana noSePuede = new iFiguraPlana();
        iFiguraPlana fuentes = new Triangulo(3,4,5);
        mostrar(fuentes);
    }
       
    
    public static void mostrar(iFiguraPlana fig)
       {
           System.out.println(fig + "    Area:"+fig.area()+"    Perimetro:"+fig.perimetro());
           
       }
    
    
}
