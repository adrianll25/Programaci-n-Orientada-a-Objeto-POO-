package pb_2019_02_07.aplicacionproducto.o.o;
public class Producto {
    // Atributos
    private String descripcion;
    private double costo;
    private double margenUtilidad;
    private double porcDescuento;
    private double porcImpuesto;
    // Constructores
    public Producto(){
        this.descripcion    = "Dell Inspiron";
        this.costo          = 7000;
        this.margenUtilidad = .15;
        this.porcDescuento  = .5;
        this.porcImpuesto   = .16;
    }
    public Producto(String descripcion, double costo, double margenUtilidad, double porcDescuento, double porcImpuesto){
        this.descripcion    = descripcion;
        this.costo          = costo;
        this.margenUtilidad = margenUtilidad;
        this.porcDescuento  = porcDescuento;
        this.porcImpuesto   = porcImpuesto;
    }
    // Métodos get/set
    public String getDescrpcion() {
        return descripcion;
    }
    public double getCosto() {
        return costo;
    }
    public double getMargenUtilidad() {
        return margenUtilidad;
    }
    public double getPorcDescuento() {
        return porcDescuento;
    }
    public double getPorcImpuesto() {
        return porcImpuesto;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public void setMargenUtilidad(double margenUtilidad) {
        this.margenUtilidad = margenUtilidad;
    }
    public void setPorcDescuento(double porcDescuento) {
        this.porcDescuento = porcDescuento;
    }
    public void setPorcImpuesto(double porcImpuesto) {
        this.porcImpuesto = porcImpuesto;
    }
    // Método toString
    @Override
    public String toString(){
        return descripcion + "costo "            + costo +
                             " Margen Utilidad " + margenUtilidad +
                             " Descuento "       + porcDescuento +
                             " Impuesto "        + porcImpuesto;
    }
   //metodos de proceso
    public double importeMargenUtilidad() //para mostrar los datos a pantalla
    {
        return costo * margenUtilidad / 100;
    }
    public double subTotal1()
    {
        return costo + importeMargenUtilidad();
    }
    public double importeDescuento()
    {
        return subTotal1() *  porcDescuento / 100;
    }
    public double subTotal2()
    {
        return subTotal1() - importeDescuento();
    }
    public double importeImpuesto()
    {
        return subTotal2() + porcImpuesto /100;
    }
    public double precio()
    {
          return subTotal2() + importeImpuesto();
//        double importeMargen = costo * margenUtilidad / 100;
//        double subTot1 = costo + importeMargen;
//        double importeDescuento = subTot1 * porcDescuento / 100;
//        double subTot2 = subTot1 - importeDescuento;
//        double importeImpuesto = subTot2 * porcImpuesto / 100;
//        double precioFinal = subTot2 + importeImpuesto;
//        
//        return precioFinal;
    }
}