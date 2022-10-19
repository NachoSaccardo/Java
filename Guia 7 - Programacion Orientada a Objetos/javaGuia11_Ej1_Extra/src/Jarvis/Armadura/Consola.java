
package Jarvis.Armadura;


public class Consola extends Dispositivo{

    public Consola() {
    }
    
      public Consola(float consumoBase) 
    {
        status=true;
        destruido=false;
        this.consumoBase=consumoBase;
    }
    
}
