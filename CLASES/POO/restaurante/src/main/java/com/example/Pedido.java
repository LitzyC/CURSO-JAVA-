package com.example;

import java.util.List;

public class Pedido {
    enum EstadoPedido {
        PENDIENTE,
        EN_PREPARACION,
        ENTREGADO
    }

    private static int idContador = 1;

    private String id;
    private List<Plato> platos;
    private String clienteId;
    private Estado estado;

    public Pedido(String id, List<Plato> platos, String clienteId) {
        this.id = idContador++;
        this.platos = platos;
        this.clienteId = clienteId;
        this.estado = EstadoPedido.PENDIENTE; // Inicialmente el pedido está pendiente
    }

    public void entregar() {
        this.estado=EstadoPedido.ENTREGADO; // Lógica para entregar el pedido
    }

    public String getId() {
        return this.id;
    }

    public List<Plato> getPlatos() {
        return platos;
    }   

    public int getClienteId() {
        return this.clienteId;
    }

    public EstadoPedido getEstado() {
        return this.estado;
    }
}
