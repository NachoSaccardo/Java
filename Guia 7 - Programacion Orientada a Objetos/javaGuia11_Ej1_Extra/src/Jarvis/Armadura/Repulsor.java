
package Jarvis.Armadura;


public class Repulsor extends Dispositivo {


    public Repulsor(float consumoBase) 
    {
    status=true;
    destruido=false;
    this.consumoBase=consumoBase;
    }

    public Repulsor(boolean status, boolean destruido, float consumoBase) {
        super(status, destruido, consumoBase);
    }
        
}
