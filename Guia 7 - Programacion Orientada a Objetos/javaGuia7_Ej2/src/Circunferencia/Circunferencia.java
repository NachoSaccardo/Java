
package Circunferencia;

import java.text.DecimalFormat;

public class Circunferencia 
{
    private double radio;
    private double area;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
       this.radio = radio;
    }

    @Override
    public String toString() {
        String pattern = "#.##";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        
        
        return "Circunferencia{" + "radio=" + decimalFormat.format(radio) + ", area=" + decimalFormat.format(area) + '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
   
    // Aca el area la guardo como un atributo del objeto
    // para esto, lo definí entre los atributos de la clase arriba de todo
    public double Area()
    {
       area = Math.PI*radio*radio;
       return area;
    }
    
    // Aca el perimetro no lo guardo, solo lo imprimo en pantalla 
    public void Perimetro()
    {
       double perimetro = Math.PI*radio*2;
        System.out.println(perimetro);
    }
        
}
