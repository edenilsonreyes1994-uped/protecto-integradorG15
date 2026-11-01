package semana15.cajero;

import javax.swing.JOptionPane;

public class DepositoRepetido {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 100);[cite: 131]
        boolean listo = false;[cite: 131]
        while (!listo) {
            String texto = JOptionPane.showInputDialog("Monto a depositar:");[cite: 131]
            if (texto == null) {
                return;[cite: 131]
            }
            try {
                cuenta.depositar(DepositoGUI.leerMonto(texto));[cite: 131]
                listo = true;[cite: 131]
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escriba solo numeros");[cite: 131]
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());[cite: 131]
            }
        }
        JOptionPane.showMessageDialog(null, "Saldo: $" + cuenta.getSaldo());[cite: 131]
    }
}