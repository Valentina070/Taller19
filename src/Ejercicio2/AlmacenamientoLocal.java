/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombre, String contenido) {
       System.out.println("Guardando archivo: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido del archivo: " + nombre;
}
}