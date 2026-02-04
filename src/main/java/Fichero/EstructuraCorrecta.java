package Fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EstructuraCorrecta {
    public static void main(String[] args) {
        
        try (BufferedWriter contenido = new BufferedWriter(new FileWriter("alumnos.txt"))){
            contenido.write("Juan Pérez");
            contenido.newLine();
            contenido.write("María García");
            contenido.newLine();
            contenido.write("Pedro López");
            contenido.newLine();
            
            System.out.println("Fichero creado correctamente");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }   
    }
}