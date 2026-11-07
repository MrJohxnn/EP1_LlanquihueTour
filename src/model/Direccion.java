/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Dirección usada por las personas
 * registradas en la agencia Llanquihue Tour.
 * 
 * Almacenando calle, número, comuna y ciudad.
 *
 * @author Hxru
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;
    
    /**
     * Construye una dirección con los datos proporcionados
     * 
     * @param calle Nombre de la calle donde se ubica la residencia
     * @param numero número de la residencia
     * @param comuna Comuna donde se ubica la residencia
     * @param ciudad Ciudad donde se ubica la residencia
     */
    public Direccion(String calle, int numero, String comuna, String ciudad){
        this.calle= calle;
        this.numero= numero;
        this.comuna= comuna;
        this.ciudad= ciudad;
    }
    
    /**
     * Obtiene el nombre de la calle.
     * @return Nombe de la calle de residencia.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica el nombre de la calle.
     * @param calle Nuevo nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene número de la residencia.
     * @return  Número de la residencia.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Modifica el número de la residencia.
     * @param numero  nuevo número de la residencia.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el nombre de la comuna de residencia.
     * @return Nombre de la comuna de residencia.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Modifica el nombre de la comuna de residencia.
     * @param comuna Nuevo nombre de comuna de residencia.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la ciudad de residencia.
     * @return Nombre de ciudad de residencia.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica el nombre de la ciudad de residencia.
     * @param ciudad Nuevo nombre de ciudad de residencia.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Entrega una representación textual de la dirección.
     * @return Cadena de texto con los datos ingresados de la dirección.
     */
    @Override
    public String toString() {
        return "calle: " + calle + ", numero: " + numero + ", comuna: " + comuna + ", ciudad: " + ciudad;
    }
    
}
