package com.mycompany.biblioteca;

import java.util.Scanner;

public class MainBiblioteca {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario("Stella");

        biblioteca.agregarLibro(new Libro("El Principito"));
        biblioteca.agregarLibro(new Libro("1984"));
        biblioteca.agregarLibro(new Libro("Martin Fierro"));

        System.out.print("Ingrese el titulo del libro que desea prestar: ");
        String titulo = sc.nextLine();

        usuario.solicitarPrestamo(biblioteca, titulo);
    }
}