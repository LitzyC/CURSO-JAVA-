package com.example;

import java.util.Scanner;

public class Exercise1 {
    
    public static void factorial(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el número a factorizar: ");
        int numero=lector.nextInt();
        
        int numeroFactorial=1;//Guardamos el valor del factorial

        //String cadena = Integer.toString(numero) + "! = 1";
        //Composicion de la cadena con el resultado
        //Muestra en tipo texto --- numero ! = 1

        for (int num = 2; num <= numero; num++) {
            numeroFactorial=numeroFactorial* num;
            //Multiplica todos los numeros 
            //cadena=cadena + " x " + Integer.toString(num);
            //Integer --- es la clase de int, representa un numero entero
            //toString() --- devuelve una cadena de texto
            //Muestra por consola la cadena del numero hecho factorial en texto
            //Muestra --- cadena x 2 x 3 x 4 x 5 
        }
        
        System.out.println("El número factorial de: " + numero+" es: "+ numeroFactorial);
        //System.out.println(cadena + " = " + Integer.toString(numeroFactorial));
        
    }
    public static void main(String[] args) {
        factorial();
    }
}
