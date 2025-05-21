package com.example;

public class Persona {
    private static int idContador = 0;

    private int id;
    private String nombre;
    private int edad;
    private String correo;

    public Persona(String nombre, int edad, String correo) {
        this.id = idContador++;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void muestraPersona(){
        System.out.println("Persona: "+this.nombre+" Edad: " + this.edad +" Correo: " +this.correo);
    }
}
