package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaCliente cuenta1 = new CuentaCliente("Juan Perez", 1000);
        ;
        
        System.out.println("CAJERO BANCARIO.");
        System.out.println("INGRESE LA TRANSACCION QUE DESEA REALIZAR:");
        System.out.println("1.DEPOSITAR.");
        System.out.println("2.RETIRAR.");
        System.out.println("3.CONSULTAR EL SALDO.");
        Scanner lectura = new Scanner(System.in);
        int operacion = lectura.nextInt();
        

        switch (operacion) {
            case 1:
                System.out.println("DEPOSITAR");
                cuenta1.depositar(); // Cambié el método para que reciba un monto
                break;
                
            case 2:
                System.out.println("RETIRAR");
                cuenta1.retirar();
                break;
                
            case 3:
                System.out.println("CONSULTAR SALDO");
                cuenta1.muestraCuenta();
                break;
        
            default:
                System.out.println("ERROR, TRANSACCION NO VALIDA.");
                break;
        }
        


    }
}