
package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    private double radio;
    private double diametro;
    private double area;
    private double perimetro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        diametro=radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        diametro=radio*2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    @Override
    public void calcularArea() {
        setArea(PI*radio*radio);
    }

    @Override
    public void calcularPerimetro() 
    {
        setPerimetro(PI*diametro);
    }
    
    
}
