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
            System.out.println("Para finalizar pulsar ctrl+z.\n");
            while ((car=(char)System.in.read())!=eof)
            {
                //[entrar]= CRLF=\r\n
                if (car=='\r')continue;//le sigue un \n
                ncaracteres++;//contador de caracteres
                if (car==null)
                {
                palabra=false;
                }else if(!palabra)//comienzaa una palabra
                {
                    npalabras++;//contador de palabras
                    palabra=true;
                }
                if (car=='\n')//finaliza una linea
                    nlineas++;//contador de lineas
            }
            System.out.println("");
            System.out.println(ncaracteres+""+ npalabras+""+nlineas);
            
        }catch (IOException ignorada){}
    }
}
