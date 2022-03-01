package com.ejercicios;
import java.util.Scanner;

public class Ejercicio06{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        //pedir una nota de 0 a 10 y mostrar de forma: insuficiente, Suficiente, bien, notable y sobresaliente
        System.out.println("Introduce una nota de 0 a 10");
        int nota=key.nextInt();
        if(nota<4){
            System.out.println("Insuficiente");
        }
        else if(nota>=4 && nota<6){
            System.out.println("Suficiente");
        }
        else if(nota>=6 && nota<8){
            System.out.println("Bien");
        }
        else if(nota>=8 && nota<=9){
            System.out.println("Notable");
        }
        else if(nota==10){
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Ingrese un numero entre 0 y 10");
        }
    }
}