package com;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Ing.Sarah", 27,"Ingeniería de Software");
        
        Curso curso = new Curso();
        curso.profesor = profesor;
        curso.nombreCurso = "Programación Avanzada";
        curso.estudiantes = new java.util.ArrayList<>(); 
        curso.agregarEstudiante();
        curso.mostrarParticipantes(); 
        

    }
}