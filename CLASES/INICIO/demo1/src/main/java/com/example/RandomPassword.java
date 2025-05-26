package com.example;

import java.util.Scanner;

public class RandomPassword {


    private static String generatePassword(int length){
        return generatePassword(length, false);
    }
    
    private static String generatePassword(int length, boolean specialCharacters) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        if(specialCharacters) characters += "!@#$%&/()=?¿/*-^{}<>°¬|¡+_"; //incluye simbolos
        
        java.util.Random random = new java.util.Random();
        String password="";

        for (int i = 0; i < length; i++) {
            //añade un caracter random a la contraseña
            int randomIndex = random.nextInt(characters.length());
            int randomChactarec= characters.charAt(randomIndex);
            password += randomChactarec;
        }

        if (specialChars) {
            //añade un simbolo random a la contraseña
           int randomIndex=random.nextInt(characters.length());
           //char randomCharacter=specialCharacters.charAt(random.);
        }
        return password;
        
    }

    private static boolean assertPasswordLength(String password, int expectedLength) {
        if (password.length() != expectedLength) {
            System.out.println("ERROR: Password length is not correct.");
            return false;
        }
        return true;
    }

    private static boolean assertCharacterRandom(){
        //Chequea que es random
        if(!password.length()==1)return false;

        for(int i =1; i<password.length();i++){
            if(password.charAt(i)==password.charAt(i-1)) return true;
        }

        System.out.println("No es password random.");
        return false;
    }

    private static boolean assertPasswordSymbols(){
        String specialSymbols = "!@#$%&/()=?¿/*-^{}<>°¬|¡+_";
        for(int i = 0; i < password.length(); i++) {
            if(specialSymbols.contains(String.valueOf(password.charAt(i)))) {
                System.out.println("ERROR: Password contains special symbols.");
                return false;
            }
        }
    }

    private static assertPasswordCharacter(String password) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!characters.contains(String.valueOf(c))) { //contains(String.valueOf(c)) convierte el caracter a String
                System.out.println("ERROR: Invalid character in password: " + c);
                return false;
            }
        }
        return true;
    }

    private static boolean assertPasswordIsCorrecto(String password) {
        if (password.length() != 10) {
            System.out.println("ERROR: Password length is not correct.");
            return false;
        }
        if (!assertPasswordLength(password, 10)) return false;
        if (!assertCharacterRandom(password)) return false;
        if (!assertPasswordSymbols(password)) return false;
        if (!assertPasswordCharacter(password)) return false;

        System.out.println("Password is correct.");
        return true;

    }
    
    private static boolean testGeneradorPassword(){
        String password="";

        System.out.println(x:"TESTING PASSWORD GENERATOR");
        System.out.println("Password: " + password);

        if (password.length() != 10) return false;
           /*  System.out.println("ERROR LONGITUD NO CORRECTA.");
            return false; }*/
        if (!assertPasswordLength(password, 18)) return false;
        /*String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!characters.contains(String.valueOf(c))) { //contains(String.valueOf(c)) convierte el caracter a String
                System.out.println("ERROR CARACTER NO VALIDO." + c);
                return false;
            }
        }*/

        if (!assertCharacterRandom(generatePassword(10))) return false;
    }

    public static void manualGeneradorPassword() {
    
    }


    public static void main(String[] args) {
        String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Scanner lectura = new Scanner(System.in);
        System.out.print("¿Cuánta longitud quiere tener la contraseña?");
        int longitud=lectura.nextInt();//Ingresa la longitud


    }

}
