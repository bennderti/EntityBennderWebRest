/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Beneficio;
import cl.bennder.entitybennderwebrest.model.Paginador;
import java.util.List;

/**
 *
 * @author ext_dayanez
 */
public class PaginadorBeneficioResponse extends ValidacionResponse{
    private Paginador paginador;
    private List<Beneficio> beneficios;

    public PaginadorBeneficioResponse() {
    }

    public PaginadorBeneficioResponse(Paginador paginador, List<Beneficio> beneficios) {
        this.paginador = paginador;
        this.beneficios = beneficios;
    }

    public Paginador getPaginador() {
        return paginador;
    }

    public void setPaginador(Paginador paginador) {
        this.paginador = paginador;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }
    
}
