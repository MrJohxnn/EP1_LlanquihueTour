/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import utiles.Rut;

/**
 * Registro de personas de Llanquihue Tour.
 * 
 * Almacena datos de cada persona registrada en Llanquihue Tour,
 * tanto clientes como empleados.
 * Hereda información desde clase Direccion y clase Rut.
 * @author Hxru
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private Rut rut;

    /**
     * Construye el registro de la persona con los datos ingresados, heredando Direccion y Rut desde sus respectivas clases.
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param direccion Dirección de la persona.
     * @param rut Rut de la persona.
     */
    public Persona(String nombre, String apellido, Direccion direccion, Rut rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.rut = rut;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona.
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el apellido de la persona.
     * @param apellido Nuevo apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la dirección de la persona, con su estructura correspondiente.
     * @return Dirección de la persona (calle, número, comuna, ciudad).
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección de la persona, con su estructura correspondiente.
     * @param direccion Nueva dirección de la persona (calle, número, comuna, ciudad).
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el rut de la persona, con su estructura correspondiente.
     * @return Rut de la persona (número de rut y dígito verificador).
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Modifica el rut de la persona, con su estructura correspondiente.
     * @param rut Nuevo rut de la persona (número de rut y dígito verificador).
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Entrega una representación textual de los datos de la persona.
     * @return Cadena de texto con los datos ingresados de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", rut=" + rut + '}';
    }
    
    
}
