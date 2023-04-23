/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_05_listaproductos;

import java.util.Arrays;

/**
 *
 * @author aa629
 */
public class PB_2019_05_ListaProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto [] inventario = {
                                  new Producto("Cuaderno",20,18),
                                  new Producto("Lapiz",257,8),
                                  new Producto("Pluma",184,12),
                                  new Producto("Mem USB",14,150),
                                  new Producto("Mouse",9,12),
                                  new Producto("Borrador",69,10)
                                };
        
        mostrar(inventario,"Lista sin ordenar");
        
        Producto.setTipoOrdenamiento(0);
        Arrays.sort(inventario);
        mostrar(inventario,"Lista ordenada por existencia");
        
        
        Producto.setTipoOrdenamiento(1);
        Arrays.sort(inventario);
        mostrar(inventario,"Lista ordenada por precio");
        
        
        Producto.setTipoOrdenamiento(2);
        Arrays.sort(inventario);
        mostrar(inventario,"Lista ordenada por descripcion");
        
    }
    
    public static void mostrar(Producto []inv, String encabezado)
    {
        System.out.println(encabezado+"\n");
        
        for(Producto p:inv)
            System.out.println(p);
        
        System.out.println();
    }
    
}
