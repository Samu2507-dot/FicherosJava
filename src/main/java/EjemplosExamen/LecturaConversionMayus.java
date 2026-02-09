package EjemplosExamen;

import java.io.*;

public class LecturaConversionMayus {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("entrada.txt")); 
                BufferedWriter bw = new BufferedWriter(new FileWriter("salida_mayusculas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase());
                bw.newLine();
            }
            System.out.println("Contenido copiado en mayúsculas.");
        } catch (IOException e) {
            System.err.println("Error al procesar los ficheros: " + e.getMessage());
        }
    }
}
