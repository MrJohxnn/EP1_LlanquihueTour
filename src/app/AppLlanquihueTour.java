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
 * de las clases mediante la creación de objetos Cliente y Empleado.
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
        Direccion direccionC1= new Direccion("Los Alerces", 125, "Puerto Varas", "Puerto Varas");
        Rut rutC1 = new Rut(12345678, '5');
        Cliente cliente1 = new Cliente("Pedro", "Gonzalez", direccionC1, rutC1, "CLI001", true);
        
        // Incorporación de datos de segunda persona, para un empleado
        Direccion direccionE1= new Direccion("San Francisco", 450, "Puerto Varas", "Puerto Varas");
        Rut rutE1 = new Rut(87654321, '4');
        Empleado empleado1 = new Empleado("Juan", "Perez", direccionE1, rutE1, "EMP001", "Chofer", 850000);
        
        System.out.println("--------Nuevo registro--------");
        System.out.println(cliente1);
        System.out.println("\n--------Nuevo registro--------");
        System.out.println(empleado1);
        
        
        // Datos para probar nuevos ingresos (eliminar /* para probar)
        /*
        System.out.println("\n--------Nuevo registro--------");
        // Incorporación de los datos de luna tercera persona, para un cliente
        Direccion direccionC2= new Direccion("Las Acacias", 307, "Frutillar", "Frutillar");
        Rut rutC2 = new Rut(11222333, 'k');
        Cliente cliente2 = new Cliente("Pablo", "Marmol", direccionC2, rutC2, "CLI002", true);
        
        // Incorporación de datos de segunda persona, para un empleado
        System.out.println("\n--------Nuevo registro--------");
        Direccion direccionE2= new Direccion("Lago Llanquihue", 660, "Puerto Varas", "Puerto Varas");
        Rut rutE2 = new Rut(44555666, 'K');
        Empleado empleado2 = new Empleado("Jaime", "Zuniga", direccionE2, rutE2, "EMP002", "Chofer", 850000);
        
        System.out.println(cliente2);
        System.out.println(empleado2);
        */
    }
}
