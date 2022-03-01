package com.ejercicios;
import java.util.Scanner;

public class Ejercicio01{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        int a;
        int b;
        System.out.print("Ingrese el primer numero : ");
        a=key.nextInt();
        System.out.print("ingrese el segundo numero : ");
        b=key.nextInt();
        if(a>b) {
            System.out.print("el numero mayor es : "+a);
        }
        else if(b==a) {
            System.out.print("los numeros "+ b + " " + a + " son iguales");
        } else {
            System.out.print("el numero mayor es : "+b);
        }
    }
}