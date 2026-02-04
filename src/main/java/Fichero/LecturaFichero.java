package Fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))){
            String linea;
            int contador = 1;
                while ((linea = br.readLine()) != null) {
                    System.out.println(contador + "." + linea);
                    contador++;
                }
        }catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}