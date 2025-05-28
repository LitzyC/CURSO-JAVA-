package com;

import java.util.List;

public class Curso {
    String nombreCurso;
    Profesor profesor;
    List<Estudiante> estudiantes;

    public void agregarEstudiante(){
        Estudiante e = new Estudiante("Juan", 20, "5to Semestre");
        Estudiante e2 = new Estudiante("Ana", 22, "1er Semestre");
        Estudiante e3 = new Estudiante("Luis", 21, "3er Semestre"); 
        estudiantes.add(e);
        estudiantes.add(e2);
        estudiantes.add(e3);
    }

    public void mostrarParticipantes(){
        System.out.println("Profesor: " + profesor.nombre);
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.nombre + ", Edad: " + estudiante.edad + ", Grado: " + estudiante.grado);
        }
    }
}
