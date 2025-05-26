package com.example;

import java.util.ArrayList;
import java.util.List;

public class Carta {
    
    List<Plato> platos;

    public Carta(List<Plato> platos) {
        this.platos = new ArrayList<>();

    }

    public boolean platoExiste(int platoId) {
        for (Plato plato : this.platos) {
            if (plato.getId() == platoId) {
                return true;
            }
        }
        return false;
    }

    public void addPlato(Plato plato) throws IllegalArgumentException {
        if(plato == null) {
            throw new IllegalArgumentException("El plato no puede ser nulo");
        }
        int platoId = plato.getId();
        if (this.platos.contains(platoId)){
            throw new IllegalArgumentException("El plato ya existe en la carta");
        }
        this.platos.add(plato);
    }

    public Plato getPlato(int platoId){
        for(Plato plato:this.platos){
            if(plato.getId()==platoId){
                return plato;
            }
            return null;
        }


    }
}
