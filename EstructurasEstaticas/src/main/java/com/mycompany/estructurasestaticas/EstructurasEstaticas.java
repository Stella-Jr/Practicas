package com.mycompany.estructurasestaticas;

public class EstructurasEstaticas {
    public static void main(String[] args) {
        
        // Es la variable unica que guarda un solo valor
        int edad = 21;
        System.out.println("Edad: " + edad);
        
        // Arreglo unidimensional es como una fila de casilleros
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Arreglo unidimensional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
        
        // Arreglo bidimensional es como una tabla (3 filas x 3 columnas)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Arreglo bidimensional (matriz 3x3):");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
    }
}