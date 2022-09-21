
package Jarvis.Armadura;


public class Consola {
    public boolean status=true;
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
    public void controlDanos()
    {
        if(Math.random()<0.05&&status)
        {
            status=false;
            System.out.println("La consola se ha dañado");
        }
    }
    
    
}
