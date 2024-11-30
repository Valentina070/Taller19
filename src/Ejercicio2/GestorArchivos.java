/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class GestorArchivos {
 private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }
}

