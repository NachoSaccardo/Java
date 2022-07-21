package BancoAPP.Servicios;

import BancoAPP.Entidades.Cuenta;
import java.util.Scanner;

public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);
    Cuenta[] BD = new Cuenta[99999999];
    public int numerodecuenta = 0;

    /**
     * Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. El
     * numero de cuenta se genera automaticamente, desde el 0 en adelante 
     *
     * @param c1
     */
    public Cuenta crearCuenta() {

        System.out.println("Ingrese el dni del cliente");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo inicial");
        double saldo = leer.nextDouble();
        System.out.println("Ingrese la tasa de interes dedsignada");
        float interes = leer.nextFloat();
        Cuenta c1 = new Cuenta(numerodecuenta + 1, dni, saldo, interes);
        BD[numerodecuenta] = c1;
        System.out.println("");
        System.out.println(c1);
            
        numerodecuenta = numerodecuenta + 1;
        return c1;

    }

    /**
     * Método ingresar(double ingreso): el método recibe una cantidad de dinero
     * a ingresar y se la sumara a saldo actual.
     *
     * @param c1
     */
    public void ingresar(Cuenta c1) {
        try {
            System.out.println("Indique el saldo a ingresar a su cuenta");
            double entrada = leer.nextDouble();
            c1.setSaldoActual(c1.getSaldoActual() + entrada);
            System.out.println(c1);
        } catch (NullPointerException e) {
            System.out.println("Indico una cuenta inexistente");
        }
    }

    /**
     * Método retirar(double retiro): el método recibe una cantidad de dinero a
     * retirar y se la restará al saldo actual.Si la cuenta no tiene la cantidad
     * de dinero a retirar, se pondrá el saldo actual en 0.
     *
     * @param c1
     */
    public void retirar(Cuenta c1) {
        try {
            System.out.println("Indique el saldo a retirar a su cuenta");
            double salida = leer.nextDouble();
            if (salida < c1.getSaldoActual()) {
                c1.setSaldoActual(c1.getSaldoActual() - salida);
            } else {
                System.out.println("No cuenta con saldo suficiente\nSe retirara el total"
                        + "del saldo disponible de: " + c1.getSaldoActual());
                c1.setSaldoActual(0);
            }
            System.out.println(c1);
        } catch (NullPointerException e) {
            System.out.println("Indico una cuenta inexistente");
        }
    }

    /**
     * Método extraccionRapida(): le permitirá sacar solo un 20% de su
     * saldo.Validar que el usuario no saque más del 20%.
     *
     * @param c1
     */
    public void extraccionRapida(Cuenta c1) {
        /**
         * El TRY-CATCH intenta ejecutar un bloque de codigo y ve si la
         * ejecucion devuelve una excepcion determinada, en este caso
         * "NullPointerException", que es la que se produce cuando intento
         * operar con una posicion de un Array que no fue inicializado.Si se
         * produce esta excepcion, en lugar de ejecutar el codigo, Me ejecuta
         * otro bloque de codigo que le indico dentro del "CATCH" parecido a un
         * IF-ELSE.
         */
        try {
            System.out.println("Indique el saldo a retirar a su cuenta. Hasta 20% del saldo total");

            double salida = leer.nextDouble();
            if (salida <= .20 * c1.getSaldoActual()) {
                c1.setSaldoActual(c1.getSaldoActual() - salida);
            } else {
                System.out.println("El monto de la extraccion rapida no puede superar el "
                + "20% del saldo disponible. El maximo monto a retirar es: " + .20 * c1.getSaldoActual());
            }
            System.out.println(c1);
        } catch (NullPointerException e) {
            System.out.println("Indico una cuenta inexistente");
        }
    }

    /**
     * Método consultarSaldo(): permitirá consultar el saldo disponible en la
     * cuenta.
     *
     * @param c1
     */
    public void consultaSaldo(Cuenta c1) {
        try {
            System.out.println("Su saldo actual es de: " + c1.getSaldoActual());
        } catch (NullPointerException e) {
            System.out.println("Indico una cuenta inexistente");
        }
    }

    /**
     * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     *
     * @param c1
     */
    public void consultaDatos(Cuenta c1) {
        try {
            System.out.println("Datos de la cuenta:");
            System.out.println(c1);
        } catch (NullPointerException e) {
            System.out.println("Indico una cuenta inexistente");
        }

    }

    public void menuPrincipal() {
        int opcion;
        int cuenta;
        do {
            System.out.println("Seleccione la operacion que desea realizar");
            System.out.println("1. Crear nueva Cuenta\n2. Ingresar Dinero\n3. Retirar Dinero\n"
                    + "4. Realizar una extraccion rápida\n5. Consultar Saldo\n6. Consultar datos"
                    + "de la cuenta\n0. Salir");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Indique la cuenta: ");
                    cuenta = leer.nextInt();
                    System.out.println("");
                    ingresar(BD[cuenta - 1]);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Indique la cuenta: ");
                    cuenta = leer.nextInt();
                    System.out.println("");
                    retirar(BD[cuenta - 1]);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Indique la cuenta: ");
                    System.out.println("");
                    cuenta = leer.nextInt();
                    extraccionRapida(BD[cuenta - 1]);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Indique la cuenta: ");
                    System.out.println("");
                    cuenta = leer.nextInt();
                    consultaSaldo(BD[cuenta - 1]);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Indique la cuenta: ");
                    System.out.println("");
                    cuenta = leer.nextInt();
                    consultaDatos(BD[cuenta - 1]);
                    System.out.println("");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    System.out.println("");
                    break;
            }
        } while (opcion != 0);
    }
}
