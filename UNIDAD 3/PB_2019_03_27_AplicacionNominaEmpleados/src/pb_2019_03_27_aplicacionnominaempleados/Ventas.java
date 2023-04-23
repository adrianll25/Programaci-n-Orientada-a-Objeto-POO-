/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author aa630
 */
public class Ventas extends Empleado{
    //atributos:
    private double ventasTot;
    private double comision;
    
    public Ventas()
    {
        super();
        ventasTot =0;
        comision =0;
    }
    public Ventas(int num, String nom, double vtaTot,double comision)
    {
        super(num,nom);
        ventasTot = vtaTot;
        this.comision = comision;
    }
    public double getVentasTotales()
    {
        return ventasTot;
    }
    public double getComision()
    {
        return comision;
    }
    public void setVentasTotales(double vtaTot)
    {
        ventasTot = vtaTot;
    }
    public void setComision(double comision)
    {
        this.comision = comision;
    }
    //to string :
    @Override
    public String toString()
    {
        return super.toString() +" Ventas Tot: "+ventasTot + " %Comision: "+comision;
    }
    //metodo de proceso:
    public double sueldo()
    {
        return ventasTot * comision / 100;
    }
}
