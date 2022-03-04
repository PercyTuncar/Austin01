package com.ejercicios;
import javax.swing.JOptionPane;


public class Ejercicio001 {
    public static void main(String[] args){
        //crear una interfaz grafica que pida al usuario dos numeros y muestre el resultado de la suma, resta, multiplicacion y division de los dos numeros.
        //usar JOptionPane
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + multiplicacion + "\nLa division es: " + division);
    }
}