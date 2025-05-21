package com.example;

public class Plato {
    private static int idContador = 1;

    private String nombre;
    private double precio;
    private int id;

    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idContador++;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
