package semana15.cajero;

import javax.swing.JOptionPane;

public class MenuCajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 100);[cite: 136]
        String[] ops = {"Depositar", "Retirar", "Saldo", "Salir"};[cite: 136]
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null,[cite: 136]
                    "Que desea hacer?", "Cajero", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);
            try {
                if (opcion == 0 || opcion == 1) {
                    String txt = JOptionPane.showInputDialog("Monto:");[cite: 136]
                    if (txt == null) {
                        continue;[cite: 136]
                    }
                    int monto = DepositoGUI.leerMonto(txt);[cite: 136]
                    if (opcion == 0) {
                        cuenta.depositar(monto);[cite: 136]
                    } else {
                        cuenta.retirar(monto);[cite: 136]
                    }
                    JOptionPane.showMessageDialog(null,[cite: 136]
                            "Listo. Saldo: $" + cuenta.getSaldo());
                } else if (opcion == 2) {
                    JOptionPane.showMessageDialog(null,[cite: 136]
                            "Saldo: $" + cuenta.getSaldo());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escriba solo numeros",[cite: 136]
                        "Dato invalido", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException | IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),[cite: 136]
                        "Operacion rechazada", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcion != 3 && opcion != JOptionPane.CLOSED_OPTION);[cite: 136]
    }
}