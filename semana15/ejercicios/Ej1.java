package semana15.ejercicios;

import Semana15.Cajero.Cuenta;

public class Ej1 {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Rosa", 60);[cite: 143]
        try {
            c.depositar(40);
            System.out.println("A: " + c.getSaldo());[cite: 143]
            c.retirar(150);
            System.out.println("B: " + c.getSaldo());[cite: 143]
            c.retirar(30);
            System.out.println("C: " + c.getSaldo());[cite: 143]
        } catch (IllegalStateException e) {
            System.out.println("D: " + e.getMessage());[cite: 143]
        }
        System.out.println("E: " + c.getSaldo());[cite: 143]
    }
}