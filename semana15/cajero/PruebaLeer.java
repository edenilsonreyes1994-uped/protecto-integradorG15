package semana15.cajero;

public class PruebaLeer {
    public static void main(String[] args) {
        String[] entradas = {"50", "25", "abc", "-10", "0"};[cite: 131]
        for (String t : entradas) {
            try {
                System.out.println("\"" + t + "\" -> " + DepositoGUI.leerMonto(t));[cite: 131]
            } catch (NumberFormatException e) {
                System.out.println("\"" + t + "\" -> NumberFormatException");[cite: 131]
            } catch (IllegalArgumentException e) {
                System.out.println("\"" + t + "\" -> " + e.getMessage());[cite: 131]
            }
        }
    }
}