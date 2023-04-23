/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_04_30_listaalumnos;

/**
 *
 * @author aa629
 */
public class Alumno implements Comparable{
    private String nombre;
    private int edad;
    private double calificacion;

    public Alumno() {
        nombre = "No-id";
        edad = 0;
        calificacion = 0;
    }

    public Alumno(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString()
    {
        return nombre+"  "+edad+" años  calif = "+calificacion;
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno)o;
        
//        if (edad == a.edad)
//            return 0;
//        
//        if (edad > a.edad)
//            return 1;
//        else
//            return -1;
        return edad - a.edad;

    }
    
    
    
    
}
