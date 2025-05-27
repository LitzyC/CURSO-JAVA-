package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        listaTareas.add(new Tarea("Hacer Matmáticas |","Ejercicios 1 - 10 |",true));
        listaTareas.add(new Tarea("Hacer ejercicios |","Correr 5min |",false));
        listaTareas.add(new Tarea("Cocinar |"," Preparar la Merienda |",true));
        
        System.out.println("----TODAS LAS TAREAS----");
        for (Tarea tarea : listaTareas) {
            tarea.mostrar();
        }

        int completadas=0;
        for (Tarea tarea : listaTareas) {
            if (tarea.marcarTarea()) {
                completadas++;
            }
        }

        System.out.println("TAREAS COMPLETADAS: " + completadas);
        
        System.out.println("TAREAS PENDIENTES: ");

        for(Tarea tarea:listaTareas){
            if(!tarea.marcarTarea()){
                tarea.mostrar();
            }
        }
    
    }
}