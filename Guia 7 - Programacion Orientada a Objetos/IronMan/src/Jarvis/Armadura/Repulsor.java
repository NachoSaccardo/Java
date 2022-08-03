
package Jarvis.Armadura;


public class Repulsor {
    public boolean status=true;
    private float consumoBase=2;
    public boolean destruido=false;

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
        if(destruido)
        {
            status=false;
        }
        else if(Math.random()<=0.05&&status)
        {
            status=false;
            System.out.println("El guante se ha dañado");
             //consumir consola
        }
    }
    
    public void reparar()
    {
        if(destruido)
        {
            
        }
        else if(!status)
        {
            if(Math.random()>=0.4)
            {
                status=true;
                System.out.println("El guante se ha reparado");
                 //consumir consola
            }
        }
    }
    
     public void revisar()
    {
        if(destruido)
        {
            
        }
        else if(!status)
        {
            if(Math.random()<=0.05)
            {
                destruido=true;
                System.out.println("El guante fue destruido");
                 //consumir consola
            }
            else
            {
                status=true;
                System.out.println("El guante fue reparado");
                 //consumir consola
            }
        }
    }
     
}
