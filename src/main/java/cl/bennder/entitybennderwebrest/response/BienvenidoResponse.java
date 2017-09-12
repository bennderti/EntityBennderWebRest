/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import java.io.Serializable;
import java.util.List;

import cl.bennder.entitybennderwebrest.model.Categoria;

/**
 *
 * @author Marcos
 */
public class BienvenidoResponse extends ValidacionResponse implements Serializable{
    
    private List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }   
}
