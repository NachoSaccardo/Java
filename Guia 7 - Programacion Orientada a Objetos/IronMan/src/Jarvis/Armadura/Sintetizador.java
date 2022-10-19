
package Jarvis.Armadura;


public class Sintetizador {
    public boolean status=true;
    private float consumoBase=(float)1.5;

    public Sintetizador() {
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
            System.out.println("El propulsor se ha dañado");
        }
    }    
    
}
