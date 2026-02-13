package Correspondencia;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        // $empresa $rrhh $departamento $cargo $fecha1 $fecha2 $motivo $jefe $nombre $apellido
        try (BufferedReader br = new BufferedReader(new FileReader("Correspondencias.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("CorrespondenciasRes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null ) {
                if (linea.contains("$")) {
                    linea = linea.replace("$rrhh", "NO");
                    linea = linea.replace("$departamento", "Informatica");
                    linea = linea.replace("cargo", "desarrollador web");
                    linea = linea.replace("$fecha1", "12-3-26");
                    linea = linea.replace("$fecha2", "25-3-26");
                    linea = linea.replace("$motivo", "Adriana salte");
                    linea = linea.replace("$jefe", "Omar");
                    linea = linea.replace("$nombre", "Enrique");
                    linea = linea.replace("$apellido", "Calzoski");
                }   
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Error en el fichero: " + e.getMessage());
        }
    }
}