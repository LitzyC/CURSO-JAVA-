package com.example;

import java.util.Scanner;

public class Main {
    
     public static void Lectura() {
        Scanner num = new Scanner(System.in);
        System.out.println("Put the number");
        int number=num.nextInt();
        System.out.println(number);
    }


    public static void main(String[] args) {
        Lectura();
    }
}