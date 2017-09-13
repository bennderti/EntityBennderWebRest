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
public class CategoriaByIdRequest extends UserRequest {
    private Integer idCategoria;
    private Paginador paginador;

    public CategoriaByIdRequest() {
    }

    public CategoriaByIdRequest(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Paginador getPaginador() {
        if(paginador == null){
            this.paginador = new Paginador();
        }
        return paginador;
    }

    public void setPaginador(Paginador paginador) {
        this.paginador = paginador;
    }
    
}
