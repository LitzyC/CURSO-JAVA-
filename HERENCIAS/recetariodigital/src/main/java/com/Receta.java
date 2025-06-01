package com;

import java.util.ArrayList;

public abstract class Receta {
    protected String nombre;
    protected ArrayList<Ingrediente> ingredientes;
    protected ArrayList<String> pasos;
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }
    
    public Receta(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
    }
    
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }
    
    public void agregarPaso(String paso) {
        pasos.add(paso);
    }
    
    public abstract String descripcionReceta();
}
class RecetaDulce extends Receta{

    public RecetaDulce(String nombre){
        super(nombre);
    }

    @Override
    public String descripcionReceta(){
        return "Receta Dulce: "+ nombre + " con " 
        + ingredientes.size() + " ingredientes y ";
    }
}

class RecetaSalada extends Receta{

    public RecetaSalada(String nombre){
        super(nombre);
    }

    @Override
    public String descripcionReceta(){
        return "Receta Salada: "+ nombre + " con " 
        + ingredientes.size() + " ingredientes y ";
    }
}