/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamiento = new AlmacenamientoNube();
        GestorArchivos gestor = new GestorArchivos(almacenamiento);
        System.out.println("Almacenamiento Nube");
        gestor.guardar("Valentina_Zuñiga_nube.txt", "Trabajo de valentina de POO");
        System.out.println(gestor.recuperar("Valentina_Zuñiga.txt"));
        System.out.println("");
        
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        System.out.println("Almacenamiento Local");
        gestorLocal.guardar("Valentina_Zuñiga_local.txt", "Trabajos");
        System.out.println(gestorLocal.recuperar("Valentina_Zuñiga_local.txt"));
    }
}

