package Estancias.Utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Utilidades 
{
    public static Calendar StringToCalendar(String time)
    {
        Calendar calendar = Calendar.getInstance();
        
        String format = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
       
        try 
        {
            calendar.setTime(dateformat.parse(time));

            
        } 
        catch (Exception e) 
        {
            System.out.println("El formato horario es incorrecto");
        }
        return calendar;
    }
    
    public static String CalendarToString(Calendar calendar) 
    {
       
        String format = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
        
        try 
        {
            return dateformat.format(calendar.getTime());
        } 
        catch (Exception e) 
        {
            System.out.println("El formato horario es incorrecto");
        }
        return null;
    }
}