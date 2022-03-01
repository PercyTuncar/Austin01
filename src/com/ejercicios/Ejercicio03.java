package com.ejercicios;
import java.util.Scanner;

public class Ejercicio03{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        //hacer un programa que tome dos numeros y muestre si ambos son pares o no
        System.out.println("Ingrese un numero");
        int num1=key.nextInt();
        System.out.println("Ingrese otro numero");
        int num2=key.nextInt();
        if(num1%2==0 && num2%2==0){
            System.out.println("Ambos numeros son pares");
        }
        else{
            System.out.println("Alguno de los numeros no es par");
        }
    }
}