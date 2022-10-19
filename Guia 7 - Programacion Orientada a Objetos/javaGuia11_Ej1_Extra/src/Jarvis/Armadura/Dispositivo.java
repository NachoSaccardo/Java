
package Jarvis.Armadura;


public class Dispositivo 
{
    protected boolean status;
    protected boolean destruido;
    protected float consumoBase;

    public Dispositivo() {
    }

    public Dispositivo(boolean status, boolean destruido, float consumoBase) {
        this.status = status;
        this.destruido = destruido;
        this.consumoBase = consumoBase;
    }
     
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public float getConsumoBase() {
        return consumoBase;
    }

    public void setConsumoBase(float consumoBase) {
        this.consumoBase = consumoBase;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "status=" + status + ", destruido=" + destruido + ", consumoBase=" + consumoBase + '}';
    }
    
    public void controlDanos()
    {
        if(destruido)
        {
            status=false;
        }else if(Math.random()<=0.05&&status)
        {
            status=false;
            System.out.println("El "+getClass().getSimpleName()+" se ha dañado");
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
                System.out.println("El "+getClass().getSimpleName()+" se ha reparado");
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
                System.out.println("El "+getClass().getSimpleName()+" fue destruido");
                 //consumir consola
            }
            else
            {
                status=true;
                System.out.println("El "+getClass().getSimpleName()+" fue reparado");
                 //consumir consola
            }
        }
    }
}
