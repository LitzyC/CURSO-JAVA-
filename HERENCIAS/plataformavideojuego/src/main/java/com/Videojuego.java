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
    public VideojuegoRol(String titulo, String desarrolladora, double precio) {
        super(titulo, desarrolladora, precio);
    }
    @Override
    public String getDescripcion() {
        return "Roles.";
    }
}

class VideojuegoDisparos extends Videojuego{
    public VideojuegoDisparos(String titulo, String desarrolladora, double precio) {
        super(titulo, desarrolladora, precio);
    }
    @Override
    public String getDescripcion() {
        return "Disparos.";
    }
}

class VideojuegoPuzzle extends Videojuego{
    public VideojuegoPuzzle(String titulo, String desarrolladora, double precio) {
        super(titulo, desarrolladora, precio);
    }
    @Override
    public String getDescripcion() {
        return "Puzzle.";
    }
}
