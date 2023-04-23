/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_10_archivobinariovisual;

import java.util.Random;

/**
 *
 * @author aa630
 */
public class MiRandom extends Random{ //funcionalidad de la clase random
    
    //atributos:
    private static String [] nom = {"Juan","Maria","Pedro","Carla","Flor","Martha","Zaida","Jesus","Cesar","Fernanda","Armando","Camila","Alejandro","Raul","Fernando","Roberto","Eduardo",
                                     "Moises","Cristian","Cristina","Paulina","Dayana","Daniela","Julieta","Alberto","Rodrigo","Elena","Yolanda"};
    private static String [] ape = {"Lopez","Gomez","Montes","Mendez","Garcia","Hernandez","Gonzalez","Favela","Muñoz","Perez"};
   //CONSTRUCTORES:
    public MiRandom()
    {
        super();
    }
    
    public MiRandom(int x)
    {
        super(x);
    }
    //metodos staticos 
    public  String nextNombre()
    {
        return nom[nextInt(nom.length)]; //el nextInt porque lo hereda 
    }
    public String nextApellido()
    {
        return ape[nextInt(ape.length)];
    }
    public  String nextNombreCompleto()
    {
        return nom[nextInt(nom.length)]+" "+
               ape[nextInt(ape.length)]+" "+
               ape[nextInt(ape.length)];
    }
    public  String nextNombreLegal()
    {
        return
               ape[nextInt(ape.length)]+" "+
               ape[nextInt(ape.length)]+" "+
               nom[nextInt(nom.length)];
    }
    public  String nextNombreCorto()
    {
        return nom[nextInt(nom.length)]+" "+
               ape[nextInt(nom.length)];
    }
    
    
    public int nextInt(int ini,int fin) //valor inicial, valor final 
    {
       return ini + nextInt(fin - ini + 1); //para el rango de valores
    }
    
    public int nextInt(int ini, int fin, int intervalo)
    {
        return nextInt(ini /intervalo, fin/intervalo)*intervalo; //ppor multiplos 
    }
    
    public double nextDouble(int ini, int fin , double intervalo)
    {
        return nextInt((int)(ini /intervalo) , (int)(fin/intervalo))*intervalo;
    }
    
}
