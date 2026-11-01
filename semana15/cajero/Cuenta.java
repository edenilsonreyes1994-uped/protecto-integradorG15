package semana15.cajero;

public class Cuenta {
    private String titular;
    private int saldo;

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo: " + monto);[cite: 119]
        }
        saldo += monto;
    }

    public void retirar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo: " + monto);[cite: 119]
        }
        if (monto > saldo) {
            throw new IllegalStateException("Saldo insuficiente: disponible " + saldo);[cite: 119]
        }
        saldo -= monto;
    }

    public int getSaldo() {
        return saldo;
    }
}