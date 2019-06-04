/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author tians
 */
public class EdadIncorrectaException extends Exception{

    public EdadIncorrectaException() {
        super("La edad de la persona debe ser entre 20 y 35 anos");
    }
    
}
