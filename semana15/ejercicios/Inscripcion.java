package semana15.ejercicios;

public class Inscripcion {
    static void validarEdad(int edad) {
        if (edad < 16 || edad > 80) {
            throw new IllegalArgumentException([cite: 146]
                    "Edad fuera de rango: " + edad);
        }
    }

    public static void main(String[] args) {
        int[] edades = {25, 12, 40, 95};[cite: 146]
        int aceptados = 0;[cite: 146]
        for (int e : edades) {
            try {
                validarEdad(e);[cite: 146]
                aceptados++;
                System.out.println(e + ": inscrito");[cite: 146]
            } catch (IllegalArgumentException ex) {
                System.out.println(e + ": " + ex.getMessage());[cite: 146]
            }
        }
        System.out.println("Aceptados: " + aceptados);[cite: 146]
    }
}