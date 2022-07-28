
package Entidades;

public class Matematica {
    private float num1;
    private float num2;

    public Matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    public void devolverMayor()
    {

        if(num1==num2)
            System.out.println("Los numeros son iguales");
        else
            System.out.println("El numero mayor es: "+Math.max(num1, num2));
    }

/*Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores*/
    public void calcularPotencia()
    {
        System.out.println(Math.max(Math.round(num1), Math.round(num2))+" elevado a la "+
        Math.min(Math.round(num1), Math.round(num2))+" potencia es: "+Math.pow(Math.max
        (Math.round(num1),Math.round(num2)), Math.min(Math.round(num1), Math.round(num2))));;
    }
/*Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/
    public void calcularRaiz()
    {
        System.out.println("La raiz cuadrada de "+Math.min(Math.abs(num1), Math.abs(num2))+" es: "+
        +Math.sqrt(Math.min(Math.round(num1),Math.round(num2))));
    }
}




