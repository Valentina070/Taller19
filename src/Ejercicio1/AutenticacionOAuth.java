/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class AutenticacionOAuth implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Procesando autenticacion con OAuth...");
        return "Usuario".equals(usuario) && "holis07".equals(contraseña);
    }
    
}
