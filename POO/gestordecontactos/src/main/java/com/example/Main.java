package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Agenda agregarContacto = new Agenda();
        
        Contacto contacto1= new Contacto("Juan", 123456789,"juani23@gmail.com");
        contacto1.agregarContacto(agregarContacto);
        Contacto contacto2= new Contacto("Pedro", 987654321,"pedrito@gmail");
        contacto2.agregarContacto(agregarContacto);
        Contacto contacto3= new Contacto("Pedro", 987654321,"pedrito@gmail");
        contacto3.agregarContacto(agregarContacto);
        Contacto contacto4= new Contacto("Luisa", 655523245,"luisita@gmail");
        contacto4.agregarContacto(agregarContacto);
        
        List<Contacto> contactos = new ArrayList<>();
        contactos.add(contacto1);
        agregarContacto.agregarContacto(contacto1);
        agregarContacto.agregarContacto(contacto2);
        agregarContacto.agregarContacto(contacto3);
        agregarContacto.agregarContacto(contacto4);
        
        agregarContacto.muestraAgenda();
        




    }
}