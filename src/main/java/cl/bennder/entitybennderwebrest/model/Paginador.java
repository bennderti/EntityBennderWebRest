/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author ext_dayanez
 */
public class Paginador {
    private Integer total;
    private Integer indicePagina;
    private Integer cantidadPagina;

    public Paginador() {
        this.indicePagina = 0;
        this.cantidadPagina = 5;
    }

    public Paginador(Integer total, Integer indicePagina, Integer cantidadPagina) {
        this.total = total;
        this.indicePagina = indicePagina;
        this.cantidadPagina = cantidadPagina;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getIndicePagina() {
        return indicePagina;
    }

    public void setIndicePagina(Integer indicePagina) {
        this.indicePagina = indicePagina;
    }

    public Integer getCantidadPagina() {
        return cantidadPagina;
    }

    public void setCantidadPagina(Integer cantidadPagina) {
        this.cantidadPagina = cantidadPagina;
    }

    @Override
    public String toString() {
        return "Paginador{" + "total=" + total + ", indicePagina=" + indicePagina + ", cantidadPagina=" + cantidadPagina + '}';
    }
    
}
