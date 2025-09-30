package com.mycompany.tiposdeestructuras;

public class TiposDeEstructuras {
    public static void main(String[] args) {
        // se declara el arreglo
        int[] numeros = {15, 8, 23, 4, 42, 16};
        // se inicializa
        int mayor = numeros[0];
        int menor = numeros[0];
        int suma = 0;
        // se recorre el arreglo con un bucle for
        for (int i = 0; i < numeros.length; i++) {
            int actual = numeros[i];
            
            // se compara para hallar el mayor
            if (actual > mayor) {
                mayor = actual;
            }
            // se compara para hallar el menor
            if (actual < menor) {
                menor = actual;
            }
            // se acumula la suma
            suma += actual;
        }
        // se muestran los resultados
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Suma total: " + suma);
    }
}