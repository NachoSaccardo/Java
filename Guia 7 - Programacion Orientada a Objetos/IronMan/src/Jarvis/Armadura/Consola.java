
package Jarvis.Armadura;


public class Consola {
    private boolean status=false;
    private float consumoBase=1;

    public Consola() {
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public float getConsumoBase() {
        return consumoBase;
    }
    public void setConsumoBase(float consumoBase) {
        this.consumoBase = consumoBase;
    }
    public void controlDaños()
    {
        if(Math.random()<0.3)
            status=true;
    }
    
    
}
