package semana15.cajero;

import java.io.IOException;

public class Tasas {
    static double cargarTasa(String archivo) throws IOException {[cite: 123]
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);[cite: 123]
        }
        return 0.05;[cite: 123]
    }

    public static void main(String[] args) {
        String[] archivos = {"tasas.csv", "tasas.pdf"};[cite: 124]
        for (String a : archivos) {
            try {
                System.out.println(a + " -> tasa " + cargarTasa(a));[cite: 124]
            } catch (IOException e) {
                System.out.println("Error de lectura: " + e.getMessage());[cite: 124]
            }
        }
    }
}