/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Persona;

/**
 *
 * @author Hxru
 */
public class GestionPersonas{
    private ArrayList<Persona> personas;
    
    public GestionPersonas(){
        personas = new ArrayList<>();
    }
    
    public boolean agregarPersona(Persona persona){
        if(persona == null || persona.getRut() == null){
            return false;
        }
        
        if(!persona.getRut().esValido()){
            System.out.println("Error: el Rut ingresado no es válido");
            return false;
        }
        
        String rut = persona.getRut().toString();
        
        if(buscarPorRut(rut) != null){
            System.out.println("Error: el Rut ya se encuentra registrado");
            return false;
        }
        personas.add(persona);
        return true;
    }
    
    public void mostrarPersonas(){
        if(personas.isEmpty()){
            System.out.println("No existen personas registradas.");
            return;
        }
        
        for(Persona persona : personas){
            System.out.println(persona);
            System.out.println("---------------------------");
        }
    }
    
    public Persona buscarPorRut(String rutBuscado){
        for(Persona persona : personas){
            if(persona.getRut().toString().equalsIgnoreCase(rutBuscado)){
                return persona;
            }
        }
        
        return null;
    }
}
