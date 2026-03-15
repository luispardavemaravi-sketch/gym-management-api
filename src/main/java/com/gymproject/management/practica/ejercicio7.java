package com.gymproject.management.practica;
// Recorrer una colección de datos
//comparar valores
//guardar el mejor resultad

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;


        System.out.println("ingresa la longitud del array: ");
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("error: Ingresa un numero valido");
            return;
        }

        int[] numeros = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }


        int mayor = numeros[0];
        int menor = numeros[0];


        for (int i = 0; i < x; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        double promedio = suma / x;
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero promedio: " + promedio);

        System.out.println("¿Que numero deseas buscar?");
        int numero_buscar = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < x; i++) {
            if (numeros[i] == numero_buscar) {
                System.out.println("El numero es: " + numeros[i]);
                System.out.println("El numero existe en la posicion: " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El numero no existe en la array. ");

        }

        System.out.println("Array invertido:");

        for (int i = x - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }

}

// Recorrer una colección de datos
//comparar valores
//guardar el mejor resultado
// promedio