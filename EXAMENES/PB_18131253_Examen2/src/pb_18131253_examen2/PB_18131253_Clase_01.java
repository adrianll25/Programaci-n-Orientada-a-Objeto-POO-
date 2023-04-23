/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131253_examen2;

/**
 *
 * @author adria
 */
 class Petroleo {
    private int Galon;
    private int Barril;
    
    //Constructores
    public Petroleo()
    {
        Galon = 0;
        Barril = 0;
    }
    
    public Petroleo(int Gal, int Bar)
    {
        Galon = Gal;
        Barril = Bar;
    }
    
    public Petroleo(Petroleo P)
    {
        Galon = P.Galon;
        Barril = P.Barril;
    }
    
    //Set
    
    public void setGalon(int Gal)
    {
     Galon = Gal;   
    }
    
    public void setBarril(int Bar)
    {
        Barril = Bar;
    }
    
    //Get
    public int getGalon()
    {
        return Galon;
    }
    
    public int getBarril()
    {
        return Barril;
    }
    
    public String toString()
    {
     return Barril+" Barril(es), " +Galon+" Galon(es).";  
    }
    
      public int PetTotales()
   {
       return Barril * 42 + Galon;
   }
   
   public Petroleo Suma(Petroleo P)
   {
       int sumaPet = PetTotales() + P.PetTotales();
       
       int Bar = sumaPet/42;
       int restoBar = sumaPet % 42;
       
       
       return new Petroleo(restoBar, Bar);
   }
   
   public Petroleo Resta(Petroleo D)
   {
       int restaPet = PetTotales() - D.PetTotales();
       
       int Bar = (restaPet/(42));
       int restoBar = restaPet % (42);
       
       
       return new Petroleo(restoBar, Bar );
   }
   
   public Petroleo Conversion(int totales)
   {
       int Bar = (totales/(42));
       int restoBar = totales % (42);
       
       
       return new Petroleo(Bar, restoBar);
   }
 
}
    
    
    
    

