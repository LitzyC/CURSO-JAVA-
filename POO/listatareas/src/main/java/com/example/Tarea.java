package com.example;

public class Tarea {
    enum Estado {
        PENDIENTE,
        COMPLETADA
    }

    String titulo;
    String descripcion;
    boolean estado;

    public Tarea(String titulo, String descripcion,boolean estado){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.estado=false;
    }

    public void marcarTarea(){
        this.estado=true;
    }

    public void mostrar(){
        String completo=estado?"Tarea Completada":"Pendiente";
        System.out.println("Título: "+titulo+ " Descripción: "+descripcion+completo);
    }
}
