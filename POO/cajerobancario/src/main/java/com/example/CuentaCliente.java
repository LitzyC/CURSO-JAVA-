package com.example;

import java.util.Scanner;

public class CuentaCliente {
    //List<CuentaCliente> cuentaCliente = new ArrayList<>();
    Scanner lectura = new Scanner(System.in);
    
    private String titular;
    private double saldo;
    
    public CuentaCliente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(){
        System.out.println("INGRESE EL MONTO A DEPOSITAR:");
        float monto = lectura.nextFloat();

        if (monto > 0) {
            double total = getSaldo() + monto;
            setSaldo(total);
            System.out.println("TITULAR: "+ this.titular);
            System.out.println("MONTO DEPOSITADO: " + monto);
            System.out.println("SU NUEVO SALDO ES: " + total);
            System.out.println("DEPOSITO EXITOSO");
        } else {
            System.out.println("MONTO INVALIDO.");
        }
    }

    public void retirar(){
        System.out.println("INGRESE EL MONTO A RETIRAR:");
        double monto = lectura.nextDouble();

        if (monto > 0 && monto <= getSaldo()) {
            double total = getSaldo() - monto;
            setSaldo(total);
            System.out.println("TITULAR: "+ this.titular);
            System.out.println("MONTO RETIRADO: " + monto);
            System.out.println("SU NUEVO SALDO ES: " + getSaldo());
            System.out.println("RETIRO EXITOSO");
        } else {
            System.out.println("FONDOS INSUFICIENTES.");
        }
    }
    
    public void muestraCuenta(){
        System.out.println("TITULAR: "+ this.titular);
        System.out.println("SALDO DISPONIBLE: " + getSaldo());
    }

    public void menuPrincipal(){
        System.out.println("CAJERO BANCARIO.");
        System.out.println("INGRESE LA TRANSACCION QUE DESEA REALIZAR:");
        System.out.println("1.Depositar.");
        System.out.println("2.Retirar.");
        System.out.println("3.Consultar el saldo.");
        int operacion = lectura.nextInt();
        

        switch (operacion) {
            case 1:
                System.out.println("DEPOSITAR");
                depositar(); 
                break;
            case 2:
                System.out.println("RETIRAR");retirar();
                break;
            case 3:
                System.out.println("CONSULTAR SALDO");
                muestraCuenta();
                break;
            default:
                System.out.println("ERROR, TRANSACCION NO VALIDA.");
                break;
        }
    }

    
}
