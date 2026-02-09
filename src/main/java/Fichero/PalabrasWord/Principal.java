package Fichero.PalabrasWord;

import java.io.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("CONTADOR DEL WORLD");
        try (BufferedReader contenido = new BufferedReader(new FileReader("World.txt"));) {
            //Contar palabras caracteres (con/sin) espacios, y parrafos
            String linea;
            int contaParrafos = 0;
            int acumuladorCon = 0; //Contar todos los parrafos
            int acumuladorPal = 0; //Contar todas las palabras
            int acumuladorSin = 0; //Contar todas las palabras
            while ((linea = contenido.readLine()) != null) {
                if (linea.length() != 0) { //No quiero trabajar parrafos vacios
                    contaParrafos++;
                    //Acumulamos los caracteres por cada parrafo
                    int caracteresCon = linea.length();
                    acumuladorCon += caracteresCon;
                    // Guardamos y acumulamos las palabras, tamaño del array
                    String[] parrafo = linea.split(" ");
                    int contadorPal = parrafo.length;
                    acumuladorPal += contadorPal;
                    //Ahora contamos las palabras sin espacio desde el parrafo[]
                    int acumuladorLetras = 0;
                    for (String s : parrafo) {// por cada palabra acumulo el numero de letras
                        acumuladorLetras += s.length();
                    }
                    acumuladorSin += acumuladorLetras;
                }
            }
            System.out.println("Los parrafos son: " + contaParrafos);
            System.out.println("Los caracteres con espacios son: " + acumuladorCon);
            System.out.println("Palabras del texto: " + acumuladorPal);
            System.out.println("Los caracteres sin espacios son: " + acumuladorSin);
        } catch (IOException e) {
            System.err.println("Error en la lectura: " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
