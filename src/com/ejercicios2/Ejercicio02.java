package com.ejercicios2;
import javax.swing.JOptionPane;

public class Ejercicio02 {
 public static void main(String[] args) {

     int[] numeros = new int[10];
     int i;
     int numero;

     for (i = 0; i < 10; i++) {
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + (i + 1)));
         numeros[i] = numero;
     }

     JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros[0] + " " + numeros[9]);
     JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros[1] + " " + numeros[8]);
     JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros[2] + " " + numeros[7]);
     JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros[3] + " " + numeros[6]);
     JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros[4] + " " + numeros[5]);
 }
}