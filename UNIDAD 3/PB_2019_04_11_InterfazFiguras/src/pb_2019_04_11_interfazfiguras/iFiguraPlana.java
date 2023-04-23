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
public interface iFiguraPlana{
    public static final double PII = 3.1415926;
    
    public abstract double area(); // Los metodos de una interfaz son automaticamente PUBLIC JAVA, aunque no se escriban.
    double perimetro();
    
}
