/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;



import cl.bennder.entitybennderwebrest.model.Beneficio;
import cl.bennder.entitybennderwebrest.model.BeneficioCargador;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Diego
 */
public class BeneficiosCargadorResponse extends ValidacionResponse implements Serializable{
    private List<BeneficioCargador> beneficios;

    public BeneficiosCargadorResponse() {
    }

    public BeneficiosCargadorResponse(List<BeneficioCargador> beneficios) {
        this.beneficios = beneficios;
    }

    public BeneficiosCargadorResponse(List<BeneficioCargador> beneficios, Validacion validacion) {
        super(validacion);
        this.beneficios = beneficios;
    }

    public List<BeneficioCargador> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<BeneficioCargador> beneficios) {
        this.beneficios = beneficios;
    }
    
    
    
    
    
}
