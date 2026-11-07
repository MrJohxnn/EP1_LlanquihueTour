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
public class Empleado extends Persona {
    private String codigoEmpleado;
    private String cargo;
    private int sueldo;

    public Empleado(String nombre, String apellido, Direccion direccion, Rut rut, String codigoEmpleado, String cargo, int sueldo) {
        super(nombre, apellido, direccion, rut);
        
        this.codigoEmpleado= codigoEmpleado;
        this.cargo= cargo;
        this.sueldo= sueldo;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" + "codigoEmpleado=" + codigoEmpleado + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
    
}
