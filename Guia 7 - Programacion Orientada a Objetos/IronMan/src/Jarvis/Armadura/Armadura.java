
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

        botaIzquierda.reparar();
        botaDerecha.reparar();
        if(tiempo>0)
        {
            if(botaIzquierda.status&&botaDerecha.status)
            {
                botaIzquierda.controlDaños();
                botaDerecha.controlDaños();
                
                if(botaIzquierda.status&&botaDerecha.status)
                {
                float consumototal = consola.getConsumoBase()+tiempo*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                System.out.println("Ha caminado durante "+tiempo+" minutos");
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                System.out.println("------------------------\n");
                return consumototal;
                }
                else
                {
                    System.out.println("Imposible caminar, una de las botas esta dañada");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }   
            }
            else
            {
                System.out.println("Imposible caminar, una de las botas esta dañada");
                float consumototal = consola.getConsumoBase();
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                System.out.println("------------------------\n");
                return consumototal;
                
            }
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            System.out.println("------------------------\n");
            return consumototal;        
        }
        
    }
    
    public float correr(int tiempo)
    {
        botaIzquierda.reparar();
        botaDerecha.reparar();
        
        if(tiempo>0)
        {
            if(botaIzquierda.status&botaDerecha.status)
            {
                botaIzquierda.controlDaños();
                botaDerecha.controlDaños();
                
                if(botaIzquierda.status&botaDerecha.status)
                {
                    float consumototal = consola.getConsumoBase()+tiempo*2*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                    System.out.println("Ha corrido durante "+tiempo+" minutos");
                    System.out.println("Energia consumida: "+consumototal+" Watts");
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }
                else
                {
                    System.out.println("Imposible correr, una de las botas esta dañada");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }   
            }
            else
            {
                System.out.println("Imposible correr, una de las botas esta dañada");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
            }
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            System.out.println("------------------------\n");
            return consumototal;        
        }
    }
    
    public float propulsar(int tiempo)
    {
        if(tiempo>0)
        {   
            botaIzquierda.reparar();
            botaDerecha.reparar();
            if(botaIzquierda.status&botaDerecha.status)
            {
                if(botaIzquierda.status&botaDerecha.status)
                {
                    botaIzquierda.controlDaños();
                    botaDerecha.controlDaños();

                    float consumototal = consola.getConsumoBase()+tiempo*3*(botaIzquierda.getConsumoBase()+botaDerecha.getConsumoBase());
                    System.out.println("Se ha propulsado durante "+tiempo+" minutos");
                    System.out.println("Energia consumida: "+consumototal+" Watts");
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }
                else
                {
                    System.out.println("Imposible propulsarse, una de las botas esta dañada");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }
            }
            else
            {
                System.out.println("Imposible propulsarse, una de las botas esta dañada");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
            }
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            System.out.println("------------------------\n");
            return consumototal;        
        }
    }
    
    public float volar(int tiempo)
    {
        botaIzquierda.reparar();
        botaDerecha.reparar();
        guanteIzquierdo.reparar();
        guanteDerecho.reparar();
        
        if(tiempo>0)
        {
            if(botaIzquierda.status&botaDerecha.status&guanteIzquierdo.status&guanteDerecho.status)
                {
                    botaIzquierda.controlDaños();
                    botaDerecha.controlDaños();
                    guanteIzquierdo.controlDaños();
                    guanteDerecho.controlDaños();
                    
                    if(botaIzquierda.status&botaDerecha.status&guanteIzquierdo.status&guanteDerecho.status)
                    {
                        float consumototal = consola.getConsumoBase()+tiempo*(3*(botaIzquierda.getConsumoBase()
                        +botaDerecha.getConsumoBase()+2*(guanteIzquierdo.getConsumoBase()+guanteDerecho.getConsumoBase())));
                        System.out.println("Ha volado durante "+tiempo+" minutos");

                        System.out.println("Energia consumida: "+consumototal+" Watts");
                        reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                        System.out.println("------------------------\n");
                        return consumototal;
                    }
                    else
                    {   
                        if(!botaIzquierda.status||!botaDerecha.status)
                            {
                                System.out.println("Imposible volar, una de las botas esta dañada");
                            }
                        if(!guanteIzquierdo.status||!guanteDerecho.status)
                            {
                                System.out.println("Imposible volar, uno de los guantes esta dañado");
                            }
                        float consumototal = consola.getConsumoBase();
                        reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                        System.out.println("------------------------\n");
                        return consumototal;
                    }   
                }
            else
            {   
                if(!botaIzquierda.status||!botaDerecha.status)
                {
                    System.out.println("Imposible volar, una de las botas esta dañada");
                }
                    if(!guanteIzquierdo.status||!guanteDerecho.status)
                    {
                        System.out.println("Imposible volar, uno de los guantes esta dañado");
                    }
                        float consumototal = consola.getConsumoBase();
                        reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                        System.out.println("------------------------\n");
                        return consumototal;
            }
        } 
        float consumototal = consola.getConsumoBase();
        System.out.println("Energia consumida: "+consumototal+" Watts");
        reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
        System.out.println("------------------------\n");
        return consumototal;    
        
    }

    
    public float disparar(int tiempo)
    {
        
        
        if(tiempo>0)
        {
            if(guanteIzquierdo.status&guanteDerecho.status)
            {    
                guanteIzquierdo.controlDaños();
                guanteDerecho.controlDaños();
                
                if(guanteIzquierdo.status&guanteDerecho.status)
                {
                float consumototal = consola.getConsumoBase()+tiempo*(3*guanteIzquierdo.getConsumoBase()+guanteDerecho.getConsumoBase());
                System.out.println("Energia consumida: "+consumototal+" Watts");
                reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                System.out.println("------------------------\n");
                return consumototal;
                }
                else
                {
                    System.out.println("Imposible disparar, uno de los guantes esta dañado");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
                }
            }
            else
            {
                System.out.println("Imposible disparar, uno de los guantes esta dañado");
                    float consumototal = consola.getConsumoBase();
                    reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
                    System.out.println("------------------------\n");
                    return consumototal;
            }
        }
        else
        {   
            float consumototal = consola.getConsumoBase();
            System.out.println("Energia consumida: "+consumototal+" Watts");
            reactor.setEnergiareactor(reactor.getEnergiareactor()-consumototal);
            System.out.println("------------------------\n");
            return consumototal;        
        } 
        
    }
    
    public void mostrarEstado()
    {
        //consumir consola
        System.out.println("Bota Derecha Sana: "+botaDerecha.status);
        System.out.println("Bota Derecha Destruido"
                + ": "+botaDerecha.destruido);
        System.out.println("Bota izquierda Sana: "+botaIzquierda.status);
        System.out.println("Bota izquierda Destruida: "+botaIzquierda.destruido);
        System.out.println("Guante Derecho Sano: "+guanteDerecho.status);
        System.out.println("Guante Derecho Destruido: "+guanteDerecho.destruido);
        System.out.println("Guante Izquierdo Sano: "+guanteIzquierdo.status);
        System.out.println("Guante Izquierdo Destruido: "+guanteIzquierdo.destruido);
        System.out.println("Energia Restante: "+reactor.getEnergiareactor()+"/"+reactor.getEnergiareactor());
        System.out.println("Salud: "+salud+"/100");
        System.out.println("Resistencia: "+resistencia);
        System.out.println("------------------------\n");
    }
    
    public void mostrarBateria()
    {   //consumir consola
        System.out.println("Energia Restante: "+100*reactor.getEnergiareactor()/999999999+"%");
        System.out.println("------------------------\n");
    }
    
    public void mostrarReactorHP()    
    {
        //consumir consola
        System.out.println("Energia Restante: "+(reactor.getEnergiareactor()*0.00134102)+"HP");
        System.out.println("------------------------\n");
    }
  
    public void mostrarReactorBHP()    
    {
        //consumir consola
        System.out.println("Energia Restante: "+(reactor.getEnergiareactor()*0.000102)+"BHP");
        System.out.println("------------------------\n");
    }
    
    public void revisarDispositivos()
    {
            do
            botaIzquierda.revisar();
            while(botaIzquierda.status==false&&botaIzquierda.destruido==false);
            
            do
            botaDerecha.revisar();
            while(botaDerecha.status==false&&botaDerecha.destruido==false);
            
            do
            guanteIzquierdo.revisar();
            while(guanteIzquierdo.status==false&&guanteIzquierdo.destruido==false);
            
            do
            guanteDerecho.revisar();
            while(guanteDerecho.status==false&&guanteDerecho.destruido==false);
            System.out.println("------------------------\n");
    }
            
    /* radar
    simulador                        
    destruirEnemigos                
    accionesEvasivas */                  
                         
                    
                    
                            
                            
                       
}
