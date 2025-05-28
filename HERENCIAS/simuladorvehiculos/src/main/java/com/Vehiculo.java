package com;

public class Vehiculo {
    String marca;
    int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }   

    public void setMarca(String marca){
        this.marca=marca;;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void arrancar(){
        System.out.println("El vehiculo arrancando...");
    }
    
    public void detener(){
        System.out.println("El vehiculo deteniéndose...");
    }
}


class Coche extends Vehiculo {
    String coche;
    public Coche(String marca, int anio, String coche) {
        super(marca, anio);
        this.coche = coche;
    }
    
    public void arrancar(){
        System.out.println("El coche " + coche + " de marca " + marca + " y año " + anio + " está arrancando...");
    }

    public void detener() {
        System.out.println("El coche se está deteniendo...");   
    }
}

class Moto extends Vehiculo{
    String moto;
    public Moto(String marca, int anio, String moto) {
        super(marca, anio);
        this.moto = moto;
    }

    public void arrancar(){
        System.out.println("La moto " + moto + " de marca " + marca + " y año " + anio + " lista para rodar...");
    }
    public void detener(){
        System.out.println("La moto se está deteniendo...");
    }

}

class Bicicleta extends Vehiculo {
    String bicicleta;
    public Bicicleta(String marca, int anio, String bicicleta) {
        super(marca, anio);
        this.bicicleta = bicicleta;
    }

    @Override
    public void arrancar(){
        System.out.println("La bicicleta " + bicicleta + " de marca " + marca + " y año " + anio + " no necesita arrancar...");
    }
   
    @Override
    public void detener(){
        System.out.println("La bicicleta se está deteniendo...");
    }
    
}