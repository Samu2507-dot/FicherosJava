package TraduccionMorse;

import java.io.*;

public class Traduccion {
    public static void main(String[] args) {
        char[] letras = {
            'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z'
        };
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        try {
            BufferedReader br = new BufferedReader(new FileReader("entradaMorse.txt"));
            String resultado;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("salidaMorse.txt"))) {
                String texto = br.readLine();
                resultado = "";
                for (int i = 0; i < texto.length(); i++) {
                    char cambioLetra = texto.charAt(i);
                    switch (cambioLetra) {
                        case 'A' -> cambioLetra = 'a';
                        case 'B' -> cambioLetra = 'b';
                        case 'C' -> cambioLetra = 'c';
                        case 'D' -> cambioLetra = 'd';
                        case 'E' -> cambioLetra = 'e';
                        case 'F' -> cambioLetra = 'f';
                        case 'G' -> cambioLetra = 'g';
                        case 'H' -> cambioLetra = 'h';
                        case 'I' -> cambioLetra = 'i';
                        case 'J' -> cambioLetra = 'j';
                        case 'K' -> cambioLetra = 'k';
                        case 'L' -> cambioLetra = 'l';
                        case 'M' -> cambioLetra = 'm';
                        case 'N' -> cambioLetra = 'n';
                        case 'O' -> cambioLetra = 'o';
                        case 'P' -> cambioLetra = 'p';
                        case 'Q' -> cambioLetra = 'q';
                        case 'R' -> cambioLetra = 'r';
                        case 'S' -> cambioLetra = 's';
                        case 'T' -> cambioLetra = 't';
                        case 'U' -> cambioLetra = 'u';
                        case 'V' -> cambioLetra = 'v';
                        case 'W' -> cambioLetra = 'w';
                        case 'X' -> cambioLetra = 'x';
                        case 'Y' -> cambioLetra = 'y';
                        case 'Z' -> cambioLetra = 'z';
                    }
                    for (int j = 0; j < letras.length; j++) {
                        if (cambioLetra == letras[j]) {
                            resultado += morse[j] + " ";
                        }
                    }
                }   bw.write(resultado);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}