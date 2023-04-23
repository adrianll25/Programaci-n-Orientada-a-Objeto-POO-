/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_27_aplicacionpunto;

/**
 *
 * @author aa609
 */
public class Punto {
    //  ATRIBUTOS
        private double x;
        private double y;
        
    // CONSTRUCTORES
        public Punto ()
        {
            x = 0;
            y = 0;
        }

        public Punto(double x, double y)
        {
            this.x = x;
            this.y = y;
        }
        
        public Punto (Punto p) //(copia del punto)
        {
            x = p.x;
            y = p.y;
            
        }
    // METODOS SET
        public void setX(double x)
        {
            this.x = x;
        }
        
        public void setY(double y)
        {
            this.y = y;
        }


        
    // METODOS GET
        public double getX()
        {
            return x;
        }
        
        public double getY()
        {
            return y;
        }
    // METODO TOSTRING
        @Override
        public String toString()
        {
            return "("+x+","+y+")";
        }
                
        
    // METODO CALCULO
        public double distancia (Punto p)
        {
            //en este metodo se involucran dos objetos de la clase punto
            // 1: el que manda llamar el metodo (this)
            // 2: el que llega como parametro (p)
            
            return Math.sqrt(Math.pow(p.x - x,2)+Math.pow(p.y - y,2));
           
            
        }
    
        public Punto medio(Punto p)
        {
            //en este metodo se involucran tres objetos de la clase punto
            // 1: el que manda llamar el metodo (this)
            // 2: el que llega como parametro (p)
            // 3: el que se regresa como resultado (m)
           
            double xm = (x+p.x)/2;
            double ym = (y+p.y)/2;
            
            Punto m = new Punto (xm, ym);
            return m;
        }
        
    
    
    
}
