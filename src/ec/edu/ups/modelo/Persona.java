/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.excepciones.ApellidoIncorrectoException;
import ec.edu.ups.excepciones.CedulaIncorrectaException;
import ec.edu.ups.excepciones.CeldaVaciaException;
import ec.edu.ups.excepciones.EdadIncorrectaException;
import ec.edu.ups.excepciones.LongitudFueraDeRangoException;
import ec.edu.ups.excepciones.NombreIncorrectoException;

/**
 *
 * @author tians
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws CedulaIncorrectaException, CeldaVaciaException {
        if (cedula.equals("")) {
            throw new CeldaVaciaException();
        }else {
            if (validar(cedula)) {
                this.cedula = cedula;
            } else {
                throw new CedulaIncorrectaException();
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LongitudFueraDeRangoException, NombreIncorrectoException {
        if (nombre.length() >= 20 && nombre.length() <= 50) {
            if (nombre.contains(" ")) {
                this.nombre = nombre;
            } else {
                throw new NombreIncorrectoException();
            }
        } else {
            throw new LongitudFueraDeRangoException();
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws LongitudFueraDeRangoException, ApellidoIncorrectoException {
        if (apellido.length() >= 20 && apellido.length() <= 50) {
            if (apellido.contains(" ")) {
                this.apellido = apellido;
            } else {
                throw new ApellidoIncorrectoException();
            }
        } else {
            throw new LongitudFueraDeRangoException();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadIncorrectaException {
        if (edad >= 20 && edad <= 35) {
            this.edad = edad;
        } else {
            throw new EdadIncorrectaException();
        }

    }

    public boolean validar(String cedula) {
        int suma = 0;
        int a[] = new int[cedula.length() / 2];
        int b[] = new int[(cedula.length() / 2)];
        int c = 0;
        int d = 1;
        for (int i = 0; i < cedula.length() / 2; i++) {
            a[i] = Integer.parseInt(String.valueOf(cedula.charAt(c)));
            c = c + 2;
            if (i < (cedula.length() / 2) - 1) {
                b[i] = Integer.parseInt(String.valueOf(cedula.charAt(d)));
                d = d + 2;
            }
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
            if (a[i] > 9) {
                a[i] = a[i] - 9;
            }
            suma = suma + a[i] + b[i];
        }
        int aucedula = suma / 10;
        int dec = (aucedula + 1) * 10;
        if ((dec - suma) == Integer.parseInt(String.valueOf(cedula.charAt(cedula.length() - 1)))) {
            return true;
        } else if (suma % 10 == 0 && cedula.charAt(cedula.length() - 1) == '0') {
            return true;
        } else {
            return false;
        }

    }
}
