/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb_18131253_proyecto_01;

/**
 *
 * @author adria
 */
public class Dispositivo {
    
   private String dispositivo;
   private int Kb;
   private int Bytes;
   private int Bits;
   
   public Dispositivo()
   {
       Kb = 0;
       Bytes = 0;
       Bits = 0;
   }
   
   public Dispositivo(int K, int Byt, int Bit)
   {
       Kb = K;
       Bytes = Byt;
       Bits = Bit;
       
       
   }
   
   public Dispositivo(Dispositivo D)
   {
       Kb = D.Kb;
       Bytes = D.Bytes;
       Bits = D.Bits;
       
   }
   
   public void setKb(int K)
   {
       Kb = K;
       
   }
   
   public void setBytes(int Byt)
   {
       Bytes = Byt;
   }
   
   public void setBits(int Bit)
   {
       Bits = Bit;
   }
   
   public int getKb()
   {
       return Kb;
   }
   
   public int getBytes()
   {
       return Bytes;
   }
   
   public int getBits()
   {
       return Bits;
   }
   
   public String toString()
   {
        return Kb+"Kb, "+Bytes+"Bytes, "+Bits +"Bits";
   }
   
   public int BitsTotales()
   {
       return Kb * (1024*8) + Bytes * 8 + Bits;
   }
   
   public Dispositivo Suma(Dispositivo D)
   {
       int sumaBit = BitsTotales() + D.BitsTotales();
       
       int KB = sumaBit/(1024*8);
       int restoBit = sumaBit % (1024*8);
       int Byt= restoBit / 8;
       int Bit = restoBit % 8;
       
       return new Dispositivo(KB, Byt, Bit);
   }
   
   public Dispositivo Resta(Dispositivo D)
   {
       int restaBit = BitsTotales() - D.BitsTotales();
       
       int KB = (restaBit/(1024*8));
       int restoBit = restaBit % (1024*8);
       int Byt= (restoBit / 8);
       int Bit = (restoBit % 8);
       
       return new Dispositivo(KB, Byt, Bit);
   }
   
   public Dispositivo Conversion(int totales)
   {
       
       int KB = (totales/(1024*8));
       int restoBit = totales % (1024*8);
       int Byt= (restoBit / 8);
       int Bit = (restoBit % 8);
       
       return new Dispositivo(KB, Byt, Bit);
   }
   
   
   
    
}
