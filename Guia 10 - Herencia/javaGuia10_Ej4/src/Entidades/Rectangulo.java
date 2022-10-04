
package Entidades;

import Interfaces.calculosFormas;


public class Rectangulo implements calculosFormas{
    private int ladoA;
    private int ladoB;
    private int perimetro;
    private int area;

    public Rectangulo() {
    }

    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    @Override
    public void calcularArea() {
        setArea(ladoA*ladoB);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(ladoA+ladoA+ladoB+ladoB);
    }
    
    
}
