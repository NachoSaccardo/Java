
package CuadraticAPP.Entidades;

public class Raices {
    private float a;
    private float b;
    private float c;
    private double discriminante;
    private boolean tieneraices;
    
    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
   
    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    public void getDiscriminante()
            {
                discriminante=Math.pow(b,2)-4*a*c;
                System.out.println("Discriminante: "+discriminante);
            }
    
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0. */
    public boolean tieneRaiz()
    {   return(discriminante==0);    }
    
    public boolean tieneRaices()
    {   return(discriminante>0);    }
    
    public void obtenerRaiz()
    {
        System.out.println("1ra Raiz: "+(-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a));
        
    }
    
    /*• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
    soluciones. */
    public void obtenerRaices()
    {
        System.out.println("1ra Raiz: "+(-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a));
        System.out.println("2ra Raiz: "+(-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a));
    }
    
    public void calcular()
    {
        if(tieneRaiz())
            obtenerRaiz();
        else if (tieneRaices())
            obtenerRaices();
        else
            System.out.println("No tiene raices");
                
            
    }
    
}   
