package com.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    List<Contacto> contactos;

    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    
    public boolean contactoExiste(int telefono){
        for(Contacto contacto: contactos){
            if(contacto.getTelefono() ==telefono){
                System.out.println("Este teléfono pertenece a otro contacto.");
                return true;
            }
        }
        return false;
    }

    private boolean emailExiste(String email) {
        for (Contacto contacto : contactos) {
            if (contacto.getEmail().equals(email)) {
                System.out.println("Este email pertenece a otro contacto.");
                return true;
            }
        }
        return false;
    }
    
    public void agregarContacto(Contacto contacto){
        if(contactoExiste(contacto.getTelefono()) || emailExiste(contacto.getEmail())){
            System.out.println("Este contacto ya existe en la agenda.");
            System.out.println(" ");
            return;
        }
        this.contactos.add(contacto);
    }

    public String buscarContacto(String nombre){
        for (Contacto contacto : contactos){
           if (contacto.getNombre().equals(nombre)){
                return contacto.getNombre() + " " + contacto.getTelefono() + " " + contacto.getEmail();
            }
        }
        return "El nombre: "+ nombre+" No existe en la agenda.";
    }

 
    
    public void muestraAgenda(){
        System.out.println("------------------");
        System.out.println("CONTACTOS EN LA AGENDA: ");
        for(Contacto contacto: this.contactos){
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Telefono: " + contacto.getTelefono());
            System.out.println("Email: " + contacto.getEmail());
            System.out.println(" ");
        }
    }
}
