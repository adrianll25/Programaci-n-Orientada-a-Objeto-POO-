/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_14_aplicacionarreglo;

import java.util.Arrays;

/**
 *
 * @author aa629
 */
public class Arreglo {
    private double [] datos;
    
    //CONSTRUCTORR
    public Arreglo()
    {
        datos = new double [10]; // Va de entrada este
    }
    
    
    public Arreglo(int n) // DEFINIR EL TAMAÑO DEL ARREGLO (EL USUARIO)
    {
        datos = new double[n];
        
    }
    
    
    public Arreglo (double []d) //SE COPIA EL ARREGLO 
    {
        datos = new double [d.length];
        for (int i = 0; i < d.length; i++)
            datos[i] = d[i]; // SE ASIGNA LOS DATOS DEL PRIMER ARREGLO
                            
    }
    
    // METODOS GET/SET
    public double getValor(int posicion)
    {
        if (posicion >= 0 && posicion < datos.length)
           return datos[posicion];
        else
            return 0;
    
    }
    
    
    public void setValor(double valor, int posicion)
    {
        if (posicion >= 0 && posicion < datos.length)
            datos[posicion] = valor;
       
    }
    
    
    // METODO TOSTRING
    @Override
    public String toString() // para mostrar los datos
    {
        String cad = "{";
            for (int i = 0; i < datos.length; i++)  
            {
                cad = cad + datos[i];
            
                if (i<datos.length-1)
                    cad = cad + ", ";
            }                
            cad = cad + "}";
            
                return cad;
    }
    
    
    // METODO OPERACIONES
    public double suma ()
    {
        double total = 0;
        
        for (int i = 0; i < datos.length; i++ )
            total += datos[i];
        
        return total;
    }
    
    
    public double promedio()
    {
        // se manda llamar al metodo suma
        return suma() / datos.length;
    }
    
    
    public double mayor()
    {
        // se agarra el primer valor 
        double may = datos[0];
        
        for (int i = 1; i<datos.length; i++)
            if (datos [i] > may)
                may = datos[i];
    
        return may;
    }
    
    
    public double menor ()
    {
        // se agarra el primer valor 
        double men = datos[0];
        
        for (int i = 1; i < datos.length; i++)
            if (datos [i] < men)
                men = datos[i];
    
        return men;
    }
    
    
    public double rango ()
    {
        
        return mayor() - menor();
    }

    
    public double mediana()
    {
        double [] copia = datosOrdenados();  // manda a llamar al metodo
        
        Arrays.sort(copia);
        
        double med;
        
        if (copia.length % 2 == 0) // es numero par de elementos
        {
            med = (copia [copia.length / 2 - 1] +  copia[copia.length/2]/2);
        }
        else // es impar 
        {
            med = copia[(copia.length - 1)/2];
        }
        
        return med;
    }
        
    
    public void ordenar()
    {
        Arrays.sort(datos);
        
    }

    
    public double [] datosOrdenados()  // para regresar un arreglo 
    {
        double [] copia = new double [datos.length]; 
        
        for (int i = 0 ; i < copia.length; i++)
            copia[i] = datos[i];
            
            
        Arrays.sort(copia);
        
        return copia;
        
    }

}
