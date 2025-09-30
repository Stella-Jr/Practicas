package com.mycompany.arbolesygrafos;

import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

class BST {
    Nodo raiz;

    // Insertar un valor
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }

    // Buscar un valor
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;
        return valor < nodo.valor ? buscarRec(nodo.izquierdo, valor) : buscarRec(nodo.derecho, valor);
    }

    // Mostrar el árbol (inorder traversal)
    public void inorder() {
        inorderRec(raiz);
        System.out.println();
    }

    private void inorderRec(Nodo nodo) {
        if (nodo != null) {
            inorderRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorderRec(nodo.derecho);
        }
    }
}

public class ArbolesYGrafos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BST arbol = new BST();
            
            int opcion;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Insertar valor");
                System.out.println("2. Buscar valor");
                System.out.println("3. Mostrar arbol (in-order)");
                System.out.println("0. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa un valor a insertar: ");
                        int valor = sc.nextInt();
                        arbol.insertar(valor);
                    }
                    case 2 -> {
                        System.out.print("Ingresa el valor a buscar: ");
                        int buscar = sc.nextInt();
                        boolean encontrado = arbol.buscar(buscar);
                        if (encontrado) {
                            System.out.println("Valor encontrado en el árbol.");
                        } else {
                            System.out.println("Valor NO encontrado.");
                        }
                    }
                    case 3 -> {
                        System.out.print("Árbol in-order: ");
                        arbol.inorder();
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        }
    }
}
