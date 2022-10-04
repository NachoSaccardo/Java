/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author juans
 */
public class pruebaException extends Exception {

    /**
     * Creates a new instance of <code>pruebaException</code> without detail
     * message.
     */
    public pruebaException() {
    }

    /**
     * Constructs an instance of <code>pruebaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public pruebaException(String msg) {
        super(msg);
    }
}
