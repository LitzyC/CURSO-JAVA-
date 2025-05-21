package com.example;

import java.util.ArrayList;
import java.util.List;

public class Gestor {
    
    List<Persona> personas;

    public Gestor() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }
}
