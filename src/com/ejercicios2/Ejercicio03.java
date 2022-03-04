package com.ejercicios2;
import javax.swing.JOptionPane;

public class Ejercicio03 {
      public static void main(String[] args) {
        int[] tablaA = new int[12];
        int[] tablaB = new int[12];
        int[] tablaC = new int[24];
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contador = 0;
        for (int i = 0; i < tablaA.length; i++) {
            tablaA[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la tabla A"));
        }
        for (int i = 0; i < tablaB.length; i++) {
            tablaB[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la tabla B"));
        }
        for (int i = 0; i < tablaC.length; i++) {
            if (contadorA < 3) {
                tablaC[i] = tablaA[contadorA];
                contadorA++;
                contador++;
            } else if (contadorB < 3) {
                tablaC[i] = tablaB[contadorB];
                contadorB++;
                contador++;
            } else {
                contadorA = 0;
                contadorB = 0;
                contador = 0;
            }
        }
        for (int i = 0; i < tablaC.length; i++) {
            System.out.println(tablaC[i]);
        }
    }
}
