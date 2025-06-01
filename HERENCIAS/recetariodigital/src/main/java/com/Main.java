package com;

public class Main {
    public static void main(String[] args) {
        Receta recetaDulce = new RecetaDulce("Tarta de Manzana");

        recetaDulce.agregarIngrediente(new Ingrediente("Manzana", 2, "unidades"));
        recetaDulce.agregarIngrediente(new Ingrediente("Azúcar", 100, "gramos"));
        
        recetaDulce.agregarPaso("Precalentar el horno a 180 grados.");
        recetaDulce.agregarPaso("Pelar y cortar las manzanas.");
        recetaDulce.agregarPaso("Mezclar las manzanas con el azúcar.");
        recetaDulce.agregarPaso("Verter la mezcla en un molde y hornear durante 30 minutos.");
        
        System.out.println(recetaDulce.descripcionReceta());

       
    }
}