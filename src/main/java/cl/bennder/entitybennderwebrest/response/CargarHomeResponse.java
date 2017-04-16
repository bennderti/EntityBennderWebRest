/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Anuncio;
import cl.bennder.entitybennderwebrest.model.Beneficio;
import cl.bennder.entitybennderwebrest.model.Categoria;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class CargarHomeResponse extends ValidacionResponse{
 
    List<Categoria> categorias;
    List<Anuncio> anuncios;
    List<Beneficio> beneficiosDestacados;
    List<Beneficio> beneficiosVisitados;
    List<Beneficio> beneficiosNuevos;

    public CargarHomeResponse() {
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public List<Beneficio> getBeneficiosDestacados() {
        return beneficiosDestacados;
    }

    public void setBeneficiosDestacados(List<Beneficio> beneficiosDestacados) {
        this.beneficiosDestacados = beneficiosDestacados;
    }

    public List<Beneficio> getBeneficiosVisitados() {
        return beneficiosVisitados;
    }

    public void setBeneficiosVisitados(List<Beneficio> beneficiosVisitados) {
        this.beneficiosVisitados = beneficiosVisitados;
    }

    public List<Beneficio> getBeneficiosNuevos() {
        return beneficiosNuevos;
    }

    public void setBeneficiosNuevos(List<Beneficio> beneficiosNuevos) {
        this.beneficiosNuevos = beneficiosNuevos;
    }
    
    
}