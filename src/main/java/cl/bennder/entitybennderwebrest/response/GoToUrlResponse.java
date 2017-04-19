/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Validacion;

/**
 *
 * @author dyanez
 */
public class GoToUrlResponse extends ValidacionResponse{
    private String goToUrl;

    public GoToUrlResponse() {
    }

    public GoToUrlResponse(String goToUrl) {
        this.goToUrl = goToUrl;
    }

    public GoToUrlResponse(String goToUrl, Validacion validacion) {
        super(validacion);
        this.goToUrl = goToUrl;
    }

    public String getGoToUrl() {
        return goToUrl;
    }

    public void setGoToUrl(String goToUrl) {
        this.goToUrl = goToUrl;
    }
    
}
