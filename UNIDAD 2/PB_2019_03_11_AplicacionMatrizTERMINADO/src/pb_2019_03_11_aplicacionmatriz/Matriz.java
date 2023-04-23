/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_11_aplicacionmatriz;

/**
 *
 * @author ai19
 */
public class Matriz {
    //ATRIBUTOS:
    private double [][]datos; //declaracio del arreglo con tipo de dato double
    //CONSTRUCTORES:
    public Matriz()//por default
    {
        datos = new double[1][1];//darle el valor minimo de la matriz
    }
    public Matriz(int ren, int col)
    {
        if(ren >0 && col>0) //condicion para que sea diferente al priemr constructor
            datos = new double [ren][col];
        else 
            datos = new double [1][1]; //primer constructor
    }
    public Matriz (double [][] d) //copia del arreglo datos al d //creando el arreglo del mismo tamaño 
    {
        datos = new double [d.length][d[0].length]; 
        
        for(int r=0; r<d.length; r++)
            for(int c =0; c<d[0].length; c++)
                datos[r][c]= d[r][c]; //se creo el arreglo y se paso la informacion al arreglo datos 
    }
    //METODOS GET:
    public int getRenglones()
    {
        return datos.length; //metodo para obtener la cantidad de renglones 
    }
    public int getColumnas()
    {
        return datos[0].length; //metodopara obtener la cantidad de columnas
    }
    //ES REFERENTE AL METODO setValueAt: (valor,ren,col)
    public void setValor(double valor, int ren, int col)
    {
        if(ren >=0 && ren< getRenglones() && col>=0 && col<getColumnas())
            datos[ren][col] = valor;//podemos poner un valor dentro del arreglo datos
    }
    //ES REFERENTE AL METODO getValueAt:(ren, col)
    public double getValor(int ren,int col)
    {
        if(ren>=0 && ren<getRenglones() && col>=0 && col<getColumnas())
            return datos[ren][col]; //obtener el valor de renglones y columnas
        else 
            return 0;
    }
    //METODO DE MOSTRAR
    public void mostrar()
    {
         for(int r=0; r<getRenglones();r++)
        {
            for(int c=0; c<getColumnas(); c++)
                System.out.print(datos[r][c]+"\t");
            
            System.out.println();
        }
        
        System.out.println();
        
    }
    //METODO DE CALCULO:
    public Matriz suma(Matriz m)
    {
        //ESTE METODO INVOLUCRA TRES OBJETOS DE LA CLASE MATRIZ:
        //1.-EL QUE MANDA LLAMAR EL METODO (this)
        //2.-EL QUE LLEGA COMO PARAMETRO(m)
        //3.-EL RESULTADO DE SUMAR this Y m (resultante)
        
        if(getRenglones() != m.getRenglones() || getColumnas() != m.getColumnas())
            return new Matriz(); //va a regresar un matriz de 1 x 1 con el primer constructor, porque las dimensiones son diferentes
        //si se puede sumar:
            Matriz resultante = new Matriz(getRenglones(),getColumnas());
        for(int r =0; r<getRenglones(); r++)
            for(int c=0; c<getColumnas(); c++)
                resultante.setValor(getValor(r,c) + m.getValor(r, c),r,c); //valor (suma), renglon, columna
        return resultante; 
    }
    public Matriz multiplicacion(double escalar)
    {
        Matriz resultante = new Matriz(getRenglones(),getColumnas());
        //ciclo para recorrer los renglones y columnas de la matriz:
        for(int r=0; r<getRenglones();r++)
            for(int c=0; c<getColumnas(); c++)
                resultante.setValor(getValor(r,c)*escalar,r,c);//valor, renglon, columna
        return resultante;
    }
    public Matriz resta(Matriz m)
    {
        //ESTE METODO INVOLUCRA TRES OBJETOS DE LA CLASE MATRIZ:
        //1.-EL QUE MANDA LLAMAR EL METODO (this)
        //2.-EL QUE LLEGA COMO PARAMETRO(m)
        //3.-EL RESULTADO DE RESTAR this Y m (resultante)
        return suma(m.multiplicacion(-1));  //con el metodo suma, suma el objeto this con la multiplicacion de -1 con m
    }
    
    public Matriz multiplicar(Matriz m)
    {
        if (getColumnas() != m.getRenglones())
            return new Matriz();
    
        Matriz resultante = new Matriz(getRenglones(),m.getColumnas());
        
        double suma; 
        
          for(int r = 0; r<resultante.getRenglones();r++)
            for(int c = 0; c<resultante.getColumnas(); c++)
            {
                suma = 0;
                for (int k = 0; k<getColumnas(); k++)
                    suma += getValor(r,k) * m.getValor(k, c);
                
                resultante.setValor(suma, r, c);
                
            }
                
          return resultante;
    }
    

}
