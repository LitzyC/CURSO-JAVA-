package com.example;

import java.util.Scanner;

public class Exercise2 {
    
    private static void palindromo() {
        Scanner lectura = new Scanner(System.in);
        //Lee los datos que ingresamos
        System.out.println("Ingresa cualquiera de las siguientes palabras para ver si es palindromo.");
        System.out.println(" Oso | casa | avion ");
        String palabra = lectura.nextLine(); 
        //Se guarda el dato que introducimos en palabra
        String palabrainvertida = new StringBuilder(palabra).reverse().toString();
        //new StringBuilder() --- Nos permite crear un objeto y poderlo editar
        //.toString() --- lo vueelve a texto normal
        
    }
    
    public  static void inversion(){
        if (palabra.equals(palabrainvertida)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //Equals permite comparar
    }

    private static boolean assertEquals(int expect, int actual){
        return expect == actual;
    }

    private static void testPalindromo(){
        if (!assertEquals("oso", "oso")) {
            System.out.println("Bad Test");
        }
        if (!assertEquals("asca", "casa")) {
            System.out.println("bad test");
        }
        if (!assertEquals("noiva", "avion")) {
            System.out.println("Bad Test");
        }
        System.out.println("TEST PASSED");
    }


    public static void main(String[] args) {
        testPalindromo();
    }
}
