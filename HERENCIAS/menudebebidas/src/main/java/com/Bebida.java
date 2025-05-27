package com;
public class Bebida {
    
    String nombre;
    String tamano;

    public Bebida(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }  
    
    public String getDescripcion() {
        return "Bebida: " + nombre + ", Tamaño: " + tamano;
    }
    
}

class Refresco extends Bebida{
    private boolean conGas;

    public Refresco(String nombre, String tamano, boolean conGas) {
        super(nombre, tamano);
        this.conGas = conGas;
    }
    
    @Override
    public String getDescripcion() {
        return "Refresco: " + nombre + ", Tamaño: " + tamano + ", Con gas: " + (conGas ? "Sí" : "No");
    }
}


class Zumo extends Bebida{
    private String fruta;

    public Zumo(String nombre, String tamano, String fruta) {
        super(nombre, tamano);
        this.fruta = fruta;
    }
    
    @Override
    public String getDescripcion() {
        return "Zumo: " + nombre + ", Tamaño: " + tamano + ", Fruta: " + fruta;
    }
}

class Agua extends Bebida{
    private boolean mineral;

    public Agua(String nombre, String tamano, boolean mineral) {
        super(nombre, tamano);
        this.mineral = mineral;
    }
    
    @Override
    public String getDescripcion() {
        return "Agua: " + nombre + ", Tamaño: " + tamano + ", Agua Mineral: " + (mineral ? "Sí" : "No");
    }
}