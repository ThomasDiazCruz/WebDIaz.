package co.edu.udistrital.model;

import java.io.Serializable;

/**
 * Autor: Thomas Diaz
 */
public class ProgramaAcademicoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;

    public ProgramaAcademicoDTO() {
    }

    public ProgramaAcademicoDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}