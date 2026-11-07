/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

/**
 * Rut de personas registradas en Llanquihue Tour.
 * 
 * Almacena rut de clientes y empleados,
 * incluyendo dígito verificador.
 * 
 * @author Hxru
 */
public class Rut {
    private int numero;
    private char dVerificador;

    /**
     * Construye la estructura del rut de la persona con los datos proporcionados
     * @param numero Rut de la persona sin dígito verificador
     * @param dVerificador Dígito verificador del rut de la persona
     */
    public Rut(int numero, char dVerificador) {
        this.numero = numero;
        this.dVerificador = dVerificador;
    }

    /**
     * Obtiene el número de rut sin dígito verificador de la persona.
     * @return Rut sin dígito verificador.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Modifica el número de rut sin dígito verificador de la persona.
     * @param numero Nuevo número de rut sin digito verificador.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el dígito verificador del rut de la persona.
     * @return Dígito verificador del rut de la persona.
     */
    public char getdVerificador() {
        return dVerificador;
    }

    /**
     * Modifica el dígito verificador del rut de la persona.
     * @param dVerificador Nuevo digitio verificador de rut de la persona.
     */
    public void setdVerificador(char dVerificador) {
        this.dVerificador = dVerificador;
    }

    /**
     * Entrega una representación visual del rut de la persona.
     * @return concatenación de rut y dígito verificador, separado por un guión medio.
     */
    @Override
    public String toString() {
        return numero + "-" + dVerificador;
    }
    
}
