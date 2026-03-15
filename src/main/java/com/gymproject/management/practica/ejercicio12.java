package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //1️⃣ pida n números
        System.out.print("Digite la longitud de la array: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: Ingrese un numero positivo");
        }

        // 2️⃣ los guarde en un array
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + i + 1 + ":");
            numeros[i] = sc.nextInt();
        }

        // 3️⃣ elimine los números duplicados
        for (int i = 0; i < n; i++) {
            boolean repetido = false;

            for (int j = 0; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }

                if (!repetido) {
                    System.out.println(numeros[i]);
                }
            }
        }
        sc.close();

    }
}
