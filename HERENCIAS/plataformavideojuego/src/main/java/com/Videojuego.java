package com;

public abstract class Videojuego {
    String titulo;
    String desarrolladora;
    double precio;

    public Videojuego(String titulo, String desarrolladora, double precio) {
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDesarrolladora() {
        return desarrolladora;
    }
    public double getPrecio() {
        return precio;
    }
    public abstract String getDescripcion();

}

class VideojuegoRol extends Videojuego{

}

class VideojuegoDisparos extends Videojuego{

}

class VideojuegoPuzzle extends Videojuego{

}
