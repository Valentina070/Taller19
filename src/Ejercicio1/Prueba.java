/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        ServicioAutenticacion autenticacion = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(autenticacion);
        System.out.println(gestor.ingresar("Usuario", "7777"));
    }
}

