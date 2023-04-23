/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg1.pkg19;

/**
 *
 * @author aa615
 */
public class Vector {
    
    private double magnitude;
    private double angulo;
    
public Vector(){
magnitude =0;
angulo =0;
         }
public Vector(double mag,double ang){
    angulo = ang;
    magnitude = mag;
}
public void setAngulo(double ang){
    angulo = ang;
}
public void setMagnitude(double mag){
    magnitude = mag;
}

public void setRadianes(double rad)
{
    angulo = rad * 180 / Math.PI;
}

public void setXY (double x, double y)
{
    magnitude = Math.sqrt(x*x + y*y);
    setRadianes(Math.atan2(y, x));
    
    
}

public double getMagnitude()
{
    return magnitude;
}

public double getAngulo(){
    return angulo;
}

public double getRadianes()
{
    return angulo * Math.PI/180;
    
}

public double getX()
{
    return magnitude * Math.cos(getRadianes());
}

public double getY()
{
    return magnitude * Math.sin(getRadianes());
}


    @Override
    public String toString()
{
    return "Mag;"+magnitude+"ang"+angulo;
}

    
    public Vector suma(Vector v){
    //este metodo involucara 1 objeto de la clase Vector
    //1 el que manda llamar al metodo (this)
    //2 el que llege como parametro (v) y se va a sumar con el primero
    // 3 el resultado de la suma (resultante) y es el que  se retorna
    
//    double v1x = magnitude * Math.cos(angulo*Math.PI/180);
//    double v2x = v.magnitude* Math.cos(v.angulo*Math.PI/180);
//    
//    double vy1 = magnitude * Math.sin(angulo*Math.PI/180);
//    double vy2 = v.magnitude*Math.sin(v.angulo*Math.PI/180);
//    
//    double sumaX = v1x + v2x;
//    double sumay = vy1 + vy2; 
//    
//    double r = Math.sqrt(Math.pow(sumaX,2)+Math.pow(sumay,2));
//    double a = Math.atan2(sumay,sumaX)*180/Math.PI;
        
    double sumaX = getX() + v.getX();
    double sumaY = getY() + v.getY();
    
    
    Vector resultante = new Vector();
    
    resultante.setXY(sumaX, sumaY);
            
    return resultante; 
}

      
    public Vector resta(Vector v){
  
    double sumaX = getX() - v.getX();
    double sumaY = getY() - v.getY();
    
    
    Vector resultante = new Vector();
    
    resultante.setXY(sumaX, sumaY);
            
    return resultante; 
    
    }
}

