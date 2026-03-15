package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos numeros deseas ingresar?");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ingrese un numero valido");
            return;
        }

        int[] numeros = new int[n];

        // Guardar numeros
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        // Ordenar de menor a mayor
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (numeros[i] > numeros[j]) {

                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;

                }
            }
        }

        // Mostrar array ordenado
        System.out.println("Numeros ordenados de menor a mayor:");

        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}