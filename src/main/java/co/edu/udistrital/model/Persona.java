package co.edu.udistrital.model;

import java.io.Serializable;

/**
 * Autor: Thomas Diaz
 */

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String numeroIde;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String numeroIde, String nombre, String apellido) {
        this.numeroIde = numeroIde;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNumeroIde() {
        return numeroIde;
    }

    public void setNumeroIde(String numeroIde) {
        this.numeroIde = numeroIde;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}