/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        GeneradorReporte generadorPDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(generadorPDF);
        System.out.println("Generando reporte PDF:");
        gestorPDF.procesarReporte("Actividad matematicas de Valentina Zuñiga en PFD");

        GeneradorReporte generadorExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(generadorExcel);
        System.out.println("\nGenerando reporte Excel:");
        gestorExcel.procesarReporte("Actividad matematicas de Valentina Zuñiga en Excel");
    }
}

