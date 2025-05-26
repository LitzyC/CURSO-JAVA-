package com.example;

public class Empleado {
    
    private int id;
    private String empleado;
    private String email;
    private String nombre;


    public void describir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Cargo: " + empleado);
    }



}

private class InnerEmpleado extends Empleado {
    
    private String departamento;

    
}

