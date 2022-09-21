
package Jarvis.Armadura;


public class Propulsor {
    public boolean status=true;
    public boolean destruido=false;
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
    public void controlDanos()
    {
        if(destruido)
        {
            status=false;
        }else if(Math.random()<=0.05&&status)
        {
            status=false;
            System.out.println("El propulsor se ha dañado");
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
                System.out.println("El propulsor se ha reparado");
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
                System.out.println("El propulsor fue destruido");
                 //consumir consola
            }
            else
            {
                status=true;
                System.out.println("El propulsor fue reparado");
                 //consumir consola
            }
        }
    }
    
}
