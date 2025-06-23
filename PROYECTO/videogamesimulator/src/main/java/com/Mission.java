package com;

public class Mission {
    String nombre;
    int duracion;
    int prioridad;
    
    public Mission(String nombre, int duracion, int prioridad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void prioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void experienciaRequerida(){
    }
}

class MisionExploracion extends Mission{
    public MisionExploracion(String nombre, int duracion, int prioridad) {
        super(nombre, duracion, prioridad);
    }
}

class MisionRecoleccionDatos extends Mission{
    public MisionRecoleccionDatos(String nombre, int duracion, int prioridad) {
        super(nombre, duracion, prioridad);
    }
}

class MisionColonizacion extends Mission{
    public MisionColonizacion(String nombre, int duracion, int prioridad) {
        super(nombre, duracion, prioridad);
    }
}