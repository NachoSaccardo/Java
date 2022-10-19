
package Jarvis.Armadura;


public class Propulsor extends Dispositivo
{

    public Propulsor(float consumoBase) 
    {
    status=true;
    destruido=false;
    this.consumoBase=consumoBase;
    }

    public Propulsor(boolean status, boolean destruido, float consumoBase) {
        super(status, destruido, consumoBase);
    }
    // status=true;
    // destruido=false;
    // consumoBase= (float) 2.5;
    
    

    
    
}
