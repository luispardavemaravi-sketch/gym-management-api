package com.gymproject.management.practica;
/*
10
1️⃣ Pida n números
2️⃣ Los guarde en un array
3️⃣ Encuentre cuántas veces se repite cada número
 */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la longitud del array:");
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
        //3️⃣ Encuentre cuántas veces se repite cada número

        for (int i = 0; i < n; i++) {

            boolean yaContado = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    yaContado = true;
                    break;

                }
            }

            if(!yaContado){
                int contador = 0;
                for(int k = 0 ; k < n; k++){
                    if(numeros[i] == numeros[k]){
                        contador++;
                    }
                }
                System.out.println("El numero " + numeros[i] + " se repite " + contador + " veces");
            }


        }


        sc.close();


    }
}