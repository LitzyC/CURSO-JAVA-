package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bebida> bebidas = new ArrayList<>();

        bebidas.add(new Refresco("Coca Cola", "500ml", true));
        bebidas.add(new Zumo("Zumo de Naranja", "300ml", "Naranja"));
        bebidas.add(new Agua("Agua", "1L", true));

        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getDescripcion());
        }
    }
}