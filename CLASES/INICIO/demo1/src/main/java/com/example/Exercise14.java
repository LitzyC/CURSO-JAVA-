package com.example;

import java.util.Scanner;

public class Exercise14 {
    
    public static void buscarPalabra(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la frase: ");
        String frase = lectura.nextLine().toLowerCase();
        
        System.out.println("Ingrese la palabra: ");
        String palabra = lectura.nextLine().toLowerCase();

        if (frase.contains(palabra)) {
            System.out.println(true);
            System.out.println("La palabra: " + palabra + " se encuentra en la frase.");
            //Verifica la palabra dentro de la frase
         
        int posicion=frase.indexOf(palabra);
        System.out.println("La palabra: " + palabra + " se encuentra en la posición " + posicion);
      }else{
          System.out.println("La palabra: " + palabra + " no  se encuentra en la frase");

      }

    }

    public static void main(String[] args) {
        buscarPalabra();
    }
}
