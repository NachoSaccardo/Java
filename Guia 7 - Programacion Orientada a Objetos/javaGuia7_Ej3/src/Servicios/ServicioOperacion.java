package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion()
    {
       System.out.println("Ingrese el primer numero");
       int numero1=leer.nextInt();
       System.out.println("Ingrese el segundo numero");
       int numero2=leer.nextInt();
       
       Operacion op1 = new Operacion(numero1, numero2);
       return op1; 
    }
    
    public int sumar(Operacion op1)
    {
        return op1.getNumero1()+op1.getNumero2();
    }
    
    public int restar(Operacion op1)
    {
        return op1.getNumero1()-op1.getNumero2();
    }
/*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main*/
    
    public int multiplicar(Operacion op1)
    {   int multiplicacion;
        if(op1.getNumero2()==0)
        {
            System.out.println("Error, esta intentando multiplicar por cero!");
            multiplicacion=0;
        }
        else
        {
            multiplicacion = op1.getNumero1()*op1.getNumero2();
        }
        return multiplicacion;
    }
/*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
        
        public float dividir(Operacion op1)
        {
        float division;
        if(op1.getNumero2()==0)
        {
            System.out.println("Error, esta intentando dividir por cero!");
            division=0;
        }
        else
        {
            division = op1.getNumero1()/op1.getNumero2();
        }
        return division;
        
        }
}
