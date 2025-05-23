package com.example;

public class Contacto {
    
    private String nombre;
    private int telefono;
    private String email;

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarContacto(Agenda Agenda){
        System.out.println(" ");
        System.out.println("CONTACTO: ");
        System.out.println(" ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);   
    }
}

