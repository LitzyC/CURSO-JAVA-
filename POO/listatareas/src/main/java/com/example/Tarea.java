package com.example;

public class Tarea {
    enum Estado {
        PENDIENTE,
        COMPLETADA
    }

    String titulo;
    String descripcion;
    private Estado estado;

    private static Tarea tarea1;
    private static Tarea tarea2;
    private static Tarea tarea3;

    public Tarea(String titulo, String descripcion,boolean estaCompletada) {
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.estado=estaCompletada? Estado.COMPLETADA : Estado.PENDIENTE;
    }

    public boolean marcarTarea(){
        return this.estado == Estado.COMPLETADA;
    }

    public void mostrar(){
        String tareaEstado = (estado == Estado.COMPLETADA) ? "Tarea Completada" : "Tarea Pendiente";
        System.out.println("Título: " + titulo + " Descripción: " + descripcion + tareaEstado);
    }


    private static boolean assertEquals(boolean esperado, boolean actual){
        return esperado == actual;
    }

    private static void testTareaCompleta(){
        if(!assertEquals(true, tarea1.marcarTarea())){
            System.out.println("Error: Test tarea completada.");
        } else {
            System.out.println("Funciona el test de tarea completada.");
        }
    }

    private static void testTareaPendiente(){
        if(!assertEquals(false, tarea2.marcarTarea())){
            System.out.println("Error: Test tarea pendiente.");
        } else {
            System.out.println("Funciona el test de tarea pendiente.");
        }
    }

    private static void testMarcarTarea(){
        if(!assertEquals(true, tarea3.marcarTarea())){
            System.out.println("Error: Test marcar la tarea.");
        } else {
            System.out.println("Funciona el test de marcar tarea.");
        }
    }

    private static void testTarea() {
        tarea1 = new Tarea("Hacer Matmáticas |", "Ejercicios 1 - 10 |", true);
        tarea2 = new Tarea("Hacer ejercicios |", "Correr 5min |", false);
        tarea3 = new Tarea("Cocinar |", "Preparar la Merienda |", true);

        testMarcarTarea();
        testTareaCompleta();
        testTareaPendiente();
    }

    public static void main(String[] args) {
        testTarea();
    }
}
