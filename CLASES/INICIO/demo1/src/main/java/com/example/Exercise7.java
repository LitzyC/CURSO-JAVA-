package com.example;

import java.util.Scanner;

public class Exercise7 {
    
    public static void calculadoraSimple(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa primer número:");
        double num1=lectura.nextDouble();
        
        System.out.println("Ingresa el segundo número:");
        double num2 = lectura.nextDouble();

        System.out.println("Que operación eligirá: ");
        System.out.println("suma | resta | multiplicacion | division ");
        String operacion = lectura.next();

        double resultado=0;

        switch (operacion) {
            case "suma":
                resultado = num1+num2;
                break;
        case "resta":
                resultado = num1 - num2;
                break;
        case "multiplicacion":
                resultado = num1 * num2;
                break;
        case "division":
                if(num2!=0){
                    resultado=num1/num2;
                }else{
                    System.out.println("No se puede dividir.");
                    return;
                }
                break;
        default:
                System.out.println("Elija una operación");
                lectura.close();//cierra el Scanner
                return;
        }

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        calculadoraSimple();
    }
}
