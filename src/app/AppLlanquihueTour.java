/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Cliente;
import model.Empleado;
import model.Direccion;
import utiles.Rut;

/**
 * Clase principal de la app Llanquihue Tour.
 * 
 * Permite ejecutar el programa y comprobar el funcionamiento
 * de las clases mediante la creación de objetos CLiente y Empleado.
 * 
 * Se utilizan los objetos Direccion y Rut asociados a cada persona,
 * demostrando los conceptos deherencia y composición.
 * 
 * @author Hxru
 * @version 1.0
 */
public class AppLlanquihueTour {
    /**
     * Punto de entrada principal de la aplicación.
     * 
     * Crea objetos de tipo Direccion y Rut para registrar
     * los datos de un cliente o un empleado.
     * 
     * Posteriormente, muestra sus datos en consola
     * utilizando los métodos toString().
     * 
     * @param args Argumentos recibos desde la línea de comandos.
     */
    public static void main(String[] args){
        // Incorporación de los datos de la primera persona, en este caso, un cliente
        Direccion direccionC= new Direccion("Los Alerces", 125, "Puerto Varas", "Puerto Varas");
        Rut rutC = new Rut(12345678, '5');
        Cliente cliente1 = new Cliente("Pedro", "Gonzalez", direccionC, rutC, "CLI001", true);
        
        // Incorporación de datos de segunda persona, para un empleado
        Direccion direccionE= new Direccion("San Francisco", 450, "Puerto Varas", "Puerto Varas");
        Rut rutE = new Rut(87654321, '4');
        Empleado empleado1 = new Empleado("Juan", "Perez", direccionE, rutE, "EMP001", "Chofer", 850000);
        
        System.out.println(cliente1);
        System.out.println(empleado1);
    }
}
