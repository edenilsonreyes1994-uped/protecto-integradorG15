package semana15.cajero;

public class Retiros {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Marta", 120);[cite: 121]
        int[] retiros = {50, 200, -5, 70};[cite: 121]
        for (int r : retiros) {
            try {
                c.retirar(r);
                System.out.println("Retiro de " + r + " -> saldo " + c.getSaldo());[cite: 121]
            } catch (IllegalArgumentException e) {
                System.out.println("Monto invalido: " + e.getMessage());[cite: 121]
            } catch (IllegalStateException e) {
                System.out.println("No se pudo: " + e.getMessage());[cite: 121]
            }
        }
    }
}