package com.example;

import java.util.Scanner;

public class Exercise13 {
    
    public static void numerosPrimosRangos(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el número inicial: ");
        int num1 = lectura.nextInt();

        System.out.println("Ingrese el número final: ");
        int num2 = lectura.nextInt();

        for (int i = num1; i < num2; i++) {
            if (esPrimo(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean esPrimo(int num){
        if (num <=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        numerosPrimosRangos();
    }
}
