package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Ingrese un numero positivo");
            return;
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        int numeroMasRepetido = numeros[0];
        int maxRepeticiones = 0;

        for (int i = 0; i < n; i++) {

            int contador = 0;
            boolean yaContado = false;

            // verificar si ya fue contado antes
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    yaContado = true;
                    break;
                }
            }


            if (!yaContado) {

                for (int k = i; k < n; k++) {
                    if (numeros[i] == numeros[k]) {
                        contador++;
                    }
                }

                if (contador > maxRepeticiones) {
                    maxRepeticiones = contador;
                    numeroMasRepetido = numeros[i];
                }
            }
        }



        System.out.println("El numero que mas se repite es: " + numeroMasRepetido);
        System.out.println("Se repite: " + maxRepeticiones + " veces");

        sc.close();
    }
}