/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.ImagenGenerica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class UploadImagenesGenericaRequest extends UserRequest{
    private List<ImagenGenerica> imagenes;

    public UploadImagenesGenericaRequest() {
    }

    public UploadImagenesGenericaRequest(List<ImagenGenerica> imagenes) {
        this.imagenes = imagenes;
    }

    public UploadImagenesGenericaRequest(List<ImagenGenerica> imagenes , String token) {
        super(token);
        this.imagenes = imagenes;
    }

    public List<ImagenGenerica> getImagenes() {
        if(imagenes == null){
            imagenes = new ArrayList<>();
        }
        return imagenes;
    }

    public void setImagenes(List<ImagenGenerica> imagenes) {
        this.imagenes = imagenes;
    }
    
    
}
