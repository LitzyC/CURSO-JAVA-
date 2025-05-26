package main.java.com.example;

public class Exercise16 {
    // Dado un texto, mostrar: número de caracteres, palabras
    //palabra más larga, número de
    //vocales y si es palíndromo.

    public static void analisistexto(){
        String texto = "Anita lava la tina";
        String[] palabras = texto.split(" ");
        int numCaracteres = texto.length();
        int numPalabras = palabras.length;
        String palabraMasLarga = "";
        int numVocales = 0;

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
            for (char c : palabra.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    numVocales++;
                }
            }
        }

        boolean esPalindromo = texto.replaceAll(" ", "").equalsIgnoreCase(new StringBuilder(texto.replaceAll(" ", "")).reverse().toString());

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Palabra más larga: " + palabraMasLarga);
        System.out.println("Número de vocales: " + numVocales);
        System.out.println("Es palíndromo: " + esPalindromo);
    }
    public static void main(String[] args) {
        analisistexto();
    }
}