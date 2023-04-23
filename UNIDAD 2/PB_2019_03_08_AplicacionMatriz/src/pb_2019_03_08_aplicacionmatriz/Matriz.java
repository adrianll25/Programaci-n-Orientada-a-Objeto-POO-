/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_08_aplicacionmatriz;

/**
 *
 * @author aa629
 */
public class Matriz {
    private double [][] datos;
    
    public Matriz()
    {
        datos = new double [1][1];
    }
    
    public Matriz(int ren, int col)
    {
        if (ren > 0 && col >0)
            datos = new double [ren][col];
        else
            datos = new double [1][1];
    }
    
    public Matriz(double [][] d)
    {
        datos = new double [d.length][d[0].length];
    
        for(int r=0; r<d.length; r++)
            for (int c = 0; c<d[0].length; c++)
                datos[r][c] = d[r][c];
    }

    public int getRenglones()
    {
        return datos.length;
    }
    
    public int getColumnas()
    {
        return datos[0].length;
    }
    
    public void setValor(double valor, int ren, int col)
    {
        if (ren >= 0 && ren<getRenglones() && col>=0 && col<getColumnas())
            datos[ren][col] = valor;
    
    }
    
    public double getValor(int ren, int col)
    {
        if (ren >= 0 && ren<getRenglones() && col>=0 && col<getColumnas())
            return datos[ren][col];
        else
            return 0;
    
    }
    
    public void mostrar()
    {
        for (int r=0; r<getRenglones(); r++)
        {
            for (int c=0; c<getColumnas(); c++)
                System.out.print(datos[r][c]+"\t");
            
            System.out.println();
        }
        System.out.println();
                
    }

    
}