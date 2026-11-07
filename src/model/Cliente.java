/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import utiles.Rut;

/**
 *
 * @author Hxru
 */
public class Cliente extends Persona {
    
    private String codigoCliente; //Identifica al cliente
    private boolean clienteFrecuente; // indica si es cliente habitual
    
    public Cliente(String nombre, String apellido, Direccion direccion, Rut rut, String codigoCliente, boolean clienteFrecuente) {
        super(nombre, apellido, direccion, rut);
        
        this.codigoCliente= codigoCliente;
        this.clienteFrecuente= clienteFrecuente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", codigoCliente=" + codigoCliente + ". clienteFrecuente=" + clienteFrecuente;
    }
}
