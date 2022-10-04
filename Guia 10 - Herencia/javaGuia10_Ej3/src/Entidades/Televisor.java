/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

 */
package Entidades;

/**
 *
 * @author juans
 */
public class Televisor extends Electrodomestico 
{
    private Integer resolucion;
    private boolean TDT=false;
     
    /*Un constructor vacío.*/
    public Televisor() {
    }

    /*• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
    heredados. Recuerda que debes llamar al constructor de la clase padre.*/   
    public Televisor(Integer resolucion, boolean TDT, Double precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    /* Método get y set de los atributos resolución y sintonizador TDT.*/
    public Integer getResolucion() {
        return resolucion;
    }
    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }
    public boolean isTDT() {
        return TDT;
    }
    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString()+" Televisor {" + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
    
    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.*/
    
    public void crearTelevisor()
    {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas");
        setResolucion(leer.nextInt());
        System.out.println("Tiene TDT?? ( S / N )");
        String verdad = leer.next();
        if(verdad.toLowerCase().equals("s")||verdad.toLowerCase().equals("si"))
        {
            setTDT(true);
        }        
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.*/
   
    @Override
    public void precioFinal()
    {
        super.precioFinal();
        precio = precio + (resolucion>40 ? precio*0.3 : 0)+(TDT ? 500 : 0);
        System.out.println("Precio Televisor: "+precio);
    }
    
    
}
