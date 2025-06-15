package com;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=====================================");
        Jugador jugador1=new Jugador("Israel", 21);
        
        Videojuego juegoRol = new VideojuegoRol("The Legend of Zelda: Breath of the Wild", "Un juego de aventura en un mundo abierto.", 60, 40);
        Videojuego juegoDisparos = new VideojuegoDisparos("Call of Duty: Modern Warfare", "Un juego de disparos en primera persona.", 50, true);
        Videojuego juegoPuzzle= new VideojuegoPuzzle("Portal 2", "Un juego de rompecabezas en primera persona.", 30, 20);

        jugador1.comprarVideojuego(juegoDisparos);
        jugador1.comprarVideojuego(juegoRol);
        jugador1.comprarVideojuego(juegoPuzzle);

        jugador1.jugarVideojuego("Call of Duty: Modern Warfare", 2);
        jugador1.jugarVideojuego("Portal 2", 5);
        jugador1.jugarVideojuego("The Legend of Zelda: Breath of the Wild", 3);
        jugador1.jugarVideojuego("Dragon Quest", 2);

        jugador1.mostrarEstadisticas();

        System.out.println("\n Gracias por jugar, " + jugador1.getNombre() + "!");
        System.out.println("\n FIN DEL JUEGO.");
        System.out.println("=====================================");
    }
}