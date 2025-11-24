package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public boolean prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.estaDisponible()) {
                libro.prestar();
                System.out.println("El libro \"" + titulo + "\" fue prestado con exito.");
                return true;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no esta disponible.");
        return false;
    }
}