/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.BeneficioImagen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class UploadBeneficioImagenRequest implements Serializable{
    private List<BeneficioImagen> beneficioImagenes;

    public UploadBeneficioImagenRequest() {
    }

    public UploadBeneficioImagenRequest(List<BeneficioImagen> beneficioImagenes) {
        this.beneficioImagenes = beneficioImagenes;
    }

    public List<BeneficioImagen> getBeneficioImagenes() {
        if(this.beneficioImagenes == null){
            this.beneficioImagenes = new ArrayList<>();
        }
        return beneficioImagenes;
    }

    public void setBeneficioImagenes(List<BeneficioImagen> beneficioImagenes) {
        
        this.beneficioImagenes = beneficioImagenes;
    }
    
}
