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
        if (energia>100){
            energia=100;
            System.out.println("Tu mascota esta por reventar de tanta comida.");
        }
        felicidad +=10;
        if (felicidad > 100) {felicidad = 100;}
    }

    public void jugar(){
        energia -= 10;
        if(energia>100){energia = 100;}
        
        felicidad += 10;
        if (felicidad > 100) {felicidad = 100;}
        
        if (energia < 0) {
            energia = 0;
            System.out.println("Tu "+nombre +" está muy cansado para jugar.");
        }
    }

    public void mostrarEstado(){
        System.out.println("-------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Felicidad: " + felicidad);
    }

    public void menuVirtual(){
        Scanner lectura = new Scanner (System.in);
        MascotaVirtual mascotaSeleccionada = null;
        
        System.out.println("--- :3 MASCOTA VIRTUAL :3 ---");
        System.out.println(" ");
        System.out.println("--- ELIGE A TU MASCOTA---");
        System.out.println("\n---1.Perro 🐕---");
        System.out.println("---2.Gato 🐈 ---");
        System.out.println("---3.Hamster 🐹 ---");
        System.out.print("\nSeleccione una opción: ");
        int mascotaTipo=lectura.nextInt();
        lectura.nextLine();
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
                lectura.close();
                return;
        }

        int opcion;
        do{
            System.out.println("\n--- Menú de Mascota Virtual ---");
            System.out.println("\n1. Jugar");
            System.out.println("2. Alimentar");
            System.out.println("3. Mostrar Estado");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");
        
            
            opcion=lectura.nextInt();
            
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
            } while (opcion !=4);
        
            System.out.println("\n--- Fin de la Aplicación. ---");
            lectura.close();
    }    
}

class PerroVirtual extends MascotaVirtual{

    public PerroVirtual(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        energia -= 10;
        if (energia>100) {energia = 100;}
        if (energia < 0) {
            energia = 0;
            System.out.println("Tu perrito está muy cansado para jugar.");
            return;
        }
        
        felicidad += 20;
        if (felicidad > 100) {felicidad = 100;}
        
        System.out.println("Tu perrito está jugando");
    }

}

class GatoVirtual extends MascotaVirtual{

    public GatoVirtual(String nombre){
        super(nombre);
    }

    @Override
    public void comer(){
        energia += 20;
        if (energia>100){
            energia=100;
            System.out.println("Tu gatito esta por reventar de tanta comida.");
        }
        felicidad += 10;
        if (felicidad > 100) {felicidad = 100;}
    }
}

class HamsterVirtual extends MascotaVirtual{

    public HamsterVirtual(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        energia -= 30;
        if(energia < 0) {
            energia = 0;
            System.out.println("Tu hámster se agota muy rápido, se más cuidadoso.");
        }
        if(energia > 100) {energia = 100;}
        felicidad += 20;
        if(felicidad > 100) {felicidad = 100;}
    }
}
