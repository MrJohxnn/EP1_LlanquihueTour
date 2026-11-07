/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import utiles.Rut;

/**
 * Registro de Empleados de Llanquihue Tour.
 * 
 * Hereda datos desde clase Persona,
 * y almacena Código de empleado, Cargo y Sueldo.
 * @author Hxru
 */
public class Empleado extends Persona {
    private String codigoEmpleado;
    private String cargo;
    private int sueldo;

    /**
     * Construye la estructura para registro de empleado, heredando datos desde clase Persona.
     * @param nombre Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param direccion Dirección del empleado.
     * @param rut Rut del empleado.
     * @param codigoEmpleado Código de empleado.
     * @param cargo Cargo del empleado.
     * @param sueldo Sueldo del empleado.
     */
    public Empleado(String nombre, String apellido, Direccion direccion, Rut rut, String codigoEmpleado, String cargo, int sueldo) {
        super(nombre, apellido, direccion, rut);
        
        this.codigoEmpleado= codigoEmpleado;
        this.cargo= cargo;
        this.sueldo= sueldo;
    }

    /**
     * Obtiene el código del empleado.
     * @return Código del empleado.
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Modifica el código del empleado.
     * @param codigoEmpleado Nuevo código de empleado.
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Obtiene el cargo del empleado.
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Modifica el cargo del empleado.
     * @param cargo Nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el sueldo del empleado.
     * @return Sueldo del empleado.
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Modifica el sueldo del empleado.
     * @param sueldo Nuevo sueldo del empleado.
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Entrega una representación visual de los datos ingresados.
     * @return Cadena de texto con los datos del empleado ingresados.
     */
    @Override
    public String toString() {
        return "- Empleado - \n" + super.toString() + "\n Codigo Empleado: " + codigoEmpleado + "\n Cargo: " + cargo + "\n Sueldo: $" + sueldo;
    }
}
