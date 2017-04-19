/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

/**
 *
 * @author dyanez
 */
public class SubCategoriaProveedorRequest extends UserRequest{
    private Integer idProveedor;
    private Integer idCategoria;

    public SubCategoriaProveedorRequest() {
    }

    public SubCategoriaProveedorRequest(Integer idCategoria, Integer idProveedor) {
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    public SubCategoriaProveedorRequest(Integer idProveedor, Integer idCategoria, Integer idUsuario) {
        super(idUsuario);
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "SubCategoriaProveedorRequest{" + "idProveedor=" + idProveedor + ", idCategoria=" + idCategoria + '}';
    }
    
}
