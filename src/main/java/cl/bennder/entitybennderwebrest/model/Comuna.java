/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author Marcos
 */
public class Comuna {
    
    private Integer idComuna;
    private String nombre;
    private Region region;
    
    public Comuna(){
        
    } 

    public Integer getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegion() {
        if(region == null){
            region =  new Region();
        }
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComuna=" + idComuna + ", nombre=" + nombre + ", region=" + region + '}';
    }
    
}
