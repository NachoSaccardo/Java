
package Jarvis.Armadura;


public class Propulsor {
    private boolean status=false;
    private float consumoBase= (float) 2.5;

    public Propulsor() {
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
