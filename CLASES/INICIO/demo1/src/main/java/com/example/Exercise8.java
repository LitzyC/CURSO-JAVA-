package com.example;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    
    public static void passwordRandom() {
        Scanner lectura = new Scanner(System.in);
        Random random= new Random();

        System.out.print("¿Cuánta longitud quiere tener la contraseña?");
        int longitud=lectura.nextInt();//Ingresa la longitud
        lectura.nextLine();//Limpia la entrada

        System.out.print("¿Quieres caracteres especiales.?");
        String incluirSimbolos =lectura.nextLine().toLowerCase();

        String teclado="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String simbolos ="!@#$%&/()=?¿/*-^{}<>°¬|¡+_";
        //Ingresar los caracteres disponibles

        String caracteresDisponibles=teclado;
        if (incluirSimbolos.equals("sí")||incluirSimbolos.equals("si")) {
            caracteresDisponibles +=simbolos;
        }

        StringBuilder password=new StringBuilder();//Se usa para construir la contraseña carcter por caracter
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteresDisponibles.length());
            char caractereRandom=caracteresDisponibles.charAt(indice);
            //Obtiene un caracter espefico de la cadena
            password.append(caractereRandom);
        }
        System.out.println("Contraseña generada: "+password);
    }

    public static void main(String[] args) {
        passwordRandom();
    }
}
