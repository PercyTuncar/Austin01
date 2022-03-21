package com.Ejercicio3;
import javax.swing.JOptionPane;
import java.util.Scanner;

 public class ejercicio02 {

    private String emisor;
    private String cliente;


    public ejercicio02(){
        this.emisor = "";
        this.cliente = "";

    }

    public ejercicio02(String emisor, String cliente){
        this.emisor = emisor;
        this.cliente = cliente;
    }

     public void setCliente(String cliente) {
         this.cliente = cliente;
     }

     public void setEmisor(String emisor){
        this.emisor = emisor;
    }



    public String getEmisor(){
        return this.emisor;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void imprimirFactura(){
        JOptionPane.showMessageDialog(null, "Emisor: "+this.emisor+"\nCliente: "+this.cliente );
    }

    public static void main(String[] args) {
        ejercicio02 factura = new ejercicio02();
        Scanner sc = new Scanner(System.in);
        String emisor = JOptionPane.showInputDialog("Introduce el emisor");
        String cliente = JOptionPane.showInputDialog("Introduce el cliente");
        factura.setEmisor(emisor);
        factura.setCliente(cliente);
        factura.imprimirFactura();
    }
}
