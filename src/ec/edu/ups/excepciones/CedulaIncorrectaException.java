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
public class CedulaIncorrectaException extends Exception {

    public CedulaIncorrectaException() {
        super("La cedula es incorrecta");
    }
    
}
