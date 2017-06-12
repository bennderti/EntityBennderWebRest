/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Validacion;

import java.io.Serializable;

/**
 * @author dyanez
 */
public class LoginResponse extends ValidacionResponse implements Serializable {
    private Integer idUsuario;//rut sin dv
    private Integer idEstadoUsuario;
    private String token;
    private boolean esPasswordTemporal;

    public LoginResponse(Integer idUsuario) {
        this.idUsuario = idUsuario;
        this.esPasswordTemporal = false;
    }

    public LoginResponse(Integer idUsuario, Validacion validacion) {
        super(validacion);
        this.idUsuario = idUsuario;
        this.esPasswordTemporal = false;
    }

    public LoginResponse() {
        this.esPasswordTemporal = false;
    }

    public LoginResponse(String token) {
        this.token = token;
        this.esPasswordTemporal = false;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "LoginResponse{" + "idUsuario=" + idUsuario + ", esPasswordTemporal=" + esPasswordTemporal + '}';
    }

    

    public Integer getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(Integer idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isEsPasswordTemporal() {
        return esPasswordTemporal;
    }

    public void setEsPasswordTemporal(boolean esPasswordTemporal) {
        this.esPasswordTemporal = esPasswordTemporal;
    }
    
}
