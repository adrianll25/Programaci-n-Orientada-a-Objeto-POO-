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
public class Automovil extends Transporte{
    private String Transmision;

    public Automovil()
    {
        Transmision = "Transmision";
    }
    
    public Automovil(String Modelo, String Trans)
    {
        super(Modelo);
        Transmision = Trans;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }
    
       public String Mostrar()
    {
         return "\n"+super.getModelo()+", Transmisió: "+Transmision;
    }
    
}
