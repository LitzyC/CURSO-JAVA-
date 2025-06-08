package com;

public class Main {
    public static void main(String[] args) {
        Recetario recetario = new Recetario();
        
        Receta recetaSalada = new RecetaSalada("Ensalada César");
        Receta recetaDulce = new RecetaDulce("Tarta de Manzana");

        recetaDulce.agregarIngrediente(new Ingrediente("Manzana", 2, "unidades"));
        recetaDulce.agregarIngrediente(new Ingrediente("Azúcar", 100, "gramos"));
        
        recetaDulce.agregarPaso("Precalentar el horno a 180 grados.");
        recetaDulce.agregarPaso("Pelar y cortar las manzanas.");
        recetaDulce.agregarPaso("Mezclar las manzanas con el azúcar.");
        recetaDulce.agregarPaso("Verter la mezcla en un molde y hornear durante 30 minutos.");
        
        
        recetaSalada.agregarIngrediente(new Ingrediente("Lechuga", 1, "unidad"));
        recetaSalada.agregarIngrediente(new Ingrediente("Pollo", 200, "gramos"));
        recetaSalada.agregarIngrediente(new Ingrediente("Queso Parmesano", 50, "gramos"));
        recetaSalada.agregarIngrediente(new Ingrediente("Aderezo César", 100, "ml"));

        recetaSalada.agregarPaso("Lavar y trocear la lechuga.");
        recetaSalada.agregarPaso("Cocinar el pollo a la parrilla y cortarlo en tiras.");
        recetaSalada.agregarPaso("Rallar el queso parmesano.");
        recetaSalada.agregarPaso("Mezclar todos los ingredientes en un bol y añadir el aderezo.");

        recetario.agregarReceta(recetaDulce);
        recetario.agregarReceta(recetaSalada);

       
    }
}