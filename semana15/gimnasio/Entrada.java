package semana15.gimnasio;

import javax.swing.JOptionPane;

public class Entrada {
    public static int validarEntero(String texto, int min, int max) {
        int valor = Integer.parseInt(texto.trim());[cite: 140]
        if (valor < min || valor > max) {
            throw new IllegalArgumentException([cite: 140]
                    "Debe estar entre " + min + " y " + max);
        }
        return valor;[cite: 140]
    }

    public static int leerEntero(String mensaje, int min, int max) {
        while (true) {
            String texto = JOptionPane.showInputDialog(mensaje);[cite: 140]
            if (texto == null) {
                throw new IllegalStateException("Operacion cancelada");[cite: 140]
            }
            try {
                return validarEntero(texto, min, max);[cite: 140]
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escriba solo numeros",[cite: 140]
                        "Dato invalido", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),[cite: 140]
                        "Fuera de rango", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}