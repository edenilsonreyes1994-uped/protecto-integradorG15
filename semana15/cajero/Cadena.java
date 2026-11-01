package semana15.cajero;

import java.io.IOException;

public class Cadena {
    static double cargarTasa(String archivo) throws IOException {[cite: 125]
        System.out.println("   cargarTasa(" + archivo + ")");[cite: 125]
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);[cite: 125]
        }
        return 0.05;[cite: 125]
    }

    static double calcularInteres(int saldo, String archivo) throws IOException {[cite: 125]
        System.out.println("  calcularInteres");[cite: 125]
        return saldo * cargarTasa(archivo);[cite: 125]
    }

    public static void main(String[] args) {
        try {
            System.out.println("Interes: " + calcularInteres(1000, "tasas.csv"));[cite: 125]
            System.out.println("Interes: " + calcularInteres(1000, "tasas.xls"));[cite: 125]
        } catch (IOException e) {
            System.out.println("main atrapa: " + e.getMessage());[cite: 125]
        }
    }
}