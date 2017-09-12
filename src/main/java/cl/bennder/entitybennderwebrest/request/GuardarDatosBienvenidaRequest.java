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
public class GuardarDatosBienvenidaRequest extends UserRequest{
    
    List<Integer> listaCategoriasSelec;

    public List<Integer> getListaCategoriasSelec() {
        return listaCategoriasSelec;
    }

    public void setListaCategoriasSelec(List<Integer> listaCategoriasSelec) {
        this.listaCategoriasSelec = listaCategoriasSelec;
    }
}
