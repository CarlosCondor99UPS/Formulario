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
public class ApellidoIncorrectoException extends Exception{

    public ApellidoIncorrectoException() {
        super("Ingrese sus dos apellidos");
    }
    
}
