/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author juans
 */
public class Comparadores {
    
   public static Comparator<Pais> compararPaisesNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
            
    
}

