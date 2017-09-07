/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;


import cl.bennder.entitybennderwebrest.model.Beneficio;
import cl.bennder.entitybennderwebrest.model.Categoria;
import cl.bennder.entitybennderwebrest.model.Paginador;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dyanez
 */
public class CategoriaResponse extends ValidacionResponse implements Serializable{
    //private Validacion validacion;
    private List<Categoria> categoriasRelacionadas;
    private List<Beneficio> beneficios;
    private Categoria categoriaPadre;
    private Map<String,Set<String>> filtros;
    private Map<String, Integer> rango;
    private Paginador paginador;

    public CategoriaResponse() {
    }

    public CategoriaResponse(Validacion validacion, List<Categoria> categoriasRelacionadas, List<Beneficio> beneficios) {
        super(validacion);
        this.categoriasRelacionadas = categoriasRelacionadas;
        this.beneficios = beneficios;
    }

    public List<Categoria> getCategoriasRelacionadas() {
        return categoriasRelacionadas;
    }

    public void setCategoriasRelacionadas(List<Categoria> categoriasRelacionadas) {
        this.categoriasRelacionadas = categoriasRelacionadas;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public Map<String, Set<String>> getFiltros() {
        return filtros;
    }

    public void setFiltros(Map<String, Set<String>> filtros) {
        this.filtros = filtros;
    }

    public Map<String, Integer> getRango() {
        return rango;
    }

    public void setRango(Map<String, Integer> rango) {
        this.rango = rango;
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
    
}
