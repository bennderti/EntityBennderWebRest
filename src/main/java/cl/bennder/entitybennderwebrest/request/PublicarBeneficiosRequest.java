/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Beneficio;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class PublicarBeneficiosRequest extends UserRequest{
    
    private List<Beneficio> listaBeneficios;

    public List<Beneficio> getListaBeneficios() {
        return listaBeneficios;
    }

    public void setListaBeneficios(List<Beneficio> listaBeneficios) {
        this.listaBeneficios = listaBeneficios;
    }  
}
