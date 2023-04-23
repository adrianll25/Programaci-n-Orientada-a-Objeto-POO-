/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_examen_03;

/**
 *
 * @author adria
 */
public class Avion extends Transporte{
    
    private int pasajeros;
    
    public Avion()
    {
       super();
       pasajeros = 0;
    }
    
    public Avion(String Modelo, int pas)
    {
        super(Modelo);
        pasajeros=pas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    @Override
    public String Mostrar()
    {
          return "\n"+super.getModelo()+", N° Pasajeros: "+pasajeros;
    }
    
}
