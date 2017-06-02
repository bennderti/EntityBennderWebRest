/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Categoria;
import cl.bennder.entitybennderwebrest.model.Comuna;
import cl.bennder.entitybennderwebrest.model.ImagenGenerica;
import cl.bennder.entitybennderwebrest.model.Region;
import cl.bennder.entitybennderwebrest.model.SucursalProveedor;
import cl.bennder.entitybennderwebrest.model.Validacion;
import cl.bennder.entitybennderwebrest.request.InfoBeneficioRequest;
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
    private List<Region> regionesSucursal;
    private List<Comuna> comunasSucursales;
    private InfoBeneficioRequest datosBeneficio;
    private Integer maxImagenes;
    public InfoInicioBeneficioResponse() {
        this.maxImagenes = 4;
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

    public List<Region> getRegionesSucursal() {
        return regionesSucursal;
    }

    public void setRegionesSucursal(List<Region> regionesSucursal) {
        this.regionesSucursal = regionesSucursal;
    }

    public List<Comuna> getComunasSucursales() {
        return comunasSucursales;
    }

    public void setComunasSucursales(List<Comuna> comunasSucursales) {
        this.comunasSucursales = comunasSucursales;
    }

    public InfoBeneficioRequest getDatosBeneficio() {
        return datosBeneficio;
    }

    public void setDatosBeneficio(InfoBeneficioRequest datosBeneficio) {
        this.datosBeneficio = datosBeneficio;
    }

    public Integer getMaxImagenes() {
        return maxImagenes;
    }

    public void setMaxImagenes(Integer maxImagenes) {
        this.maxImagenes = maxImagenes;
    }
    
    
}
