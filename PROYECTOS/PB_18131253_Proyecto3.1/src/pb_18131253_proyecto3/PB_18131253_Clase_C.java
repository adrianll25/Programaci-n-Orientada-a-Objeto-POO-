/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_proyecto3;

/**
 *
 * @author adria
 */
class LineaBlanca extends MueblesCocina{
    private String Capacidad;
    
    public LineaBlanca()
    {
        super();
        Capacidad="No Definida";
    }
    
    public LineaBlanca( String Descrip, int Prec, String Capac)
    {
        super( Descrip, Prec);
        Capacidad = Capac;
    }
    
    public String getCapacidad()
    {
        return Capacidad;
    }
    
    public void setCapacidad(String Capac)
    {
     Capacidad = Capac;   
    }

    @Override
    public String Mostrar() {
       return "Capacidad: "+Capacidad+super.Mostrar();
    }
    
    
    
            
    
}
