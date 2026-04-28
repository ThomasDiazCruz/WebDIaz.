package co.edu.udistrital.bean;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;

import co.edu.udistrital.dao.AspiranteDAO;
import co.edu.udistrital.dao.ProgramaDAO;
import co.edu.udistrital.model.AspiranteDTO;
import co.edu.udistrital.model.ProgramaAcademicoDTO;

/**
 * Autor: Thomas Diaz
 * Bean controlador de aspirantes.
 * Corregido para Jakarta EE 10 (Arquitectura de Computadores 2026).
 */
@Named(value = "aspiranteBean")
@ViewScoped
public class AspiranteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private AspiranteDTO aspirante;
    private List<AspiranteDTO> listaAspirantes;
    private List<ProgramaAcademicoDTO> listaProgramas;

    private AspiranteDAO aspiranteDAO;
    private ProgramaDAO programaDAO;

    @PostConstruct
    public void init() {
        // Inicialización de los objetos de datos
        aspirante = new AspiranteDTO();
        aspiranteDAO = new AspiranteDAO();
        programaDAO = new ProgramaDAO();
        
        // Carga de listas iniciales
        try {
            listaAspirantes = aspiranteDAO.listar();
            listaProgramas = programaDAO.listar();
        } catch (Exception e) {
            System.err.println("Error al cargar datos en AspiranteBean: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Registra un nuevo aspirante y redirige a la lista.
     * @return Ruta de redirección
     */
    public String registrar() {
        try {
            aspiranteDAO.guardar(aspirante);
            // Limpiar el objeto para un nuevo registro si fuera necesario
            aspirante = new AspiranteDTO();
            // Refrescar la lista de la memoria
            listaAspirantes = aspiranteDAO.listar(); 
            return "/aspirante/lista.xhtml?faces-redirect=true";
        } catch (Exception e) {
            System.err.println("Error al registrar aspirante: " + e.getMessage());
            return null; // Se mantiene en la misma página si hay error
        }
    }

    // --- Getters y Setters ---

    public AspiranteDTO getAspirante() {
        return aspirante;
    }

    public void setAspirante(AspiranteDTO aspirante) {
        this.aspirante = aspirante;
    }

    public List<AspiranteDTO> getListaAspirantes() {
        return listaAspirantes;
    }

    public List<ProgramaAcademicoDTO> getListaProgramas() {
        return listaProgramas;
    }
}