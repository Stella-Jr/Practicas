package com.mycompany.tiposdeestructuras;

public class TiposDeEstructuras {
    public static void main(String[] args) {
        
        // Estructura secuencial: definición del arreglo
        int[] numeros = {10, 25, -5, 40, 7, 100, -20};

        // Inicializamos valores
        int mayor = numeros[0];   // asumimos que el primero es el mayor
        int menor = numeros[0];   // asumimos que el primero es el menor
        int suma = 0;

        // Estructura repetitiva: recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            int actual = numeros[i];
            
            // Estructura condicional: comparar mayor y menor
            if (actual > mayor) {
                mayor = actual;
            }
            if (actual < menor) {
                menor = actual;
            }

            // Acumular la suma
            suma += actual;
        }

        // Estructura secuencial: mostrar resultados
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Suma de los numeros: " + suma);
    }
}