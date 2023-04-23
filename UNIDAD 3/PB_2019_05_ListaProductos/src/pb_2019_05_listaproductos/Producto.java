/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_listaproductos;

/**
 *
 * @author aa629
 */
class Producto implements Comparable{
    private String descripcion;
    private int existencia;
    private double precio;
    private static int tipoOrdenamiento; //0=existencia  1=precio  2=descripcion

    public Producto() {
        descripcion = "No-id";
        existencia = 0;
        precio = 0;
    }

    public Producto(String descripcion, int existencia, double precio) {
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    public static int getTipoOrdenamiento() {
        return tipoOrdenamiento;
    }

    public static void setTipoOrdenamiento(int aTipoOrdenamiento) {
        tipoOrdenamiento = aTipoOrdenamiento;
    }
    
    
    
    @Override
    public String toString()
    {
        return descripcion+"  exist = "+existencia+"  $"+precio;
    }

    @Override
    public int compareTo(Object o) {
        Producto p = (Producto)o;
        
        int valor = 0;
        
        switch (tipoOrdenamiento)
        {
            case 0:
                valor = existencia - p.existencia;
                break;
                
                
            case 1:
                if(precio == p.precio)
                    valor = 0;
                else
                    if (precio > p.precio)
                        valor = 1;
                else
                        valor = -1;
                break;
                
                
            case 2:
                valor = descripcion.compareTo(p.descripcion);
                break;
        }
        
        return valor;
    }
    
}
