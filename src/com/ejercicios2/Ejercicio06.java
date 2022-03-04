package com.ejercicios2;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion;
        int i;
        int j;
        int aux;
        int numero;
        boolean encontrado = false;

        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero");
            numero = sc.nextInt();
            arreglo[i] = numero;
        }

        System.out.println("El arreglo es: ");
        for (i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("\nIngrese una posicion entre 0 y 9");
        posicion = sc.nextInt();

        if (posicion >= 0 && posicion < 10) {
            for (i = posicion; i < 10; i++) {
                if (i == 9) {
                    arreglo[i] = 0;
                } else {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;
                }
            }
        }else {
            System.out.println("La posicion ingresada no es valida y no se eliminara ningun elemento");

        }
        System.out.println("\nEl arreglo es: ");
        for (i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
