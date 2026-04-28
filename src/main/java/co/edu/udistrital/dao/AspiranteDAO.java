package co.edu.udistrital.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.udistrital.model.AspiranteDTO;

/**
 * Autor: Thomas Diaz
 */
public class AspiranteDAO {

    private static List<AspiranteDTO> listaAspirantes = new ArrayList<>();

    public void guardar(AspiranteDTO aspirante) {
        listaAspirantes.add(aspirante);
    }

    public List<AspiranteDTO> listar() {
        return listaAspirantes;
    }
}