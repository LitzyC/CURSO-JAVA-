package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaCliente {
    //List<CuentaCliente> cuentaCliente = new ArrayList<>();
    
    private String titular;
    private double saldo;
    
    public CuentaCliente(String titular, double saldo){
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
        Scanner lectura = new Scanner(System.in);
        float monto = lectura.nextFloat();

        if (monto > 0) {
            System.out.println("DEPOSITO EXITOSO");
            System.out.println("SU NUEVO SALDO ES: " + getSaldo());
        } else {
            System.out.println("Monto invalido.");
        }
    }

    public void retirar(){
        System.out.println("INGRESE EL MONTO A RETIRAR:");
        Scanner lectura = new Scanner(System.in);
        double monto = lectura.nextDouble();

        if (monto > 0 && monto <= getSaldo()) {
            System.out.println("RETIRO EXITOSO");
            System.out.println("SU NUEVO SALDO ES: " + getSaldo());
        } else {
            System.out.println("Monto invalido.");
        }
    }
    
    public void muestraCuenta(){
        System.out.println("Titular: "+this.titular+" Saldo: " + this.saldo);
    }

    
}
