package com.ejercicios;
import java.util.Scanner;

public class Ejercicio05{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        // pedir el dia, mes y año de una fecha e indicar si es correcta con meses de 28, 30 y 31 dias sin año bisiesto
        System.out.println("Introduce el dia");
        int dia=key.nextInt();
        System.out.println("Introduce el mes");
        int mes=key.nextInt();
        System.out.println("Introduce el año");
        int año=key.nextInt();
        if(dia>0 && dia<32 && mes>0 && mes<13){
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                if(dia<=31){
                    System.out.println("La fecha es correcta");
                }
                else{
                    System.out.println("La fecha no es correcta");
                }
            }
            else if(mes==4 || mes==6 || mes==9 || mes==11){
                if(dia<=30){
                    System.out.println("La fecha es correcta");
                }
                else{
                    System.out.println("La fecha no es correcta");
                }
            }
        }
        else{
            System.out.println("La fecha no es correcta");
        }
    }
}