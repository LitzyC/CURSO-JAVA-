package com.example;

import java.util.ArrayList;
import java.util.List;

public class Gestor {

    List<Persona> listPersonas;

    public Gestor() {
        this.listPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.listPersonas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona p : listPersonas) {
            System.out.println(p);
        }
    }

}
