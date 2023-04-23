/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto3;

import java.awt.Component;

/**
 *
 * @author adria
 */
class MueblesCocina implements Interfaz {
    //private String Nombre;
    private String Descripcion;
    private int Precio;
    
    public MueblesCocina()
    {
        //Nombre = "No-Id";
        Descripcion = "No-Desc";
        Precio=0;
    }
    

    public MueblesCocina( String Descrip, int Prec) {
       // Nombre = Nom;
        Descripcion = Descrip;
        Precio = Prec;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descrip) {
        Descripcion = Descrip;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Prec) {
        Precio = Prec;
    }

    
    public String Mostrar() {
        return "\nDescripcion: "+Descripcion + "\nPrecio: $"+Precio;
    }

    @Override
    public void Dibujar(int x, int y, Component c) {
    }

    @Override
    public void Mover(Component c) {
    }
    
}
