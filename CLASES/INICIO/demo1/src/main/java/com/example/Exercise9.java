package com.example;

import java.util.Scanner;

public class Exercise9 {
    
    public static void calculadoraCinentifica(){
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = lectura.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = lectura.nextDouble();
        lectura.nextLine();//Se limpia la linea

        System.out.println("Que operación eligirá: ");
        System.out.println("suma | resta | multiplicacion | division ");
        System.out.println("raiz cuadrada | potencia | modulo ");
        String operacion = lectura.nextLine().toLowerCase();

        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir.");
                    return;
                }
                break;
            case "raiz cuadrada":
                if (num1<0) {
                    System.out.println("No se puede calcular la raiz cuadrada de 0");
                    return;
                }
                    resultado=Math.sqrt(num1);
                break;
            case "potencia":
                    resultado=Math.pow(num1, num2);
                break;
            case "modulo":
                    resultado=num1%num2;
                break;
            default:
                System.out.println("Elija una operación");
                lectura.close();// cierra el Scanner
                return;
        }

        System.out.println(resultado);
    }
    public static void main(String[] args) {
        calculadoraCinentifica();
    }
}
