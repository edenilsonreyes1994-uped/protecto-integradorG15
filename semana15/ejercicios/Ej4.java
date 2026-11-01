package semana15.ejercicios;

public class Ej4 {
    static int dividirCuota(int total, int meses) {
        if (meses <= 0) {
            throw new IllegalArgumentException("meses debe ser positivo");[cite: 144]
        }
        System.out.println("   dividiendo " + total + " en " + meses);[cite: 144]
        return total / meses;[cite: 144]
    }

    static int planPago(int total, int meses) {
        System.out.println(" plan para " + meses + " meses");[cite: 144]
        int cuota = dividirCuota(total, meses);[cite: 144]
        System.out.println("   cuota calculada");[cite: 144]
        return cuota;[cite: 144]
    }

    public static void main(String[] args) {
        int[] opciones = {4, 0};[cite: 144]
        for (int m : opciones) {
            try {
                System.out.println("Cuota: " + planPago(120, m));[cite: 144]
            } catch (IllegalArgumentException e) {
                System.out.println("Plan rechazado: " + e.getMessage());[cite: 144]
            }
        }
    }
}