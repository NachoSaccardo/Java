/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class Utilidades 
{
    public static Calendar StringToCalendar(String time) 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String format = "dd/MM/yyyy";
        
        boolean bandera = false;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
        while(!bandera)
        {
            try 
            {
                calendar.setTime(dateformat.parse(time));
                bandera = true;
                return calendar;
            } 
            catch (Exception e) 
            {
                System.out.println("El formato ingresado es incorrecto. Ingrese la fecha nuevamente");
                time = leer.next();
            }
        }
        return calendar;
    }
}