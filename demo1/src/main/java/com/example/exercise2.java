package com.example;

import java.util.Scanner;

public class Exercise2 {
    
    private static void palindromo() {
        Scanner lectura = new Scanner(System.in);
        //Lee los datos que ingresamos
        System.out.println("Ingresa la palabra.");
        String palabra = lectura.nextLine(); 
        //Se guarda el dato que introducimos en palabra
        String palabrainvertida = new StringBuilder(palabra).reverse().toString();
        //new StringBuilder() --- Nos permite crear un objeto y poderlo editar
        //.toString() --- lo vueelve a texto normal
        
        if (palabra.equals(palabrainvertida)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //Equals permite comparar
    }

    public static void main(String[] args) {
        palindromo();
    }
}
