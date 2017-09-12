/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;



import cl.bennder.entitybennderwebrest.model.Beneficio;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Diego
 */
public class BeneficiosResponse extends ValidacionResponse implements Serializable{
    private List<Beneficio> beneficios;

    public BeneficiosResponse() {
    }

    public List<Beneficio> getBeneficios() {
        if(beneficios == null){
            this.beneficios = new ArrayList<>();
        }
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "BeneficiosResponse{" + "validacion=" + getValidacion() + ", beneficios=" + beneficios + '}';
    }
    
}
