/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Proveedor;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class ProveedoresResponse extends ValidacionResponse{

    private List<Proveedor> proveedores;
    public ProveedoresResponse() {
    }

    public ProveedoresResponse(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public ProveedoresResponse(List<Proveedor> proveedores, Validacion validacion) {
        super(validacion);
        this.proveedores = proveedores;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
}
