package com.ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        //hacer un programa que pase de Kg a otras unidades de peso, mostrar en pantalla un menu con las opciones posibles.
        System.out.println("Ingrese el peso en Kg");
        double peso=key.nextDouble();
        System.out.println("Ingrese la unidad de peso a convertir");
        System.out.println("1. Kg");
        System.out.println("2. Gramos");
        System.out.println("3. Libras");
        System.out.println("4. Toneladas");
        int opcion=key.nextInt();
        switch(opcion){
            case 1:
                System.out.println("El peso en Kg es: "+peso);
                break;
            case 2:
                System.out.println("El peso en Gramos es: "+peso*1000);
                break;
            case 3:
                System.out.println("El peso en Libras es: "+peso*2.2046);
                break;
            case 4:
                System.out.println("El peso en Toneladas es: "+peso/1000);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}