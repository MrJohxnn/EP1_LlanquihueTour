/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import utiles.Rut;

/**
 * Registro de clientes de Llanguihue Tour.
 * 
 * Hereda datos desde clase persona,
 * y almacena código de cliente y si es un cliente habitual.
 * @author Hxru
 */
public class Cliente extends Persona {
    private String codigoCliente; //Identifica al cliente.
    private boolean clienteFrecuente; // indica si es cliente habitual.
    
    /**
     * Construye la estructura para registro de cliente, heredando datos desde clase Persona.
     * @param nombre Nombre de cliente.
     * @param apellido Apellido de cliente.
     * @param direccion Dirección de clienre.
     * @param rut Rut de cliente.
     * @param codigoCliente Código de cliente.
     * @param clienteFrecuente Indica si es cliente frecuente o no (true o false).
     */
    public Cliente(String nombre, String apellido, Direccion direccion, Rut rut, String codigoCliente, boolean clienteFrecuente) {
        super(nombre, apellido, direccion, rut);
        
        this.codigoCliente= codigoCliente;
        this.clienteFrecuente= clienteFrecuente;
    }

    /**
     * Obtiene el código de cliente.
     * @return Código de cliente
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Modifica el código de cliente.
     * @param codigoCliente Nuevo código de cliente.
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene indicacion de cliente frecuente
     * @return indicación de cliente frecuente
     */
    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    /**
     * Modifica la indicación de cliente frecuente.
     * @param clienteFrecuente Nueva indicación de cliente frecuente.
     */
    public void setClienteFrecuente(boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }
    
    /**
     * Entrega una representación textual de la información del cliente
     * @return Cadena de texto con datos de cliente (código de cliente y cliente frecuente)
     */
    @Override
    public String toString(){
        return super.toString() + ", codigoCliente=" + codigoCliente + ". clienteFrecuente=" + clienteFrecuente;
    }
}
