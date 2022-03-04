package com.ejercicios2;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        int numeroIntroducido;
        int posicion;
        int i;
        int j;
        int aux;

        for(i=0;i<10;i++){
            numero[i]=0;
        }

        for(i=0;i<8;i++){
            System.out.println("Introduce un numero: ");
            numeroIntroducido = teclado.nextInt();
            numero[i]=numeroIntroducido;
        }

        System.out.println("Introduce un numero y una posicion: ");
        numeroIntroducido = teclado.nextInt();
        posicion = teclado.nextInt();

        for(i=8;i>posicion;i--){
            numero[i]=numero[i-1];
        }

        numero[posicion]=numeroIntroducido;

        for(i=0;i<10;i++){
            System.out.println(numero[i]);
        }

    }
}