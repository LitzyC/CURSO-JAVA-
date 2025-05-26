package com;

import java.util.List;
import java.util.ArrayList;

public class Animal {
        
    String nombre;
    int edad;

    List<Animal> animales;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.animales = new ArrayList<>();

    }

    public void hacerSonido(){
    }

    public void imprimeLista(){
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Pajaro());

        animales.forEach(Animal::hacerSonido);
    }

}

class Perro extends Animal{
    public Perro() {
        super("Perro", 3);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre+" Guau Guau");
    }
}

class Gato extends Animal{
    public Gato() {
        super("Gato", 5);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre + " Miau Miau " + edad);
    }
}

class Pajaro extends Animal{
    public Pajaro() {
        super("Pajaro", 4);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre + " Pio Pio "+ edad);
    }
}
