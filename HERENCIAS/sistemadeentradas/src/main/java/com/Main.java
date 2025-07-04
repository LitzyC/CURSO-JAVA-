package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Entrada> entradas = new ArrayList<>();
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int opcion;
        do{
            System.out.println("-----------------------------");
            System.out.println("SELECCIONE SU ENTRADA");
            System.out.println("1. Entrada Estandar.");
            System.out.println("2. Entrada VIP.");
            System.out.println("3. Entrada con Descuento.");
            System.out.println("4. Mostrar las Entradas.");
            System.out.println("5. Salir.");
            opcion=lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    agregarEntradaEstandar();
                    break;
                case 2:
                    agregarEntradaVip();
                    break;
                case 3:
                    agregarEntradaConDescuento();
                    break;
                case 4:
                    mostrarEntradas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }   while(opcion!=5);
    }

    static void agregarEntradaEstandar(){
        System.out.println("Ingrese el nombre del evento:");
        String evento=lectura.nextLine();
        
        System.out.println("Ingrese el precio de la entrada:");
        double precioBase = lectura.nextDouble();
        lectura.nextLine();
        
        entradas.add(new EntradaEstandar(evento, precioBase));
        System.out.println("Entrada Estandar agregada: " + evento + " con: " + precioBase);
    }

    static void agregarEntradaVip(){
        System.out.println("Ingrese el nombre del evento");
        String evento = lectura.nextLine();
        
        System.out.println("Ingrese el precio de la entrada:");
        double precioBase = lectura.nextDouble();
        lectura.nextLine();
        
        System.out.println("Ingrese el recargo VIP en porcentaje en decimal, por ejemplo, 0.2 para 20%:");
        double recargoVIP = lectura.nextDouble();
        lectura.nextLine();

        entradas.add(new EntradaVip(evento, precioBase, recargoVIP));
        System.out.println("Entrada VIP agregada: " + evento );
    }

    static void agregarEntradaConDescuento(){
        System.out.println("Ingrese el nombre del evento:");
        String evento = lectura.nextLine();
        
        System.out.println("Ingrese el precio de la entrada:");
        double precioBase = lectura.nextDouble();
        
        System.out.println("Ingrese el porcentaje de descuento en decimal, por ejemplo, 0.1 para 10%:");
        double porcentajeDescuento = lectura.nextDouble();
        
        entradas.add(new EntradaConDescuento(evento, precioBase, porcentajeDescuento));
        System.out.println("Entrada con Descuento agregada: " + evento);
    }

    static void mostrarEntradas(){
        if (entradas.isEmpty()){
            System.out.println("No hay entradas en el registro.");
            return;
        }
        System.out.println("-----------------------------");
        System.out.println("----Entradas registradas.----");
        for(Entrada entrada : entradas){
            System.out.println("Tipo de Entrada: " + entrada.getClass().getSimpleName());
            System.out.println("Evento: " + entrada.getEvento());
            System.out.println("Precio Base: " + entrada.getPrecioBase());
            System.out.println("Precio Final: " + entrada.calcularPrecioFinal());
            System.out.println("-----------------------------");
        }
    }
}