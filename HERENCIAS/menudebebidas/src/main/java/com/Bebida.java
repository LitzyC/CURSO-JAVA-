package com;

import java.util.ArrayList;
import java.util.List;

public class Bebida {
    
    String nombre;
    String tamano;
    List<Bebida> bebidas;

    public Bebida(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.bebidas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }  
    
    
    public void imprimeBebidas(){
        bebidas.add(new Refresco("Coca Cola", "500ml", true));
        bebidas.add(new Zumo("Zumo de Naranja", "300ml", "Naranja"));
        bebidas.add(new Agua("Agua", "1L", true ));
    }
    
    public String getDescripcion(String nombre, String tamano, boolean conGas) {
        return "Refresco: " + nombre + ", Tamaño: " + tamano + ", Con gas: " + conGas;
    }
    
}

class Refresco extends Bebida{
    boolean conGas;

    public Refresco(String nombre, String tamano, boolean conGas) {
        super(nombre, tamano);
        
        if (this.conGas == true) {
            System.out.println("Refresco: " + nombre + ", Tamaño: " +
            tamano + ", Con gas: Sí." );
        } else {
            System.out.println("Refresco: " + nombre + ", Tamaño: " +
            tamano + ", Con gas: No." );
        }
        
    }
}


class Zumo extends Bebida{
    String fruta;

    public Zumo(String nombre, String tamano, String fruta) {
        super(nombre, tamano);
        System.out.println("Zumo: " + nombre + ", Tamaño: " +
        tamano + ", Fruta: " + fruta);
    }
}

class Agua extends Bebida{
    boolean mineral;

    public Agua(String nombre, String tamano, boolean mineral) {
        super(nombre, tamano);
        
        if (this.mineral == true) {
            System.out.println("Refresco: " + nombre + ", Tamaño: " +
            tamano + ", Agua Mineral: Sí" );
        } else {
            System.out.println("Refresco: " + nombre + ", Tamaño: " +
            tamano + ", Agua Mineral: No." );
        }
    }
}