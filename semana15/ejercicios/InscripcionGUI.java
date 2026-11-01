package Semana15.Gimnasio;

import javax.swing.JOptionPane;

public class InscripcionGUI {
    public static void main(String[] args) {
        try {
            int edad = Entrada.leerEntero("Edad del socio (16 a 80):", 16, 80);[cite: 141]
            int meses = Entrada.leerEntero("Meses de membresia (1 a 12):", 1, 12);[cite: 141]
            int r = JOptionPane.showConfirmDialog(null,[cite: 141]
                    "<html>Confirma la inscripcion?<br>Edad: " + edad
                            + "<br>Meses: " + meses + "<br>Total: $" + (meses * 25)
                            + "</html>", "Gimnasio", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");[cite: 141]
            }
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());[cite: 141]
        }
    }
}