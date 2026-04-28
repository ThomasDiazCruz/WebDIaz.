package co.edu.udistrital.model;

import java.io.Serializable;

/**
 * Autor: Thomas Diaz
 */
public class AspiranteDTO extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String correo;
    private String telefono;
    private ProgramaAcademicoDTO programa;

    public AspiranteDTO() {
        super();
    }

    public AspiranteDTO(String numeroIde, String nombre, String apellido,
                        String correo, String telefono, ProgramaAcademicoDTO programa) {
        super(numeroIde, nombre, apellido);
        this.correo = correo;
        this.telefono = telefono;
        this.programa = programa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ProgramaAcademicoDTO getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaAcademicoDTO programa) {
        this.programa = programa;
    }
}