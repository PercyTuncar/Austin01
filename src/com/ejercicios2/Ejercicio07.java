package com.ejercicios2;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[20];

        System.out.println("Introduzca 10 valores para el primer array");
        for(int i=0;i<array1.length;i++){
            array1[i] = teclado.nextInt();
        }

        System.out.println("Introduzca 10 valores para el segundo array");
        for(int i=0;i<array2.length;i++){
            array2[i] = teclado.nextInt();
        }

        for(int i=0;i<array3.length;i++){
            if(i<10){
                array3[i] = array1[i];
            }else{
                array3[i] = array2[i-10];
            }
        }


        System.out.println("");

        for(int i=0;i<array3.length;i++){
            for(int j=i+1;j<array3.length;j++){
                if(array3[i]>array3[j]){
                    int aux = array3[i];
                    array3[i] = array3[j];
                    array3[j] = aux;
                }
            }
        }
        System.out.println("El valor del tercer array ordenado es:");
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }

    }

}