package libroprueba;

import java.io.*;
//leer.class debe estar en carpeta especificado CLASSPATH
public class LibroPrueba {
//CONTAR CARACTERES, PALABRAS, LINEAS EN TEXTO.
    
    public static void main(String[] args) throws IOException {
        final char eof=(char)-1;
        char car;
        boolean palabra=false;
        int ncaracteres=0, npalabras=0,nlineas=0;
        
        try {
            System.out.println("Introducir texto,"+"Pulse [Entrar] despues de cada linea.");
            System.out.println("Para finalizar pulsar ¬ y luego Enter.\n");
            while ((car=(char)System.in.read())!=eof)
            {/*
                 if (car=='\r')continue;//le sigue un \n
                ncaracteres++;//contador de caracteres
                if (car == ''|| car == '\n'||car == '\t')
                palabra=false;
                else if(!palabra)//comienzaa una palabra
                {
                    npalabras++;//contador de palabras
                    palabra=tru

                
                */
                
                //[entrar]= CRLF=\r\n
                if (car=='\r')continue;//le sigue un \n
                if(car!=' ')
                ncaracteres++;//contador de caracteres
                if (car==' '||car== '\t' || car=='\n')
                {
                palabra=false;
                }else if(!palabra)//comienzaa una palabra
                {
                    npalabras++;//contador de palabras
                    palabra=true;
                }
                if (car=='\n')  //finaliza una linea
                    nlineas++;  //contador de lineas
            }
            
            System.out.println("");
            System.out.println("caracteres: "+ncaracteres+" // palabras: "+ npalabras+"// lineas: "+nlineas);
            
        }catch (IOException ignorada){}
    }
}
