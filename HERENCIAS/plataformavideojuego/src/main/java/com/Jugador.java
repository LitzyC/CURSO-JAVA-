package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Jugador {
    String nombre;
    int edad;
    ArrayList<Videojuego> videojuegosComprados;
    HashMap <String, Integer> horasJugadas;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.videojuegosComprados = new ArrayList<>();
        this.horasJugadas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void comprarVideojuego(Videojuego juego){
        videojuegosComprados.add(juego);
        //System.out.println("\n ¡Has comprado un nuevo videojuego!");
        System.out.println("Has comprado el videojuego: " + juego.getTitulo());
    }
    
    public void jugarVideojuego(String titulo, int horas){
        boolean tieneJuego = false;
        for (Videojuego juego : videojuegosComprados) {
            if (juego.getTitulo().equals(titulo)) {
                tieneJuego = true;
                break;
            }
        }
        
        if(!tieneJuego) {
            System.out.println("======================================");
            System.out.println("No tienes el videojuego: " + titulo);
            return;
        }
        horasJugadas.put(titulo, horasJugadas.getOrDefault(titulo, 0) + horas);
        System.out.println("======================================");
        System.out.println("Has jugado " + horas + " horas al videojuego: " + titulo);
    }
    public void mostrarEstadisticas(){
        System.out.println("\n Estadisticas de " + nombre+":");
        System.out.println("Juegos Comprados:");

        for (Videojuego juego : videojuegosComprados) {
            System.out.println("- " + juego.getTitulo() + " | " + juego.getDescripcion() + "|");
        }

        System.out.println("\nHoras Jugadas:");
        for (String titulo : horasJugadas.keySet()) {
            System.out.println("- " + titulo + ": " + horasJugadas.get(titulo) + " horas");
        }
    }
}
