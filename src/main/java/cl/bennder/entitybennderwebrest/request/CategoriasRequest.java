/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Paginador;

/**
 *
 * @author dyanez
 */
public class CategoriasRequest extends UserRequest {
    private String nombreCategoria;
    private Paginador paginador;

    public CategoriasRequest() {
    }

    public CategoriasRequest(String token) {
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Paginador getPaginador() {
        if(paginador == null){
            paginador = new Paginador();
        }
        return paginador;
    }

    public void setPaginador(Paginador paginador) {
        this.paginador = paginador;
    }

    @Override
    public String toString() {
        return "CategoriasRequest{" + "nombreCategoria=" + nombreCategoria + ", paginador=" + paginador + '}';
    }
    
    
}
