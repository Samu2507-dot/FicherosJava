package Fichero;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraPrintWriter {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("informe.txt", true))) {
            //Métodos familiares como System.out
            pw.println("=== Informe de Notas ===");
            pw.println();
            
            //Escribir con formato usando printf
            pw.printf("%-20s %s%n", "Alumno","Nota");
            pw.println("-----------------------");
           
            pw.printf("%-20s %5.2f%n", "Juan Pérez", 8.5);
            pw.printf("%-20s %5.2f%n", "María García", 9.0);
            pw.printf("%-20s %5.2f%n", "Pedro López", 7.5);
            //Escribit diferentes tipos directamente
            pw.println();
            pw.print("Total alumnos");
            pw.println(3);
            pw.print("Nota media:");
            pw.println(8.33);
            
            //Verificar si hubo errores
            if (pw.checkError()) {
                System.err.println("Hubo un error al escribir");
            } else {
                System.out.println("Informe generado correctamente");
            }
        }catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}