package co.edu.udistrital.converter;

import co.edu.udistrital.dao.ProgramaDAO;
import co.edu.udistrital.model.ProgramaAcademicoDTO;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 * Autor: Thomas Diaz
 */
@FacesConverter("programaConverter")
public class ProgramaConverter implements Converter<ProgramaAcademicoDTO> {

    @Override
    public ProgramaAcademicoDTO getAsObject(FacesContext ctx, UIComponent comp, String value) {
        if (value == null || value.isEmpty()) return null;
        ProgramaDAO dao = new ProgramaDAO();
        for (ProgramaAcademicoDTO p : dao.listar()) {
            if (p.getNombre().equals(value)) return p;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext ctx, UIComponent comp, ProgramaAcademicoDTO value) {
        if (value == null) return "";
        return value.getNombre();
    }
}