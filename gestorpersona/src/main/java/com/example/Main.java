package com.example;

public class Main {
    public static void main(String[] args) {
        Gestor gestoria= new Gestor();
        
        Persona persona1 = new Persona("Juan", 25, "juanito@hotmail.com");
        gestoria.agregarPersona(persona1);
        Persona persona2 = new Persona("Juan", 25, "juanito@hotmail.com");
        gestoria.agregarPersona(persona2);
        Persona persona3 = new Persona("Juan", 25, "juanito@hotmail.com");
        gestoria.agregarPersona(persona3);
        Persona persona4 = new Persona("Juan", 25, "juanito@hotmail.com");
        gestoria.agregarPersona(persona4);

    }
}