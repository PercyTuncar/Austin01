package com.ejercicios2;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int posicion = 0;
        int valor = 0;
        int contador = 0;
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Introduce la posicion: ");
        posicion = sc.nextInt();
        System.out.println("Introduce el valor: ");
        valor = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (i == posicion) {
                numeros[i] = valor;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                aux = numeros[i];
                numeros[i] = numeros[0];
                numeros[0] = aux;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

}