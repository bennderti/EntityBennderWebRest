/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Categoria;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class SubCategoriaProveedorResponse extends ValidacionResponse{
    private List<Categoria> subCategorias;

    public SubCategoriaProveedorResponse() {
    }

    public SubCategoriaProveedorResponse(List<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

    public SubCategoriaProveedorResponse(List<Categoria> subCategorias, Validacion validacion) {
        super(validacion);
        this.subCategorias = subCategorias;
    }

    public List<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
    
}
