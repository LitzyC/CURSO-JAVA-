package com.example;

public class Exercise5 {
    
    public static void invertirarray() {
        int[] numeros={ 1, 2, 3, 4};

        for (int i = numeros.length - 1; i >= 0; i--) {
            //numeros.length-1 = 4-1=3
            System.out.print(numeros[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        invertirarray();
    }
}
