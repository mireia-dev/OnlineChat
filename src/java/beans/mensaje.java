/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.*;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */
public class mensaje {
    private String destinatario;
    private String remitente;
    private String texto;

    public mensaje(String destinatario, String remitente, String texto) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.texto = texto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
 
}
