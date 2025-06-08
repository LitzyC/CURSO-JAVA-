package com;

import java.util.ArrayList;

public class Recetario {
    private ArrayList<Receta> recetas;

    public Recetario() {
        this.recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    public void mostrarRecetas(){
        System.out.println("Recetas disponibles:");
        for(Receta receta : recetas){
            String tipo=receta instanceof RecetaDulce ? "Dulce" : "Salada";
            System.out.println(receta.getNombre() + " (" + tipo + ") " + receta.getIngredientes().size() + " ingredientes)");
        }
    }

    public void mostrarIntrucciones(String nombreBuscar){
        for (Receta receta : recetas) {
        if(receta.getNombre().equalsIgnoreCase(nombreBuscar)) {
            System.out.println("Nombre: "+ receta.getNombre());
            System.out.println("Ingredientes:");
            

            for(Ingrediente ingrediente : receta.getIngredientes()) {
                System.out.println(ingrediente.getCantidad()+" "+ingrediente.getUnidad()+" de "+ingrediente.getNombre());
            }
    
            System.out.println("Pasos a seguir:");
            int pasoNumero = 1;
            for(String paso : receta.getPasos()) {
                System.out.println(pasoNumero + ". " + paso);
                pasoNumero++;
            }
            return;
        }
        System.out.println("Receta no encontrada: " + nombreBuscar);
    }
}
}
