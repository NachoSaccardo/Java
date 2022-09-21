
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */


public class Main {

    
    public static void main(String[] args) {
       HashMap<String, Integer> almacen = new HashMap();
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       String nombre;
       String nuevonombre;
       Integer precio;
       int menu;
       menu=1;
       
       do{
            System.out.println("Seleccione una opcion:\n1. Agregar un producto\n2.Modificar producto\n3. Eliminar producto"
                + "\n4. Motrar todos los productos");
            menu=leer.nextInt();
       switch (menu)
       {
           case 1:
                System.out.println("Ingrese el nombre");
                nombre= leer.next();
                System.out.println("Ingrese el precio");
                 precio = leer.nextInt();
                almacen.put(nombre, precio);
                System.out.println("Se ha creado el siguiente producto: ");
                for (Map.Entry<String, Integer> entry : almacen.entrySet()) {
                   String key = entry.getKey();
                   Integer value = entry.getValue();
                   if(key.equals(nombre))
                        System.out.println(key+" ; "+value);
               }
                break;
           case 2:
                System.out.println("Ingrese el producto a modificar");
                nombre=leer.next();
                if(almacen.containsKey(nombre))
                {
                    System.out.println("Ingerse 1 para modificar el nombre\nIngrese 2 para modificar el precio");
                    menu=leer.nextInt();
                    switch(menu)
                    {
                        case 1: 
                            System.out.println("Ingrese el nuevo nombre");
                            nuevonombre=leer.next();
                            almacen.put(nuevonombre, almacen.get(nombre));
                            almacen.remove(nombre);
                            System.out.println("El nombre se ha cambiado a: "+nombre);
                            break;

                        case 2:
                            System.out.println("Ingrese el nuevo precio");
                            precio=leer.nextInt();
                            almacen.replace(nombre, precio);
                            System.out.println("Se ha modificado el precio a: "+ precio);
                            break;

                        default:
                            do{
                            System.out.println("Ingrese una opcion valida");
                            System.out.println("Ingerse 1 para modificar el nombre\nIngrese 2 para modificar el precio");
                            }while(menu!=1||menu!=2);
                            break;
                    }
                }
                break;
                case 3:
                System.out.println("Ingrese el nombre del producto a eliminar");
                nombre=leer.next();
                for (Map.Entry<String, Integer> entry1 : almacen.entrySet()) 
                {
                    String key1 = entry1.getKey();
                    Integer value1 = entry1.getValue();
                    if(key1.equals(nombre))
                    {
                        almacen.remove(nombre);
                    }
                }
                    System.out.println("El producto "+nombre+" ha sido eliminado");
                break;
            case 4: //Motrar todos los productos}
               for (Map.Entry<String, Integer> entry2 : almacen.entrySet()) 
               {
                   Object key = entry2.getKey();
                   Object value = entry2.getValue();
                   System.out.println("Nombre: "+ key+"; Precio: "+value);
               }
               break;
            case 0://Salir
               break;
            }
        }while(menu!=0);
    }
}
