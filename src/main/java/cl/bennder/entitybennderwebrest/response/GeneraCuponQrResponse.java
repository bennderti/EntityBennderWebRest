/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

/**
 *
 * @author dyanez
 */
public class GeneraCuponQrResponse extends ValidacionResponse{
    private byte[] cuponPdf;

    public GeneraCuponQrResponse() {
    }

    public GeneraCuponQrResponse(byte[] cuponPdf) {
        this.cuponPdf = cuponPdf;
    }

    public byte[] getCuponPdf() {
        return cuponPdf;
    }

    public void setCuponPdf(byte[] cuponPdf) {
        this.cuponPdf = cuponPdf;
    }
    
}
