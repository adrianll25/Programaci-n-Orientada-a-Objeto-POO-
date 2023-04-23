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
class Electrodomestico extends MueblesCocina {
    private String Colores;
    
    public Electrodomestico()
    {
        super();
        Colores = "Sin-Color";
    }
    
    public Electrodomestico( String Descrip, int Prec, String Col)
    {
        super( Descrip, Prec);
        Colores = Col;
    }

    public String getColor() {
        return Colores;
    }

    public void setColor(String Col) {
        Colores = Col;
    }

    @Override
    public String Mostrar() {
        return "Color: "+Colores+super.Mostrar();
    }
    
    
    
    
    
    
}
