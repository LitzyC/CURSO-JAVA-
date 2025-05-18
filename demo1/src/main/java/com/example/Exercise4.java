package com.example;

public class Exercise4 {
    
    public static void numeromayor(){
        int[] numeros={3,7,2,9};
        //int[] --- significa que es un array
        int nummayor = numeros[0];
        int posicion=0;

        for (int i = 1; i < numeros.length; i++) {
            //Recorremos el array
            
            if (numeros[i] > nummayor) {
                // El numero mas grande lo guardamos en numayor
                nummayor = numeros[i];
                posicion=i;
                //Luego guardamos el numayor en la posicion i
            }
        }
        System.out.println("El número mayor es: "+nummayor);
        System.out.println("La posición del número es: "+posicion);
    }
    public static void main(String[] args) {
        numeromayor();
    }
}
