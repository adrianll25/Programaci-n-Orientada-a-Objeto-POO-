/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_10_archivobinariovisual;

/**
 *
 * @author aa629
 */
public class Alumno implements Comparable{
    private String nombre;
    private int [] calif;

    public Alumno(String nombre, int[] calif) {
        this.nombre = nombre;
        this.calif = calif;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCalif() {
        return calif;
    }

    public void setCalif(int[] calif) {
        this.calif = calif;
    }

    
    public double promedio()
    {
        double suma = 0;
        for(int i=0; i<calif.length; i++)
            suma += calif[i];
        
        return suma / calif.length;
    }
    
    
    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno)o;
        
        if(promedio() == a.promedio())
            return 0;
        
        if(promedio() > a.promedio())
            return 1;
        else
            return -1;
    }
    
    
    
}
