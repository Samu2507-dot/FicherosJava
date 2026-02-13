package FicheroNumero;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        try (
                BufferedReader leer = new BufferedReader(new FileReader("Fuente.txt"));
                BufferedWriter escribir = new BufferedWriter(new FileWriter("Numeros.txt"));
            ){ 
            int numero = leer.read();
            for (int i = 0; i < numero; i++) {
                if ((numero%2) == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("Es impar");
                }
            escribir.write(numero);
            }
        } catch (IOException e) {
            System.err.println("Error = "+ e.getMessage());
        }
    }
}