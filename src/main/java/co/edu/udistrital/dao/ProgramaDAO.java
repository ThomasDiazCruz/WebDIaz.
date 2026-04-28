package co.edu.udistrital.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.udistrital.model.ProgramaAcademicoDTO;

/**
 * Autor: Thomas Diaz
 */
public class ProgramaDAO {

    private static List<ProgramaAcademicoDTO> listaProgramas = new ArrayList<>();

    static {
        listaProgramas.add(new ProgramaAcademicoDTO(1, "Ingeniería de Sistemas"));
        listaProgramas.add(new ProgramaAcademicoDTO(2, "Ingeniería Industrial"));
        listaProgramas.add(new ProgramaAcademicoDTO(3, "Matemática"));
        listaProgramas.add(new ProgramaAcademicoDTO(4, "Administración de Empresas"));
        listaProgramas.add(new ProgramaAcademicoDTO(5, "Derecho"));
        listaProgramas.add(new ProgramaAcademicoDTO(6, "Ingeniería Telemática"));
    }

    public List<ProgramaAcademicoDTO> listar() {
        return listaProgramas;
    }

    public ProgramaAcademicoDTO buscarPorId(int id) {
        for (ProgramaAcademicoDTO p : listaProgramas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}