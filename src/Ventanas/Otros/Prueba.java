package Ventanas.Otros;

import java.io.IOException;
import java.net.InetAddress;

public class Prueba {

    public static void main(String[] args) {
        System.out.println(verificarConexion() ? "Si" : "No");
    }

    public static boolean verificarConexion() {
        try {
            InetAddress googleAddress = InetAddress.getByName("www.google.com");
            boolean conexion = googleAddress.isReachable(5000); // Espera 5 segundos para la respuesta

            return conexion;
        } catch (IOException e) {
            return false;
        }
    }
}
