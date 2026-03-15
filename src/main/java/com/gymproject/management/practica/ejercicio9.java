package com.gymproject.management.practica;
/*
Crear un programa que:
Pida n números
Los guarde en un array
Cuente cuántos números son pares
Cuente cuántos números son impares
Muestre el resultado
 */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la longitud del array: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Error: Ingrese un numero positivo");
            return;
        }

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Hay: " + pares + " numeros pares");
        System.out.println("Hay: " + impares + " numeros impares");


        sc.close();


    }
}
