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
public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private Rut rut;

    public Persona(String nombre, String apellido, Direccion direccion, Rut rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", rut=" + rut + '}';
    }
    
    
}
