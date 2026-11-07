/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hxru
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;
    
    //Constructor
    public Direccion(String calle, int numero, String comuna, String ciudad){
        this.calle= calle;
        this.numero= numero;
        this.comuna= comuna;
        this.ciudad= ciudad;
    }
}
