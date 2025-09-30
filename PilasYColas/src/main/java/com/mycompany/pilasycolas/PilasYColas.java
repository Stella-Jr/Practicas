package com.mycompany.pilasycolas;

import java.util.*;

public class PilasYColas {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        
        // con el push se agregan elementos
        pila.push("Churro 1");
        pila.push("Churro 2");
        pila.push("Churro 3");
        
        System.out.println("Estado de la pila: " + pila);
        
        // se elimina el último elemento
        String ultimo = pila.pop();
        System.out.println("Elemento desapilado (pop): " + ultimo);
        System.out.println("Pila despues del pop: " + pila);
        
        Queue<String> cola = new LinkedList<>();
        
        // se agregan elementos
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
        
        System.out.println("Estado de la cola: " + cola);
        
        // se elimina el primer elemento
        String primero = cola.poll();
        System.out.println("Cliente atendido (dequeue): " + primero);
        System.out.println("Cola despues del dequeue: " + cola);
    }
}