/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Categoria;
import cl.bennder.entitybennderwebrest.model.ImagenGenerica;
import cl.bennder.entitybennderwebrest.model.SucursalProveedor;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class InfoInicioBeneficioResponse extends ValidacionResponse{
    private List<Categoria> categorias;
    private List<SucursalProveedor> sucursales;
    private List<ImagenGenerica> imgenesGenericas;
    public InfoInicioBeneficioResponse() {
    }

    public InfoInicioBeneficioResponse(List<Categoria> categorias, List<SucursalProveedor> sucursales, List<ImagenGenerica> imgenesGenericas) {
        this.categorias = categorias;
        this.sucursales = sucursales;
        this.imgenesGenericas = imgenesGenericas;
    }

    public InfoInicioBeneficioResponse(List<Categoria> categorias, List<SucursalProveedor> sucursales, List<ImagenGenerica> imgenesGenericas, Validacion validacion) {
        super(validacion);
        this.categorias = categorias;
        this.sucursales = sucursales;
        this.imgenesGenericas = imgenesGenericas;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<SucursalProveedor> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<SucursalProveedor> sucursales) {
        this.sucursales = sucursales;
    }

    public List<ImagenGenerica> getImgenesGenericas() {
        if(imgenesGenericas == null){
            imgenesGenericas = new ArrayList<>();
        }
        return imgenesGenericas;
    }

    public void setImgenesGenericas(List<ImagenGenerica> imgenesGenericas) {
        this.imgenesGenericas = imgenesGenericas;
    }
    
    
}
