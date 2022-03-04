package com.ejercicios2;
import javax.swing.JOptionPane;

public class Ejercicio01 {
  public static void main(String[] args) {
     int[] numeros = new int[5];
    int i;
    for (i = 0; i < 5; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    }
    for (i = 4; i >= 0; i--) {
      JOptionPane.showMessageDialog(null, "Numero " + (i + 1) + ": " + numeros[i]);
    }
  }
}