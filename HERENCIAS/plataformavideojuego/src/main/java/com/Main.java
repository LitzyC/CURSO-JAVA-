package com;

public class Main {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (system.in);
Plataforma plataforma= new Plataforma();

        System.out.println("=====================================");
       
Jugador jugador1=new Jugador("Israel", 21);
        
        //Videojuego juegoRol = new VideojuegoRol("The Legend of Zelda: Breath of the Wild", "Un juego de aventura en un mundo abierto.", 60, 40);
        Videojuego juegoDisparos = new VideojuegoDisparos("Call of Duty: Modern Warfare", "Un juego de disparos en primera persona.", 50, true);
        Videojuego juegoPuzzle= new VideojuegoPuzzle("Portal 2", "Un juego de rompecabezas en primera persona.", 30, 20);

        //jugador1.comprarVideojuego(juegoDisparos);
        //jugador1.comprarVideojuego(juegoRol);
        //jugador1.comprarVideojuego(juegoPuzzle);

        //jugador1.jugarVideojuego("Call of Duty: Modern Warfare", 2);
        //jugador1.jugarVideojuego("Portal 2", 5);
        //jugador1.jugarVideojuego("The Legend of Zelda: Breath of the Wild", 3);
       // jugador1.jugarVideojuego("Dragon Quest", 2);

        //jugador1.mostrarEstadisticas();
       

plataforma.registrarVideojuego(VideojuegoRol("The Legend of Zelda: Breath of the Wild", "Un juego de aventura en un mundo abierto.", 60, 40));

        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar nuevo jugador");
            System.out.println("2. Mostrar catálogo de videojuegos");
            System.out.println("3. Comprar videojuego para un jugador");
            System.out.println("4. Simular partida (jugar)");
            System.out.println("5. Ver estadísticas de un jugador");
            System.out.println("6. Ver ranking de jugadores");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del jugador: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad del jugador: ");
                    int edad = lectura.nextInt();
                    lectura.nextLine();
                    plataforma.registrarJugador(new Jugador(nombre, edad));
                    break;
                case 2:
                    plataforma.mostrarCatalogo();
                    break;
                case 3:
                    System.out.print("Nombre del jugador: ");
                    String comprador = sc.nextLine();
                    System.out.print("Título del videojuego: ");
                    String juego = sc.nextLine();
                    plataforma.comprarJuego(comprador, juego);
                    break;
                case 4:
                    System.out.print("Nombre del jugador: ");
                    String jugador = sc.nextLine();
                    System.out.print("Título del videojuego: ");
                    String titulo = sc.nextLine();
                    System.out.print("Horas a jugar: ");
                    int horas = lectura.nextInt();
                    lectura.nextLine();
                    plataforma.simularJuego(jugador, titulo, horas);
                    break;
                case 5:
                    System.out.print("Nombre del jugador: ");
                    String buscado = lectura.nextLine();
                    plataforma.verEstadisticasJugador(buscado);
                    break;
                case 6:
                    plataforma.mostrarRankingJugadores();
                    break;
                case 7:
                    System.out.println("Gracias por usar la plataforma. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 7);

        lectua.close();
    }

System.out.println("\n Gracias por jugar, " + jugador1.getNombre() + "!");
        System.out.println("\n FIN DEL JUEGO."); System.out.println("=====================================");
    }
}