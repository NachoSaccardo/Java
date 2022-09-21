/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
 */
package Entidades;

public class Lavadora extends Electrodomestico
{
    private Integer carga;

    /*• Un constructor vacío.*/
    public Lavadora() {
    }

    /*Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
    llamar al constructor de la clase padre.*/
    public Lavadora(Integer carga, Double precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    
    /*• Método get y set del atributo carga.*/

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    

    public void crearLavadora()
    {
        crearElectrodomestico();      
        System.out.println("Ingrese la carga");
        setCarga(leer.nextInt());
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    @Override
    public void precioFinal()
    {
        super.precioFinal();
        precio=precio+(carga>30 ? 500 : 0);
        System.out.println("Precio Lavadora: "+precio);
    }

    @Override
    public String toString() {
        return super.toString()+" Lavadora {" + "carga=" + carga + '}';
    }
    
}
