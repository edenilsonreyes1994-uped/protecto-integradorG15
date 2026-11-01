    package semana15.cajero;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Ana", 100);[cite: 120]
        int[] depositos = {50, -20, 30};[cite: 120]
        for (int d : depositos) {
            try {
                c.depositar(d);
                System.out.println("Deposito de " + d + " aceptado");[cite: 120]
            } catch (IllegalArgumentException e) {
                System.out.println("Rechazado: " + e.getMessage());[cite: 120]
            }
        }
        System.out.println("Saldo: " + c.getSaldo());[cite: 120]
    }
}