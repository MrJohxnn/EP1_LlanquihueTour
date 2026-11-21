/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Hxru
 */
public class CargarPersonas {
    public void cargarArchivo(String ruta){
        try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
            
            String linea;
            
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }
        catch(IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
