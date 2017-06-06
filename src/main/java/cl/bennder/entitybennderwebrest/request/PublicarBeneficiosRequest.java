/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import java.util.List;

/**
 *
 * @author Marcos
 */
public class PublicarBeneficiosRequest extends UserRequest{
    
    private List<Integer> listaIdBeneficios;

    public List<Integer> getListaIdBeneficios() {
        return listaIdBeneficios;
    }

    public void setListaIdBeneficios(List<Integer> listaIdBeneficios) {
        this.listaIdBeneficios = listaIdBeneficios;
    }  
}
