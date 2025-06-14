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
    private int duracionHistoria;
    
    public VideojuegoRol(String titulo, String desarrolladora, double precio, int duracionHistoria) {
        super(titulo, desarrolladora, precio);
        this.duracionHistoria = duracionHistoria;
    }
    @Override
    public String getDescripcion() {
        return "Videojuego de Rol. Duración de la historia: " + duracionHistoria + " horas.";
    }
}

class VideojuegoDisparos extends Videojuego{
    private boolean modosMultijugador;

    public VideojuegoDisparos(String titulo, String desarrolladora, double precio, boolean modosMultijugador) {
        super(titulo, desarrolladora, precio);
        this.modosMultijugador = modosMultijugador;
    }
    @Override
    public String getDescripcion() {
        return "Videojuego de Disparos: " + titulo + (modosMultijugador ? " con modos multijugador." : " sin modo de multijugador.");
    }
}

class VideojuegoPuzzle extends Videojuego{
    private int numeroNiveles;

    public VideojuegoPuzzle(String titulo, String desarrolladora, double precio, int numeroNiveles) {
        super(titulo, desarrolladora, precio);
        this.numeroNiveles = numeroNiveles;
    }

    @Override
    public String getDescripcion() {
        return "Videojuego de Puzzle: " + titulo + "con " + numeroNiveles + " niveles.";
    }
}
