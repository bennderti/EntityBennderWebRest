/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Categoria;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class GuardarPreferenciasRequest extends UserRequest {
    
    private String emailAdicional;
    private Integer fonoAdicional;
    private Integer IdEstadoCivil;
    private List<Categoria> categoriasSeleccionadas;

    public String getEmailAdicional() {
        return emailAdicional;
    }

    public void setEmailAdicional(String emailAdicional) {
        this.emailAdicional = emailAdicional;
    }

    public Integer getFonoAdicional() {
        return fonoAdicional;
    }

    public void setFonoAdicional(Integer fonoAdicional) {
        this.fonoAdicional = fonoAdicional;
    }

    public Integer getIdEstadoCivil() {
        return IdEstadoCivil;
    }

    public void setIdEstadoCivil(Integer IdEstadoCivil) {
        this.IdEstadoCivil = IdEstadoCivil;
    }

    public List<Categoria> getCategoriasSeleccionadas() {
        return categoriasSeleccionadas;
    }

    public void setCategoriasSeleccionadas(List<Categoria> categoriasSeleccionadas) {
        this.categoriasSeleccionadas = categoriasSeleccionadas;
    }
}
