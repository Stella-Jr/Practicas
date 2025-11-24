package com.mycompany.biblioteca;

public class Usuario {
     private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarPrestamo(Biblioteca biblioteca, String titulo) {
        System.out.println(nombre + " solicita el libro: " + titulo);
        biblioteca.prestarLibro(titulo);
    }
}
