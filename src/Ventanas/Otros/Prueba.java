package Ventanas.Otros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Modelos\\" + "Cancer_de_mama" + "\\datos.csv"))) {
            String dato;
            while ((dato = br.readLine()) != null) {
                datos.add(dato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        datos.forEach(dato -> {
            System.out.println(dato);
        });

    }

    private void listarModelos(){
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Registros\\Modelos_registrados.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir las líneas leídas
        for (String linea : lineas) {
            System.out.println(linea);
        }
        System.out.println(lineas.size());
    }
}
