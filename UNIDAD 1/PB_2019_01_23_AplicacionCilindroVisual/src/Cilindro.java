/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Cilindro {
    //ATRIBUTOS
    private double radio;
    private double altura; 
    
    // METODOS
    double area()
    {
        return 2 * Math.PI * radio * (radio+altura);
        
    }
    
    double volumen()
    {
        return Math.PI * Math.pow(radio,2) * altura;
        
    }
    
    
}
