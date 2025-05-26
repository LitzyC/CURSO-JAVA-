package com.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private static int idContador = 1;

    List<Carta> carta; //carta del restaurante
    List<Pedido> pedidos; //lista de pedidos
    List<Clientes> clientes;


    public Restaurante(){
        this.carta = new Carta();
        this.pedidos=new ArrayList<>()
        this.clientes = new ArrayList<>();
    }


    public void crearPedido(List<Plato> platos, int clienteId) {
        
        Pedido  pedido = new Pedido(idContador++, platos, clienteId);
        this.pedidos.add(pedido);
    }





    public void addCliente(Clientes cliente)  {
        if(clienteExiste(cliente.getId())){
            throw new IllegalArgumentException("El cliente ya existe");
            return;
        }

    }
}
