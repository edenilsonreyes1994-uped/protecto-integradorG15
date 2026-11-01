package semana15.cajero;

import javax.swing.JOptionPane;

public class DepositoGUI {
    static int leerMonto(String texto) {
        int monto = Integer.parseInt(texto.trim());[cite: 129]
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");[cite: 129]
        }
        return monto;[cite: 129]
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 100);[cite: 130]
        String texto = JOptionPane.showInputDialog(null,[cite: 130]
                "Monto a depositar:", "Cajero",
                JOptionPane.QUESTION_MESSAGE);
        if (texto == null) {
            return; // el usuario canceló[cite: 130]
        }
        try {
            cuenta.depositar(leerMonto(texto));[cite: 130]
            JOptionPane.showMessageDialog(null,[cite: 130]
                    "Deposito aceptado. Saldo: $" + cuenta.getSaldo(),
                    "Cajero", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,[cite: 130]
                    "Escriba solo numeros: \"" + texto + "\"",
                    "Dato invalido", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),[cite: 130]
                    "Monto invalido", JOptionPane.WARNING_MESSAGE);
        }
    }
}