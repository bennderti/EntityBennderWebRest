/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import java.io.Serializable;

/**
 *
 * @author dyanez
 */
public class CategoriasRequest extends UserRequest {
    private String nombreCategoria;

    public CategoriasRequest(String token) {
        super(token);
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
