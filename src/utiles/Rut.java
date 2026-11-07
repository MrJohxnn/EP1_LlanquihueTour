/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

/**
 *
 * @author Hxru
 */
public class Rut {
    private int numero;
    private char dVerificador;

    public Rut(int numero, char dVerificador) {
        this.numero = numero;
        this.dVerificador = dVerificador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getdVerificador() {
        return dVerificador;
    }

    public void setdVerificador(char dVerificador) {
        this.dVerificador = dVerificador;
    }

    @Override
    public String toString() {
        return numero + "-" + dVerificador;
    }
    
}
