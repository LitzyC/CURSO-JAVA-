package com.example;

import java.util.Scanner;


public class Exercise15 {
    //Conversor de temperaturas
    //Crear funciones para convertir 
    //entre Celsius, Fahrenheit y Kelvin.
    
    public static void conventirTemperatura(){
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingresa la opcion de conversión: ");
        System.out.print("1.Celsius a Farenheit.");
        System.out.print("2.Celsius a Kelvin.");
        System.out.print("3.Farenheit a Celsius.");
        System.out.print("4.Farenheit a Kelvin.");
        System.out.print("5.Kelvin a Celsius.");
        System.out.print("5.Kelvin a Farenheit.");
        int opcion=lectura.nextByte();
        lectura.nextLine();//Limpia la entrada
        
        System.out.println("Ingresa el número a convertir: ");
        int numero=lectura.nextInt();
        
        double resultado=0;

        do {
            switch (opcion) {
                case 1://celsius a farenheit
                    resultado = (numero * 9/5) + 32;
                    break;
                case 2://celcius a kelvin
                    resultado = (numero * 9/5) + 273.15;
                    break;
                case 3://farenheit a celcius
                    resultado = (numero - 32 ) * 5/9;
                    break;
                case 4://farenheit a kelvin
                    resultado = (numero + 459.57 ) * 5/9;
                    break;
                default:
                    System.out.println("Ingrese una opcion válida.");
                    lectura.close();
                    return;
            }
        } while (opcion = "5" || opcion = "6" );


    }

    public static void main(String[] args) {
        conventirTemperatura();
    }
}
