package com.mycompany.pilasycolas;

import java.util.*;

public class PilasYColas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Implementación de Pila (Stack)
        Stack<Integer> pila = new Stack<>();

        // Implementación de Cola (Queue)
        Queue<Integer> cola = new LinkedList<>();

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Push (Pila)");
            System.out.println("2. Pop (Pila)");
            System.out.println("3. Enqueue (Cola)");
            System.out.println("4. Dequeue (Cola)");
            System.out.println("5. Mostrar estado de Pila y Cola");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un numero para la Pila: ");
                    int numPila = sc.nextInt();
                    pila.push(numPila);
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        System.out.println("Pop de la Pila: " + pila.pop());
                    } else {
                        System.out.println("La Pila esta vacia.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa un numero para la Cola: ");
                    int numCola = sc.nextInt();
                    cola.add(numCola);
                    break;
                case 4:
                    if (!cola.isEmpty()) {
                        System.out.println("Dequeue de la Cola: " + cola.poll());
                    } else {
                        System.out.println("La Cola esta vacía.");
                    }
                    break;
                case 5:
                    System.out.println("Estado actual de la Pila: " + pila);
                    System.out.println("Estado actual de la Cola: " + cola);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}