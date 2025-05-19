package com.example;

import java.util.Scanner;

public class Exercise12 {
    
    public static void reemplazoLetras(){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa la palabra: ");
        String palabra = lectura.next().toLowerCase();
        
        //String resultado = palabra.replaceAll("a", "@");
        //System.out.print(resultado);
        // Reemplaza todas las a
        
        System.out.println("Que letra va a remplazar: ");
        char letraElegida=lectura.next().charAt(0);
        // lectura.next().charAt(0) lee el primer caracter ingresado

        System.out.println("El simbolo a colocar: ");
        char simboloReemplazar=lectura.next().charAt(0);

        String resultado = palabra.replace(letraElegida, simboloReemplazar);
        // Es como esto ---> palabra.replaceAll("a", "@");
        System.out.print(resultado);
    }

    public static void main(String[] args) {
        reemplazoLetras();
    }

}
