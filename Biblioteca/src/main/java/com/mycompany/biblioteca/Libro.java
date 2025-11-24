package com.mycompany.biblioteca;

public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public boolean estaDisponible() {
        return !prestado;
    }

    public void prestar() {
        prestado = true;
    }

    public String getTitulo() {
        return titulo;
    }
}