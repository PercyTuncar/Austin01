package com.ejercicios2;
import java.util.Scanner;

public class Ejercicio08 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[][] notas = new int[5][3];
       int[] media = new int[3];
       int posicion;
       int suma = 0;
       int media_alumno;
       int contador = 0;

       for(int i = 0; i < notas.length; i++){
           for(int j = 0; j < notas[i].length; j++){
               System.out.println("Introduce la nota del alumno " + (i+1) + " en el trimestre " + (j+1));
               notas[i][j] = sc.nextInt();
           }
       }

       System.out.println("Introduce la posición del alumno que quieres calcular la media");
       posicion = sc.nextInt();
       posicion = posicion - 1;
       for(int i = 0; i < notas[posicion].length; i++){
           suma += notas[posicion][i];
           contador++;
       }

       media_alumno = suma / contador;

       for(int i = 0; i < notas.length; i++){
           for(int j = 0; j < notas[i].length; j++){
               suma += notas[i][j];
               contador++;
           }
       }

       media[0] = suma / contador;

       suma = 0;
       contador = 0;

       for(int i = 0; i < notas.length; i++){
           for(int j = 0; j < notas[i].length; j++){
               if(j == 1){
                   suma += notas[i][j];
                   contador++;
               }
           }
       }

       media[1] = suma / contador;

       suma = 0;
       contador = 0;

       for(int i = 0; i < notas.length; i++){
           for(int j = 0; j < notas[i].length; j++){
               if(j == 2){
                   suma += notas[i][j];
                   contador++;

               }
           }
   }

       media[2] = suma / contador;

       System.out.println("La media del alumno " + (posicion+1) + " es " + media_alumno);
       System.out.println("La media del trimestre 1 es " + media[0]);
       System.out.println("La media del trimestre 2 es " + media[1]);
       System.out.println("La media del trimestre 3 es " + media[2]);

   }
}