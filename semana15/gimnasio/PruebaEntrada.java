package semana15.gimnasio;

public class PruebaEntrada {
    public static void main(String[] args) {
        String[] casos = {"18", "edad", "150", "65"};[cite: 141]
        for (String c : casos) {
            try {
                System.out.println("\"" + c + "\" -> "[cite: 141]
                        + Entrada.validarEntero(c, 16, 80));
            } catch (NumberFormatException e) {
                System.out.println("\"" + c + "\" -> no es numero");[cite: 141]
            } catch (IllegalArgumentException e) {
                System.out.println("\"" + c + "\" -> " + e.getMessage());[cite: 141]
            }
        }
    }
}