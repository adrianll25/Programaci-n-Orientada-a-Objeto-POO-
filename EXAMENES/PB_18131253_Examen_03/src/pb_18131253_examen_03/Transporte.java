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
public abstract class Transporte {
    private String Modelo;
    
    public Transporte()
            {
                Modelo = "Modelo";
            }
    
    public Transporte(String Mod)
    {
        Modelo = Mod;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public  abstract String Mostrar();
    
     public int compareTo(Object o) {
        Transporte n = (Transporte)o;
        return this.Modelo.compareTo(n.Modelo);
    }
   
}
