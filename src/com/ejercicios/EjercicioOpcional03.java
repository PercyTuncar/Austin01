
package com.ejercicios;
import java.util.Scanner;

public class EjercicioOpcional03 {

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        //hacer un programa que tome dos numeros y muestre si es par o impar
        System.out.println("Ingrese un numero");
        int numero1=key.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2=key.nextInt();
        if(numero1%2==0){
            System.out.println("El numero "+numero1+" es par");
        }
        else{
            System.out.println("El numero "+numero1+" es impar");
        }
        if(numero2%2==0){
            System.out.println("El numero "+numero2+" es par");
        }
        else{
            System.out.println("El numero "+numero2+" es impar");
        }

    }
}