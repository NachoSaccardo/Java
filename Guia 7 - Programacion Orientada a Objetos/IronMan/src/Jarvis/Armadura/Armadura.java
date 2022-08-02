
package Jarvis.Armadura;


public class Armadura 
{
    private String colorprimario="Amarillo";
    private String colorsecundario="Rojo";
    private int resistencia=65;
    private int salud=100;
    Reactor reactor = new Reactor();
    Consola consola = new Consola();
    Sintetizador sintetizador = new Sintetizador();
    Propulsor botaIzquierda= new Propulsor();
    Propulsor botaDerecha= new Propulsor();
    Repulsor guanteIzquierdo=new Repulsor();
    Repulsor guanteDerecho=new Repulsor();
    
    public float caminar(int tiempo)
    {
        botaIzquierda.controlDaños();
        botaDerecha.controlDaños();
        
        if(tiempo>0)
        {
            if(!botaIzquierda.isStatus()&&!botaDerecha.isStatus())
            {
                float consumototal = consola.getConsumoBase()+tiempo*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                botaIzquierda.controlDaños();
                botaDerecha.controlDaños();
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }
            else
            {
                System.out.println("Imposible caminar, una de las botas esta dañada");
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }   
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            return consumototal;        
        }
        
    }
    
    public float correr(int tiempo)
    {
        botaIzquierda.controlDaños();
        botaDerecha.controlDaños();
        
        if(tiempo>0)
        {
            if(!botaIzquierda.isStatus()&&!botaDerecha.isStatus())
            {
                float consumototal = consola.getConsumoBase()+tiempo*2*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }
            else
            {
                System.out.println("Imposible correr, una de las botas esta dañada");
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }   
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            return consumototal;        
        }
    }
    
    public float propulsar(int tiempo)
    {
        botaIzquierda.controlDaños();
        botaDerecha.controlDaños();
        
        if(tiempo>0)
        {
            if(!botaIzquierda.isStatus()&&!botaDerecha.isStatus())
            {
                float consumototal = consola.getConsumoBase()+tiempo*3*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }
            else
            {
                System.out.println("Imposible propulsarse, una de las botas esta dañada");
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }     
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            return consumototal;        
        }
    }
    
    public float volar(int tiempo)
    {
        botaIzquierda.controlDaños();
        botaDerecha.controlDaños();
        guanteIzquierdo.controlDaños();
        guanteDerecho.controlDaños();
        if(tiempo>0)
        {
            if(!botaIzquierda.isStatus()&&!botaDerecha.isStatus()&&!guanteIzquierdo.isStatus()&&!guanteDerecho.isStatus())
            {
                float consumototal = consola.getConsumoBase()+tiempo*(3*(botaIzquierda.getConsumoBase()
                +botaDerecha.getConsumoBase()+2*(guanteIzquierdo.getConsumoBase()+guanteDerecho.getConsumoBase())));
                
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }
            else
            {   
                if(!botaIzquierda.isStatus()&&!botaDerecha.isStatus())
                    {
                        System.out.println("Imposible volar, una de las botas esta dañada");
                    }
                if(!guanteIzquierdo.isStatus()&&!guanteDerecho.isStatus())
                    {
                        System.out.println("Imposible volar, uno de los guantes esta dañada");
                    }
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }   
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            return consumototal;        
        } 
    }
    
    public float disparar(int tiempo)
    {
        guanteIzquierdo.controlDaños();
        guanteDerecho.controlDaños();
        if(tiempo>0)
        {
            if(!guanteIzquierdo.isStatus()&&!guanteDerecho.isStatus())
            {
                float consumototal = consola.getConsumoBase()+tiempo*(3*guanteIzquierdo.getConsumoBase()+guanteDerecho.getConsumoBase());
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }
            else
            {
                System.out.println("Imposible disparar, uno de los guantes esta dañado");
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                return consumototal;
            }   
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            return consumototal;        
        } 
    }
    
    public void mostrarEstado()
    {
        System.out.println("Bota Derecha: "+botaDerecha.isStatus());
        System.out.println("Bota izquierda: "+botaIzquierda.isStatus());
        System.out.println("Guante Derecho: "+guanteDerecho.isStatus());
        System.out.println("Guante Izquierdo: "+guanteIzquierdo.isStatus());
        System.out.println("Energia Restante: "+reactor.getEnergiareactor()+"/"+reactor.getEnergiareactor());
        System.out.println("Salud: "+salud+"/100");
    }
    
        
  
    
            
            
    /*
    caminar        
    correr        
    propulsar                
    volar                
    leer                        
    escribir        
    atacar        
    mostrarEstado
    estadoReactor
    sufrirDanio
    repararDanio
    revisarTodo
    radar
    simulador                        
    destruirEnemigos                
    accionesEvasivas            
          */                  
                         
                    
                    
                            
                            
                       
}
