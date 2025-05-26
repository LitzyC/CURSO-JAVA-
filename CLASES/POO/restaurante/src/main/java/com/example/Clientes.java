package com.example;

public class Clientes {
    

    private static int idContador = 1;

    private int id;
    private String nombre;



    public Clientes(String nombre) {
        this.id = idContador++;
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }


}
