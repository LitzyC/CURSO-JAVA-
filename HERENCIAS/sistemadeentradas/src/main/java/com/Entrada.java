package com;

abstract class Entrada {
    String evento;
    double precioBase;

    public Entrada(String evento, double precioBase) {
        this.evento=evento;
        this.precioBase=precioBase;
    }

    abstract double calcularPrecioFinal();

    public String getEvento() {
        return evento;
    }

    public double getPrecioBase() {
        return precioBase;
    }

}

class EntradaEstandar extends Entrada {
    public EntradaEstandar(String evento, double precioBase) {
        super(evento, precioBase);
    }

    @Override
    double calcularPrecioFinal() {
        return precioBase;
    }
}

class EntradaVip extends Entrada{
    double recargoVIP;

    public EntradaVip(String evento, double precioBase, double recargoVIP) {
        super(evento, precioBase);
        this.recargoVIP = recargoVIP;
    }

    @Override
    double calcularPrecioFinal() {
        return precioBase + (precioBase*recargoVIP);
    }
}

class EntradaConDescuento extends Entrada{
    double porcentajeDescuento;

    public EntradaConDescuento(String evento, double precioBase, double porcentajeDescuento) {
        super(evento, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    double calcularPrecioFinal() {
        return precioBase-(precioBase * porcentajeDescuento);
    }
}

