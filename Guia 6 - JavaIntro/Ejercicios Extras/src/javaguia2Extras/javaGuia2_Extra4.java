package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra4 {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entre 1 y 10");
        int numero = leer.nextInt();
        int i = 0;
        String UNIDADES = "";
        String QUINTOS = "";
        String DECIMOS = "";

        int decimos = numero / 10;
        int quintos = (numero - decimos * 10) / 5;
        int unidades = numero - 5 * quintos - 10 * decimos;

        System.out.println("Numero: " + numero + ", Decimos: " + decimos + ", Quintos: " + quintos + ", Unidades: " + unidades);
        if (unidades < 4) {
            for (i = 0; i < unidades; i++) {
                UNIDADES = UNIDADES.concat("I");
            }
        }
        if (unidades == 4) {
            UNIDADES = "IV";
        }
        if (quintos == 1) {
            QUINTOS = "V";
        }
        if (quintos % 2 != 0) {
            QUINTOS = "V";
        } else {
            QUINTOS = "";
        }
        if (unidades + quintos == 5) {
            UNIDADES = "IX";
            QUINTOS = "";
        }
        if (decimos != 0) {
            for (i = 0; i < decimos; i++) {
                DECIMOS = DECIMOS.concat("X");
            }
        }

        System.out.println(DECIMOS.concat(QUINTOS).concat(UNIDADES));
    }
}

/*int num=leer.nextInt();
System.out.println("Integer: " + num);
int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
StringBuilder roman = new StringBuilder();
for(int i=0;i<values.length;i++)
{
while(num >= values[i])
{
num = num - values[i];
roman.append(romanLetters[i]);
}
}
System.out.println("Corresponding Roman Numerals is: " + roman.toString());  */
