/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Categoria;
import java.util.List;

/**
 * Lista todas laas categorias y subcategorias con datos simples
 * @author dyanez
 */
public class GetTodasCategoriaResponse extends ValidacionResponse{
    private List<Categoria> categorias;

    public GetTodasCategoriaResponse() {
    }

    public GetTodasCategoriaResponse(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
}
