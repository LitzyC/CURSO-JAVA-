package com.example;

import java.util.Scanner;

public class Exercise11 {
    
    public static void contadorPalabras(){
            Scanner lectura = new Scanner(System.in);
            //Lee los datos que ingresamos.
            System.out.println("Ingresa la frase: ");
            String frase = lectura.nextLine().toLowerCase(); 
            //Se guarda el dato que introducimos en la frase.
            
            int contador = 0; //Contamos las vocales
            int a=0, e=0, i=0, o=0, u=0; //Contamos cada vocal
    
            for(char letra : frase.toCharArray()){
                //Recorremos letra por letra.
                // frase.toCharArray() --- Convierte la frase en un arreglo de caracteres : ["h", "o","l","a"]
                
                if ("aeiouAEIOU".indexOf(letra) != -1) {
                    contador++;
                }
                //Contador de todas las vocales
    
                switch (letra) {
                    case 'a': a++;break;
                    case 'e':e++;break;
                    case 'i':i++;break;
                    case 'o':o++;break;
                    case 'u':u++;break;
                }
                //Contador de cada vocal con un switch, un menu de opciones.
                
            }
            String[] palabras = frase.trim().split("\\s+");
            //Se usa para manejar los espacios entre palabras
            //trim() elimina los espacios al inicio y al final
            int totalPalabras=palabras.length;
            
            int palabraVocal=0; //palabras que empiecen con la Vocal

            for (String palabra : palabras){
                //Recorre el arreglo por elemento y en cada iteraccion
                //palabra toma el valor del arreglo
                if (!palabra.isEmpty()) {
                    //Verifica que la cadena no este vacia
                    char primeraLetra=palabra.charAt(0);
                    //Obtiene el primer caracter de la primera letra

                    if ("aeiou".indexOf(primeraLetra)!=-1) {
                        //Comprueba que la primera letra sea una vocal
                        palabraVocal++;
                    }
                }
            }

            System.out.println("Número de vocales: " + contador);
            //debe ir fuera, si no se repetirá
            System.out.println("a:"+a);
            System.out.println("e:"+e);
            System.out.println("i:"+i);
            System.out.println("o:"+o);
            System.out.println("u:"+u);
            System.out.println("Total de palabras: "+ totalPalabras);
            System.out.println("Palabras que empiezan con vocal: " + palabraVocal);
}
    public static void main(String[] args) {
        contadorPalabras();
    }
}
