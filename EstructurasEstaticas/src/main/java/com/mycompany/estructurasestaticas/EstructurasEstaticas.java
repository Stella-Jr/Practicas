package com.mycompany.estructurasestaticas;

public class EstructurasEstaticas {

    public static void main(String[] args) {
        
        // Variable única
        int numero = 10;
        System.out.println("Variable unica: " + numero);

        // Arreglo unidimensional
        int[] arreglo1D = {5, 10, 15, 20};
        System.out.println("\nArreglo unidimensional:");
        for (int i = 0; i < arreglo1D.length; i++) {
            System.out.println("indice " + i + ": " + arreglo1D[i]);
        }

        // Arreglo bidimensional (matriz)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("\nArreglo bidimensional:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // salto de línea entre filas
        }
    }
}