package com.example;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercise10 {
    
    public static void polindromoAvanzado() {
        Scanner lectura = new Scanner(System.in);
        //Lee los datos que ingresamos
        System.out.println("Ingresa la oración.");
        String palabra = lectura.nextLine(); 
        //Se guarda el dato que introducimos en palabra

        palabra=palabra.toLowerCase();//Todo a minusculas

        palabra=Normalizer.normalize(palabra, Normalizer.Form.NFD);
        //Convierte los caracteres con tildes en una composicion de dos partes
        
        palabra=palabra.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        //Elimina las tildes de las letras

        palabra = palabra.replaceAll("[^a-z0-9]", "");
        //Quita todo lo que no sea letra o numeros

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
        polindromoAvanzado();
    }

}
