package com.ejercicios;
import java.util.Scanner;

public class Ejercicio02{

    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
      //calcular un descuento de 20% en una compra mayor de $300
      System.out.println("Introduce el precio total de la compra");
      double precio=key.nextDouble();
      if(precio>300){
          double descuento=precio*0.2;
          double total=precio-descuento;
          System.out.println("El precio con descuento es "+total);
      }
      else{
          System.out.println("El precio es "+precio);
      }

      }
}