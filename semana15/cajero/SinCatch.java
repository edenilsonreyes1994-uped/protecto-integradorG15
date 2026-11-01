package semana15.cajero;

public class SinCatch {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Luis", 80);[cite: 120]
        c.depositar(20);
        System.out.println("Saldo: " + c.getSaldo());[cite: 120]
        c.depositar(0);
        System.out.println("Esta linea no se imprime");[cite: 120]
    }
}