

import java.util.Scanner;

public class Clase {
    
    private static int recursionFactorial(int n){
        //Caso base
        if(n<=1){
            return 1;
        }
        //Caso Recursion
        return n*recursionFactorial(n-1);
    }

    private static int iterativeFactorial(int n){
        int resultado=1;
        for (int i = 1; i <=n; i++) {
            resultado *=i;
        }
        return resultado;
    }

    public static int factorial(int n){
        return iterativeFactorial(n);
    }

    
    private static boolean assertEquals(int expect, int actual){
        return expect == actual;
    }

    private static void testFactorial(){
        if(!assertEquals(factorial(5), 120)){
            System.out.println("Bad test - factorial: " + factorial(5));
            return;
        }
        if(!assertEquals(factorial(0), 1)){
            System.out.println("Bad test - factorial: " + factorial(0));
            return;
        }
        if(!assertEquals(factorial(1), 1)){
            System.out.println("Bad test - factorial: " + factorial(1));
            return;
        }
        if(!assertEquals(factorial(10), 3628800)){
            System.out.println("Bad test - factorial: " + factorial(10));
            return;
        }
        System.out.println("All test passed");
    }

    private static void manualTest(){
        System.out.println("Ingresa el numero: ");
        Scanner lectura = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Factorial de "+n+ " es " +factorial(n));
        scanner.close();
    }
    
    public static void main(String[] args) {
        testFactorial();
        //manualTest();
    }
}
