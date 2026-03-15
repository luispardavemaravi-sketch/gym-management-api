package com.gymproject.management.practica;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        System.out.print("Digite cuantos numeros quieres sumar: ");
        int numeros = sc.nextInt();
        if (numeros <= 0) {
            System.out.println("ERROR: cantidad invalida");
            return;

        }
        for (int i = 0; i < numeros; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ":");
            int numero = sc.nextInt();
            suma += numero;

        }

        System.out.println("La suma de todos los numeros es: " + suma);

        sc.close();
    }
}
