package com;

import java.util.Scanner;

public class MascotaVirtual {
    
    String nombre;
    int energia;
    int felicidad;

    public MascotaVirtual(String nombre) {
        this.nombre = nombre;
        this.energia = 100; 
        this.felicidad = 100; 
    }

    public void comer(){
        energia += 10;
        felicidad +=10;
        if (energia>100){
            energia=100;
            System.out.println("Tu mascota esta por reventar de tanta comida.");
        }
    }

    public void jugar(){
        energia -= 10;
        felicidad += 10;
    }

    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Felicidad: " + felicidad);
    }

    public void menuVirtual(){
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("--- :3 MASCOTA VIRTUAL :3 ---");
        System.out.println(" ");
        System.out.println("--- ELIGE A TU MASCOTA---");
        System.out.println("\n---1.Perro 🐕---");
        System.out.println("---2.Gato 🐈 ---");
        System.out.println("---3.Hamster 🐹 ---");
        
        int mascotaTipo=lectura.nextInt();
        lectura.nextLine();
        MascotaVirtual mascotaSeleccionada = null;

        switch (mascotaTipo) {
            case 1:
                mascotaSeleccionada= new PerroVirtual("Perro Virtual");
                break;
            case 2:
                mascotaSeleccionada= new GatoVirtual("Gato Virtual");
                break;
        
            case 3:
                mascotaSeleccionada= new HamsterVirtual("Hamster Virtual");
                break;
        
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }

        do{
            System.out.println("\n--- Menú de Mascota Virtual ---");
            System.out.println("\n1. Jugar");
            System.out.println("2. Alimentar");
            System.out.println("3. Mostrar Estado");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");
            int opcion=lectura.nextInt();

            switch (opcion) {
                    case 1:
                        mascotaSeleccionada.jugar();
                        break;
                    case 2:
                        mascotaSeleccionada.comer();
                        break;
                    case 3:
                        mascotaSeleccionada.mostrarEstado();
                        break;
                    case 4:
                        System.out.println("\nSaliendo de la Mascota Virtual...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            lectura.close();
            System.out.println("\n--- Fin de la Aplicación. ---");
        } while (true);
    }    
}

class PerroVirtual extends MascotaVirtual{

    public PerroVirtual(String nombre){
        super(nombre);
        mostrarEstado();
    }

    @Override
    public void jugar(){
        energia -= 10;
        felicidad += 20;
    }

}

class GatoVirtual extends MascotaVirtual{

    public GatoVirtual(String nombre){
        super(nombre);
        mostrarEstado();
    }

    @Override
    public void comer(){
        energia += 20;
        felicidad += 10;
        if (energia>100){
            energia=100;
            System.out.println("Tu mascota esta por reventar de tanta comida.");
        }
    }
}

class HamsterVirtual extends MascotaVirtual{

    public HamsterVirtual(String nombre){
        super(nombre);
        mostrarEstado();
    }

    @Override
    public void jugar(){
        energia -= 30;
        felicidad += 20;
    }
}
