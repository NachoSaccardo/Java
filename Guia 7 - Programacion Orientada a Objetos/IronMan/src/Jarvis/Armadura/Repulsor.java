
package Jarvis.Armadura;


public class Repulsor {
    private boolean status=false;
    private float consumoBase=2;

    public Repulsor() {
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
