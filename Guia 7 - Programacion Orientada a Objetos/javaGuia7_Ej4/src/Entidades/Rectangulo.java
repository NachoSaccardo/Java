package Entidades;

import java.util.Scanner;

public class Rectangulo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private float base;
    private float altura;

    public Rectangulo() {
        System.out.println("Ingrese la base");
        base = leer.nextFloat();
        System.out.println("Ingrese la altura");
        altura = leer.nextFloat();
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public float calcArea() {
        return base * altura;
    }

    public float calcPerimetro() {
        return (base + altura) * 2;
    }

    public void printAsteriscos() {
        int i, j;
        for (i = 0; i < altura; i++) {
            System.out.println("");
            for (j = 0; j < base; j++) {
                System.out.print("*");
            }

        }
        System.out.println("");
    }

    public void printAsteriscosVacio() {
        int i, j;
        for (i = 0; i < altura; i++) {
            for (j = 0; j < base; j++) {

                if (i == 0 || j == 0 || i == (altura - 1) || j == (base - 1)) {
                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
