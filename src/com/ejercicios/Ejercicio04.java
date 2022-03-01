package com.ejercicios;
import java.util.Scanner;

public class Ejercicio04{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        //pedir un numero entre 0 y 99999 y mostrar cuantas cifras tiene
        System.out.println("Introduce un numero entre 0 y 99999");
        int numero=key.nextInt();
        int cifras=0;
        while(numero>0){
            numero=numero/10;
            cifras++;
        }
        System.out.println("El numero tiene "+cifras+" cifras");
    }
}