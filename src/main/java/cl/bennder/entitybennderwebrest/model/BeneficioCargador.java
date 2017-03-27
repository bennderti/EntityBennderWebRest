/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author dyanez
 */
public class BeneficioCargador {
    private Integer idBeneficio;
    private String titulo;

    public BeneficioCargador() {
    }

    public BeneficioCargador(Integer idBeneficio, String titulo) {
        this.idBeneficio = idBeneficio;
        this.titulo = titulo;
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "BeneficioCargador{" + "idBeneficio=" + idBeneficio + ", titulo=" + titulo + '}';
    }
    
}
